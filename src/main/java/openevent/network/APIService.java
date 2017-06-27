package openevent.network;

import openevent.model.*;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface APIService {

    @GET("event.json")
    Call<Event> getEvent();

    @GET("tracks.json")
    Call<List<Track>> getTracks();

    @GET("speakers.json")
    Call<List<Speaker>> getSpeakers();

    @GET("sponsors.json")
    Call<List<Sponsor>> getSponsors();

    @GET("sessions.json")
    Call<List<Session>> getSessions();

    @GET("microlocations.json")
    Call<List<Microlocation>> getMicrolocations();
}
