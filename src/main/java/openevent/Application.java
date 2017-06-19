package openevent;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jasminb.jsonapi.JSONAPIDocument;
import com.github.jasminb.jsonapi.ResourceConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import openevent.model.Event;
import openevent.model.Microlocation;
import openevent.model.Session;
import openevent.model.SessionType;
import openevent.model.Speaker;
import openevent.model.Sponsor;
import openevent.model.Track;
import openevent.model.api.ApiEvent;
import openevent.model.api.ApiMicrolocation;
import openevent.model.api.ApiSession;
import openevent.model.api.ApiSessionType;
import openevent.model.api.ApiSpeaker;
import openevent.model.api.ApiSponsor;
import openevent.model.api.ApiTrack;

public class Application {

    public static void main(String[] args) {

        //Event Deserialization
        oldModelDeserialization("event");
        newModelDeserialization("event");

        System.out.println("");

        //Microlocations Deserialization
        oldModelDeserialization("microlocations");
        newModelDeserialization("microlocations");
        
        System.out.println("");
        
        //Sponsor Deserialization
        oldModelDeserialization("sponsors");
        newModelDeserialization("sponsors");

        System.out.println("");

        //Track Deserialization
        oldModelDeserialization("tracks");
        newModelDeserialization("tracks");

        System.out.println("");

        //SessionType Deserialization
        oldModelDeserialization("session_types");
        newModelDeserialization("session_types");

        System.out.println("");

        //Session Deserialization
        oldModelDeserialization("sessions");
        newModelDeserialization("sessions");

        System.out.println("");

        //Speakers Deserialization
        oldModelDeserialization("speakers");
        newModelDeserialization("speakers");
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
                case "sponsors":
                	List<Sponsor> sponsors = objectMapper.readValue(getFile("sponsors.json"),new TypeReference<List<Sponsor>>() {
                    });
                	System.out.println(sponsors.toString());
                	break;
                case "tracks":
                    List<Track> tracks = objectMapper.readValue(getFile("tracks.json"), new TypeReference<List<Track>>() {
                    });
                    System.out.println(tracks);
                    break;
                case "session_types":
                    List<SessionType> sessionTypes = objectMapper.readValue(getFile("session_types.json"), new TypeReference<List<SessionType>>() {
                    });
                    System.out.println(sessionTypes);
                    break;
                case "sessions":
                    List<Session> sessions = objectMapper.readValue(getFile("sessions.json"), new TypeReference<List<Session>>() {
                    });
                    System.out.println(sessions);
                    break;
                case "speakers":
                    List<Speaker> speakers = objectMapper.readValue(getFile("speakers.json"), new TypeReference<List<Speaker>>() {
                    });
                    System.out.println(speakers);
                    break;
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static void newModelDeserialization(String string) {
        ResourceConverter converter = new ResourceConverter(ApiEvent.class, ApiMicrolocation.class, ApiTrack.class, ApiSessionType.class, ApiSession.class, ApiSponsor.class, ApiSpeaker.class);

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
            case "sponsors":
            	JSONAPIDocument<List<ApiSponsor>> sponsorDocumentCollection = converter.readDocumentCollection(getInputStream("api/sponsors.json"), ApiSponsor.class);
                List<ApiSponsor> sponsor = sponsorDocumentCollection.get();
                System.out.println(sponsor.toString());
                break;
            case "tracks":
                JSONAPIDocument<List<ApiTrack>> trackDocumentCollection = converter.readDocumentCollection(getInputStream("api/tracks.json"), ApiTrack.class);
                List<ApiTrack> tracks = trackDocumentCollection.get();
                System.out.println(tracks.toString());
                break;
            case "session_types":
                JSONAPIDocument<List<ApiSessionType>> sessionTypeDocumentCollection = converter.readDocumentCollection(getInputStream("api/session_types.json"), ApiSessionType.class);
                List<ApiSessionType> sessionTypes = sessionTypeDocumentCollection.get();
                System.out.println(sessionTypes.toString());
                break;
            case "sessions":
                JSONAPIDocument<List<ApiSession>> sessionDocumentCollection = converter.readDocumentCollection(getInputStream("api/sessions.json"), ApiSession.class);
                List<ApiSession> sessions = sessionDocumentCollection.get();
                System.out.println(sessions.toString());
                break;
            case "speakers":
                JSONAPIDocument<List<ApiSpeaker>> speakerDocumentCollection = converter.readDocumentCollection(getInputStream("api/speakers.json"), ApiSpeaker.class);
                List<ApiSpeaker> speakers = speakerDocumentCollection.get();
                System.out.println(speakers.toString());
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
