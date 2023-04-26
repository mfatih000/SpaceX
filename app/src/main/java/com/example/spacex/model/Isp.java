package com.example.spacex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Isp {

    @SerializedName("sea_level")
    @Expose
    private Integer seaLevel;
    @SerializedName("vacuum")
    @Expose
    private Integer vacuum;

    public Integer getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(Integer seaLevel) {
        this.seaLevel = seaLevel;
    }

    public Integer getVacuum() {
        return vacuum;
    }

    public void setVacuum(Integer vacuum) {
        this.vacuum = vacuum;
    }

}
