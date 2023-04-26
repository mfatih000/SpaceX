package com.example.spacex.retrofit;

import com.example.spacex.model.RocketListResponseDto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SpaceXService {
    @GET("rockets")
    Call<List<RocketListResponseDto>> getRockets();
}
