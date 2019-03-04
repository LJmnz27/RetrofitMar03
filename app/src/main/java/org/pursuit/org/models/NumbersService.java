package org.pursuit.org.models;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NumbersService {

    @GET("0/math?json")
    Call<Numbers> getNumbers();
}
