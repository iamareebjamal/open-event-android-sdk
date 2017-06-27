package openevent.network;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jasminb.jsonapi.retrofit.JSONAPIConverterFactory;
import okhttp3.OkHttpClient;
import openevent.model.*;
import retrofit2.Retrofit;

import java.util.concurrent.TimeUnit;

public class APIClient {

    private static final int CONNECT_TIMEOUT_MILLIS = 20 * 1000; // 15s

    private static final int READ_TIMEOUT_MILLIS = 50 * 1000; // 20s

    private final APIService apiService;

    public APIClient() {

        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient().newBuilder()
                .connectTimeout(CONNECT_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS)
                .readTimeout(READ_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);

        OkHttpClient okHttpClient = okHttpClientBuilder.build();
        ObjectMapper objectMapper = new ObjectMapper();
        Class[] classes = {Event.class, Track.class, Speaker.class, Sponsor.class, Session.class, Microlocation.class};

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Urls.BASE_URL)
                .addConverterFactory(new JSONAPIConverterFactory(objectMapper, classes))
                .client(okHttpClient)
                .build();

        apiService = retrofit.create(APIService.class);
    }

    public APIService getApiService() {
        return apiService;
    }
}
