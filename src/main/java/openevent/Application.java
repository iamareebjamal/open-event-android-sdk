package openevent;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jasminb.jsonapi.JSONAPIDocument;
import com.github.jasminb.jsonapi.ResourceConverter;
import openevent.model.*;
import openevent.model.api.*;

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
            application.doModelDeserialization(Event.class, ApiEvent.class, "event", false);

            //Microlocations Deserialization
            application.doModelDeserialization(Microlocation.class, ApiMicrolocation.class, "microlocations", true);

            //Sponsor Deserialization
            application.doModelDeserialization(Sponsor.class, ApiSponsor.class, "sponsors", true);

            //Track Deserialization
            application.doModelDeserialization(Track.class, ApiTrack.class, "tracks", true);

            //SessionType Deserialization
            application.doModelDeserialization(SessionType.class, ApiSessionType.class, "session_types", true);

            //Session Deserialization
            application.doModelDeserialization(Session.class, ApiSession.class, "sessions", true);

            //Speakers Deserialization
            application.doModelDeserialization(Speaker.class, ApiSpeaker.class, "speakers", true);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private <T, V> void doModelDeserialization(Class<T> oldType, Class<V> newType, String jsonSource, boolean isList) throws IOException {
        oldModelDeserialization(oldType, jsonSource, isList);
        newModelDeserialization(newType, jsonSource, isList);
        System.out.println();
    }

    private <T> void oldModelDeserialization(Class<T> type, String jsonSource, boolean isList) throws IOException {
        String path = jsonSource + ".json";
        if (isList) {
            List<T> items = objectMapper.readValue(getFile(path), new TypeReference<List<T>>() {});
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
