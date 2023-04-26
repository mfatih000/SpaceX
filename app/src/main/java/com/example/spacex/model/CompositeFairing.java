package com.example.spacex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CompositeFairing {

    @SerializedName("height")
    @Expose
    private CompositeFairingHeight height;
    @SerializedName("diameter")
    @Expose
    private CompositeFairingDiameter diameter;

    public CompositeFairingHeight getHeight() {
        return height;
    }

    public void setHeight(CompositeFairingHeight height) {
        this.height = height;
    }

    public CompositeFairingDiameter getDiameter() {
        return diameter;
    }

    public void setDiameter(CompositeFairingDiameter diameter) {
        this.diameter = diameter;
    }

}
