package com.example.guiaturistica;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface TurismoService {
    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @GET("jj37-fvz6.json")
    Call<ArrayList<Sitios>> getData();


}
