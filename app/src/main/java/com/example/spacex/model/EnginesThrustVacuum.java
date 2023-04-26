package com.example.spacex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EnginesThrustVacuum {

    @SerializedName("kN")
    @Expose
    private Integer kN;
    @SerializedName("lbf")
    @Expose
    private Integer lbf;

    public Integer getkN() {
        return kN;
    }

    public void setkN(Integer kN) {
        this.kN = kN;
    }

    public Integer getLbf() {
        return lbf;
    }

    public void setLbf(Integer lbf) {
        this.lbf = lbf;
    }

}
