package com.example.spacex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FirstStage {

    @SerializedName("thrust_sea_level")
    @Expose
    private ThrustSeaLevel thrustSeaLevel;
    @SerializedName("thrust_vacuum")
    @Expose
    private ThrustVacuum thrustVacuum;
    @SerializedName("reusable")
    @Expose
    private Boolean reusable;
    @SerializedName("engines")
    @Expose
    private Integer engines;
    @SerializedName("fuel_amount_tons")
    @Expose
    private Double fuelAmountTons;
    @SerializedName("burn_time_sec")
    @Expose
    private Integer burnTimeSec;

    public ThrustSeaLevel getThrustSeaLevel() {
        return thrustSeaLevel;
    }

    public void setThrustSeaLevel(ThrustSeaLevel thrustSeaLevel) {
        this.thrustSeaLevel = thrustSeaLevel;
    }

    public ThrustVacuum getThrustVacuum() {
        return thrustVacuum;
    }

    public void setThrustVacuum(ThrustVacuum thrustVacuum) {
        this.thrustVacuum = thrustVacuum;
    }

    public Boolean getReusable() {
        return reusable;
    }

    public void setReusable(Boolean reusable) {
        this.reusable = reusable;
    }

    public Integer getEngines() {
        return engines;
    }

    public void setEngines(Integer engines) {
        this.engines = engines;
    }

    public Double getFuelAmountTons() {
        return fuelAmountTons;
    }

    public void setFuelAmountTons(Double fuelAmountTons) {
        this.fuelAmountTons = fuelAmountTons;
    }

    public Integer getBurnTimeSec() {
        return burnTimeSec;
    }

    public void setBurnTimeSec(Integer burnTimeSec) {
        this.burnTimeSec = burnTimeSec;
    }

}
