package openevent;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jasminb.jsonapi.JSONAPIDocument;
import com.github.jasminb.jsonapi.ResourceConverter;
import openevent.model.Event;
import openevent.model.Microlocation;
import openevent.model.api.ApiEvent;
import openevent.model.api.ApiMicrolocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        //Event Deserialization
        oldModelDeserialization("event");
        newModelDeserialization("event");

        System.out.println("");

        //Microlocations Deserialization
        oldModelDeserialization("microlocations");
        newModelDeserialization("microlocations");
    }

    private static void oldModelDeserialization(String string) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            switch (string) {
                case "event":
                    Event event = objectMapper.readValue(getFile("event.json"), Event.class);
                    System.out.println(event.toString());
                    break;
                case "microlocations":
                    List<Microlocation> mircolocations = objectMapper.readValue(getFile("microlocations.json"), new TypeReference<List<Microlocation>>() {
                    });
                    System.out.println(mircolocations.toString());
                    break;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static void newModelDeserialization(String string) {
        ResourceConverter converter = new ResourceConverter(ApiEvent.class, ApiMicrolocation.class);

        switch (string) {
            case "event":
                JSONAPIDocument<ApiEvent> eventDocument = converter.readDocument(getInputStream("api/event.json"), ApiEvent.class);
                ApiEvent event = eventDocument.get();
                System.out.println(event.toString());
                break;
            case "microlocations":
                JSONAPIDocument<List<ApiMicrolocation>> microlocationDocumentCollection = converter.readDocumentCollection(getInputStream("api/microlocations.json"), ApiMicrolocation.class);
                List<ApiMicrolocation> microlocation = microlocationDocumentCollection.get();
                System.out.println(microlocation.toString());
                break;
        }
    }

    private static InputStream getInputStream(String fileName) {
        return Application.class.getResourceAsStream("/" + fileName);
    }

    private static String getFile(String fileName) {
        InputStream is = getInputStream(fileName);

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String read;

        try {
            while ((read = br.readLine()) != null) {
                sb.append(read).append("\n");
            }

            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return sb.toString();

    }
}
