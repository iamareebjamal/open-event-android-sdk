package openevent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jasminb.jsonapi.JSONAPIDocument;
import com.github.jasminb.jsonapi.ResourceConverter;
import openevent.model.*;

import java.io.IOException;
import java.util.List;

import static openevent.utils.IOUtils.getFile;
import static openevent.utils.IOUtils.getInputStream;

public class Application {

    private ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) {
        Application application = new Application();

        try {
            //Event Deserialization
            application.doModelDeserialization(Event.class, "event", false);

            //Microlocations Deserialization
            application.doModelDeserialization(Microlocation.class, "microlocations", true);

            //Sponsor Deserialization
            application.doModelDeserialization(Sponsor.class, "sponsors", true);

            //Track Deserialization
            application.doModelDeserialization(Track.class, "tracks", true);

            //SessionType Deserialization
            application.doModelDeserialization(SessionType.class, "session_types", true);

            //Session Deserialization
            application.doModelDeserialization(Session.class, "sessions", true);

            //Speakers Deserialization
            application.doModelDeserialization(Speaker.class, "speakers", true);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private <T, V> void doModelDeserialization(Class<T> type, String jsonSource, boolean isList) throws IOException {
        oldModelDeserialization(type, jsonSource, isList);
        newModelDeserialization(type, jsonSource, isList);
        System.out.println();
    }

    private <T> void oldModelDeserialization(Class<T> type, String jsonSource, boolean isList) throws IOException {
        String path = jsonSource + ".json";
        if (isList) {
            List<T> items = objectMapper.readValue(getFile(path), objectMapper.getTypeFactory().constructCollectionType(List.class, type));
            System.out.println(items.toString());
        } else {
            T item = objectMapper.readValue(getFile(path), type);
            System.out.println(item.toString());
        }
    }

    private <T> void newModelDeserialization(Class<T> type, String jsonSource, boolean isList) throws IOException {
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
