package com.example.spacex.main;

import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.collection.ArraySet;
import androidx.databinding.BaseObservable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.spacex.model.RocketListResponseDto;
import com.example.spacex.retrofit.RocketRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RocketViewModel extends BaseObservable {

    private MutableLiveData<List<String>> rocketNames;

    private MutableLiveData<Map<String, RocketListResponseDto>> rocketMap;
    private RocketRepository rocketRepository;

    public RocketViewModel() {
        rocketNames = new MutableLiveData<>();
        rocketNames.setValue(new ArrayList<>());
        rocketMap = new MutableLiveData<>();
        rocketMap.setValue(new HashMap<>());
        rocketRepository = new RocketRepository();
        fetchRocketData();
    }

    private void fetchRocketData() {
        rocketRepository.loadRockets(new Callback<List<RocketListResponseDto>>() {
            @Override
            public void onResponse(Call<List<RocketListResponseDto>> call, Response<List<RocketListResponseDto>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<RocketListResponseDto> rocketList = response.body();
                    HashMap<String, RocketListResponseDto> tempMap = new HashMap<>();
                    List<String> tempList = new ArrayList<>();
                    for(RocketListResponseDto rocket : rocketList){
                        tempMap.put(rocket.getName(), rocket);
                        tempList.add(rocket.getName());
                    }
                    rocketMap.postValue(tempMap);
                    rocketNames.postValue(tempList);
                }
            }

            @Override
            public void onFailure(Call<List<RocketListResponseDto>> call, Throwable t) {
                Log.e("RocketRepository", "Failed to load rockets", t);
            }
        });
    }

    public MutableLiveData<List<String>> getRocketNames() {
        return rocketNames;
    }

    public MutableLiveData<Map<String, RocketListResponseDto>> getRocketMap() {
        return rocketMap;
    }

}