package openevent.network;

import openevent.model.*;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface APIService {

    @GET("../69")
    Call<Event> getEvent();

    @GET("tracks?include=sessions&fields[session]=title")
    Call<List<Track>> getTracks();

    @GET("speakers")
    Call<List<Speaker>> getSpeakers();

    @GET("sponsors")
    Call<List<Sponsor>> getSponsors();

    @GET("sessions?include=microlocation,track&fields[microlocation]=name&fields[track]=name")
    Call<List<Session>> getSessions();

    @GET("microlocations")
    Call<List<Microlocation>> getMicrolocations();
}
