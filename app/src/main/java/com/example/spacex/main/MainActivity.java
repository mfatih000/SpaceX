package com.example.spacex.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.spacex.R;
import com.example.spacex.databinding.ActivityMainBinding;
import com.example.spacex.model.RocketListResponseDto;
import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private RocketViewModel rocketViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        rocketViewModel = new RocketViewModel();

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(rocketViewModel);
        activityMainBinding.executePendingBindings();

        listView = findViewById(R.id.rocket_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.textview);
        listView.setAdapter(adapter);

        rocketViewModel.getRocketNames().observe(this, new Observer<List<String>>() {
            @Override
            public void onChanged(List<String> names) {
                adapter.clear();
                adapter.addAll(names);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = (String)adapterView.getItemAtPosition(i);
                if(rocketViewModel.getRocketMap().getValue() != null
                    && rocketViewModel.getRocketMap().getValue().containsKey(value)) {
                    RocketListResponseDto rocketData = rocketViewModel.getRocketMap().getValue().get(value);
                    Intent intent = new Intent(MainActivity.this, RocketDetailActivity.class);
                    intent.putExtra("detail",new Gson().toJson(rocketData));
                    startActivity(intent);
                }
            }
        });
    }
}