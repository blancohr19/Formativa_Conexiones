package com.example.guiaturistica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    String baseUrl;
    Retrofit retrofit;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> municipios = new ArrayList<>();
        baseUrl = "https://datos.gov.co/resource/";
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TurismoService service = retrofit.create(TurismoService.class);
        Call<ArrayList<Sitios>> places= service.getData();
        context=this;
        places.enqueue(new Callback<ArrayList<Sitios>>() {
            @Override
            public void onResponse(Call<ArrayList<Sitios>> call, Response<ArrayList<Sitios>> response) {
                if (response != null && response.body() !=null)
                {
                    ArrayList<Sitios> turistPlaces = response.body();
                    turistPlaces.forEach((place)->{
                        Log.i("APP",place.getNombremunicipio());
                        Log.i("APP",place.getNombresitio());
                        municipios.add(place.getNombremunicipio());
                    });
                    PlaceAdapter adapter= new PlaceAdapter(turistPlaces);
                    RecyclerView recyclerView = findViewById(R.id.recycler_view);
                    recyclerView.addItemDecoration(new DividerItemDecoration(context,  LinearLayoutManager.VERTICAL));
                    LinearLayoutManager layoutManager = new  LinearLayoutManager(context);
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Sitios>> call, Throwable t) {
            }
        });
    }
    }
