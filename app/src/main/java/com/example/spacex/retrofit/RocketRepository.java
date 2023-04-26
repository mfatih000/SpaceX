package com.example.spacex.retrofit;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.spacex.model.RocketListResponseDto;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RocketRepository {
    private static final String BASE_URL = "https://api.spacexdata.com/v4/";

    private SpaceXService spaceXService;

    public RocketRepository() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        spaceXService = retrofit.create(SpaceXService.class);
    }

    public void loadRockets(Callback<List<RocketListResponseDto>> callback) {
        spaceXService.getRockets().enqueue(callback);
    }
}
