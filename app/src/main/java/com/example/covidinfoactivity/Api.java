package com.example.covidinfoactivity;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://disease.sh/";

    @GET("v3/covid-19/all")
    Call<Covid> getCovidAll();
}
