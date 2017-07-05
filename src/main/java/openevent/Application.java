package openevent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jasminb.jsonapi.JSONAPIDocument;
import com.github.jasminb.jsonapi.ResourceConverter;
import openevent.model.*;
import openevent.network.DataDownloadManager;

import java.io.IOException;
import java.util.List;

import static openevent.utils.IOUtils.getFile;
import static openevent.utils.IOUtils.getInputStream;

public class Application {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {

        testLocalJsonDeserialization();
        testLocalOrgaJsonDeserialization();

        System.out.println("----------------------------------------------------------------------------------");

        testServerResponseDeserialization();
    }

    private static void testLocalOrgaJsonDeserialization() {
        try {
            newModelDeserialization(User.class, "user", false);
            newModelDeserialization(Ticket.class, "tickets", true);
            newModelDeserialization(EventInvoice.class, "event-invoices", true);
            newModelDeserialization(Attendee.class, "attendees", true);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static void testLocalJsonDeserialization() {
        try {
            //Event Deserialization
            doModelDeserialization(Event.class, "event", false);

            //Microlocations Deserialization
            doModelDeserialization(Microlocation.class, "microlocations", true);

            //Sponsor Deserialization
            doModelDeserialization(Sponsor.class, "sponsors", true);

            //Track Deserialization
            doModelDeserialization(Track.class, "tracks", true);

            //SessionType Deserialization
            doModelDeserialization(SessionType.class, "session_types", true);

            //Session Deserialization
            doModelDeserialization(Session.class, "sessions", true);

            //Speakers Deserialization
            doModelDeserialization(Speaker.class, "speakers", true);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static void testServerResponseDeserialization() {
        DataDownloadManager.getInstance().downloadEvent();
        DataDownloadManager.getInstance().downloadTracks();
        DataDownloadManager.getInstance().downloadMicrolocations();
        DataDownloadManager.getInstance().downloadSponsors();
        DataDownloadManager.getInstance().downloadSessions();
        DataDownloadManager.getInstance().downloadSpeakers();
    }
    
    private static <T> void doModelDeserialization(Class<T> type, String jsonSource, boolean isList) throws IOException {
        oldModelDeserialization(type, jsonSource, isList);
        newModelDeserialization(type, jsonSource, isList);
        System.out.println();
    }

    private static <T> void oldModelDeserialization(Class<T> type, String jsonSource, boolean isList) throws IOException {
        String path = jsonSource + ".json";
        if (isList) {
            List<T> items = objectMapper.readValue(getFile(path), objectMapper.getTypeFactory().constructCollectionType(List.class, type));
            System.out.println(items.toString());
        } else {
            T item = objectMapper.readValue(getFile(path), type);
            System.out.println(item.toString());
        }
    }

    private static <T> void newModelDeserialization(Class<T> type, String jsonSource, boolean isList) throws IOException {
        String path = "api/" + jsonSource + ".json";
        ResourceConverter converter = new ResourceConverter(type);
        if (isList) {
            JSONAPIDocument<List<T>> document = converter.readDocumentCollection(getInputStream(path), type);
            System.out.println(document.get());
        } else {
            JSONAPIDocument<T> document = converter.readDocument(getInputStream(path), type);
            System.out.println(document.get());
        }
    }
}
