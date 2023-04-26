package com.example.spacex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payloads {

    @SerializedName("composite_fairing")
    @Expose
    private CompositeFairing compositeFairing;
    @SerializedName("option_1")
    @Expose
    private String option1;

    public CompositeFairing getCompositeFairing() {
        return compositeFairing;
    }

    public void setCompositeFairing(CompositeFairing compositeFairing) {
        this.compositeFairing = compositeFairing;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

}
