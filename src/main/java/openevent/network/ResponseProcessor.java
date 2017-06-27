package openevent.network;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResponseProcessor<T> implements Callback<T> {
    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.isSuccessful()) {
            System.out.println(response.body());
        } else {
            System.out.println(response.raw());
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable throwable) {
        System.out.println(throwable.toString());
    }
}
