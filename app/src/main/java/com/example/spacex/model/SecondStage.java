package com.example.spacex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecondStage {

    @SerializedName("thrust")
    @Expose
    private Thrust thrust;
    @SerializedName("payloads")
    @Expose
    private Payloads payloads;
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

    public Thrust getThrust() {
        return thrust;
    }

    public void setThrust(Thrust thrust) {
        this.thrust = thrust;
    }

    public Payloads getPayloads() {
        return payloads;
    }

    public void setPayloads(Payloads payloads) {
        this.payloads = payloads;
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
