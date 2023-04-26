package com.example.spacex.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.spacex.R;
import com.example.spacex.model.FirstStage;
import com.example.spacex.model.PayloadWeight;
import com.example.spacex.model.RocketListResponseDto;
import com.example.spacex.model.SecondStage;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Cleaner;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class RocketDetailActivity extends AppCompatActivity {

    TextView rocketName,rocketCompany,rocketCountry,rocketHeight,rocketMass,rocketDiameter,rocketFirstStage,
    rocketSecondStage,rocketEngine,rocketLandingLegs,rocketDescription,rocketPayload,rocketFlight;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocket_detail);

        imageView=findViewById(R.id.imageId);

        rocketName =findViewById(R.id.txt1);
        rocketCompany=findViewById(R.id.txtCompany);
        rocketCountry=findViewById(R.id.txtCountry);
        rocketHeight=findViewById(R.id.txtHeight);
        rocketMass=findViewById(R.id.txtMass);
        rocketDiameter=findViewById(R.id.txtDiameter);
        rocketFirstStage=findViewById(R.id.txt_first_stage);
        rocketSecondStage=findViewById(R.id.txt_second_stage);
        rocketEngine=findViewById(R.id.txtEngine);
        rocketLandingLegs=findViewById(R.id.txt_landing_legs);
        rocketDescription=findViewById(R.id.txt_description);
        rocketPayload=findViewById(R.id.txt_payload);
        rocketFlight=findViewById(R.id.txt_first_flight);
        Intent intent=getIntent();
        String json=intent.getStringExtra("detail");
        RocketListResponseDto rocketListResponseDto=new Gson().fromJson(json, RocketListResponseDto.class);


        if (rocketListResponseDto != null) {

            String url=rocketListResponseDto.getFlickrImages().get(0);
            Glide.with(this).load(url).into(imageView);

            rocketName.setText(rocketListResponseDto.getName());
            rocketCompany.setText(rocketListResponseDto.getCompany());
            rocketCountry.setText(rocketListResponseDto.getCountry());
            rocketHeight.setText("Feet: "+rocketListResponseDto.getHeight().getFeet().toString()+"\nMeter: "+rocketListResponseDto.getHeight().getMeters().toString());
            rocketMass.setText("Kg: "+rocketListResponseDto.getMass().getKg().toString()+"\nLb: "+rocketListResponseDto.getMass().getLb().toString());
            rocketDiameter.setText("Feet: "+rocketListResponseDto.getDiameter().getFeet().toString()+"\nMeter: "+rocketListResponseDto.getDiameter().getFeet().toString());

            if (rocketListResponseDto.getFirstStage() != null) {
                FirstStage firstStage = rocketListResponseDto.getFirstStage();
                rocketFirstStage.setText(
                        "Burn Time Second: " + (firstStage.getBurnTimeSec() != null ? firstStage.getBurnTimeSec().toString() : "") +
                        "\nEngines: " + (firstStage.getEngines() != null ? firstStage.getEngines().toString() : "") +
                        "\nReusable: " + (firstStage.getReusable() != null ? firstStage.getReusable().toString() : "") +
                        "\nFuel Amount: " + (firstStage.getFuelAmountTons() != null ? firstStage.getFuelAmountTons().toString() : "") +
                        "\nThrust Vacuum(kN): " + (firstStage.getThrustVacuum() != null && firstStage.getThrustVacuum().getkN() != null ? firstStage.getThrustVacuum().getkN().toString() : "") +
                        "\nThrust Vacuum(Lbf): " + (firstStage.getThrustVacuum() != null && firstStage.getThrustVacuum().getLbf() != null ? firstStage.getThrustVacuum().getLbf().toString() : ""));
            }

            if (rocketListResponseDto.getSecondStage() != null) {
                SecondStage secondStage = rocketListResponseDto.getSecondStage();
                rocketSecondStage.setText(
                        "Burn Time Second: " + (secondStage.getBurnTimeSec() != null ? secondStage.getBurnTimeSec().toString() : "") +
                        "\nEngine: " + (secondStage.getEngines() != null ? secondStage.getEngines().toString() : "") +
                        "\nReusable: " + (secondStage.getReusable() != null ? secondStage.getReusable().toString() : "") +
                        "\nFuel Amount: " + (secondStage.getFuelAmountTons() != null ? secondStage.getFuelAmountTons().toString() : "") +
                        "\nThrust Vacuum(kN): " + (secondStage.getThrust() != null && secondStage.getThrust().getkN() != null ? secondStage.getThrust().getkN().toString() : "") +
                        "\nThrust Vacuum(Lbf): " + (secondStage.getThrust() != null && secondStage.getThrust().getLbf() != null ? secondStage.getThrust().getLbf().toString() : ""));


            }


            List<PayloadWeight> payloadWeights = rocketListResponseDto.getPayloadWeights();
            if(payloadWeights != null) {
                int size = payloadWeights.size();
                if(size > 0 && payloadWeights.get(0) != null) {
                    rocketPayload.setText("\nId: "+payloadWeights.get(0).getId().toString()+
                            "\nName: "+payloadWeights.get(0).getName().toString()+
                            "\nKg: "+payloadWeights.get(0).getKg().toString()+
                            "\nLb: "+payloadWeights.get(0).getLb().toString()
                    );
                }
                if(size > 1 && payloadWeights.get(1) != null) {
                    rocketPayload.append("\n\nId: "+payloadWeights.get(1).getId().toString()+
                            "\nName: "+payloadWeights.get(1).getName().toString()+
                            "\nKg: "+payloadWeights.get(1).getKg().toString()+
                            "\nLb: "+payloadWeights.get(1).getLb().toString()
                    );
                }
                if(size > 2 && payloadWeights.get(2) != null) {
                    rocketPayload.append("\n\nId: "+payloadWeights.get(2).getId().toString()+
                            "\nName: "+payloadWeights.get(2).getName().toString()+
                            "\nKg: "+payloadWeights.get(2).getKg().toString()+
                            "\nLb: "+payloadWeights.get(2).getLb().toString()
                    );
                }
            } else {
                rocketPayload.setText("Payload weight list is null");
            }

            rocketFlight.setText(rocketListResponseDto.getFirstFlight().toString());
            rocketDescription.setText(rocketListResponseDto.getDescription());

            rocketLandingLegs.setText("Material: "+rocketListResponseDto.getLandingLegs().getMaterial()+
                    "Number: "+rocketListResponseDto.getLandingLegs().getNumber());

        }
    }
}