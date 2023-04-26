package com.example.spacex.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class RocketListResponseDto {

    @SerializedName("height")
    @Expose
    private Height height;
    @SerializedName("diameter")
    @Expose
    private Diameter diameter;
    @SerializedName("mass")
    @Expose
    private Mass mass;
    @SerializedName("first_stage")
    @Expose
    private FirstStage firstStage;
    @SerializedName("second_stage")
    @Expose
    private SecondStage secondStage;
    @SerializedName("engines")
    @Expose
    private Engines engines;
    @SerializedName("landing_legs")
    @Expose
    private LandingLegs landingLegs;
    @SerializedName("payload_weights")
    @Expose
    private List<PayloadWeight> payloadWeights;
    @SerializedName("flickr_images")
    @Expose
    private List<String> flickrImages;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("stages")
    @Expose
    private Integer stages;
    @SerializedName("boosters")
    @Expose
    private Integer boosters;
    @SerializedName("cost_per_launch")
    @Expose
    private Integer costPerLaunch;
    @SerializedName("success_rate_pct")
    @Expose
    private Integer successRatePct;
    @SerializedName("first_flight")
    @Expose
    private String firstFlight;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("wikipedia")
    @Expose
    private String wikipedia;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("id")
    @Expose
    private String id;

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Diameter getDiameter() {
        return diameter;
    }

    public void setDiameter(Diameter diameter) {
        this.diameter = diameter;
    }

    public Mass getMass() {
        return mass;
    }

    public void setMass(Mass mass) {
        this.mass = mass;
    }

    public FirstStage getFirstStage() {
        return firstStage;
    }

    public void setFirstStage(FirstStage firstStage) {
        this.firstStage = firstStage;
    }

    public SecondStage getSecondStage() {
        return secondStage;
    }

    public void setSecondStage(SecondStage secondStage) {
        this.secondStage = secondStage;
    }

    public Engines getEngines() {
        return engines;
    }

    public void setEngines(Engines engines) {
        this.engines = engines;
    }

    public LandingLegs getLandingLegs() {
        return landingLegs;
    }

    public void setLandingLegs(LandingLegs landingLegs) {
        this.landingLegs = landingLegs;
    }

    public List<PayloadWeight> getPayloadWeights() {
        return payloadWeights;
    }

    public void setPayloadWeights(List<PayloadWeight> payloadWeights) {
        this.payloadWeights = payloadWeights;
    }

    public List<String> getFlickrImages() {
        return flickrImages;
    }

    public void setFlickrImages(List<String> flickrImages) {
        this.flickrImages = flickrImages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getStages() {
        return stages;
    }

    public void setStages(Integer stages) {
        this.stages = stages;
    }

    public Integer getBoosters() {
        return boosters;
    }

    public void setBoosters(Integer boosters) {
        this.boosters = boosters;
    }

    public Integer getCostPerLaunch() {
        return costPerLaunch;
    }

    public void setCostPerLaunch(Integer costPerLaunch) {
        this.costPerLaunch = costPerLaunch;
    }

    public Integer getSuccessRatePct() {
        return successRatePct;
    }

    public void setSuccessRatePct(Integer successRatePct) {
        this.successRatePct = successRatePct;
    }

    public String getFirstFlight() {
        return firstFlight;
    }

    public void setFirstFlight(String firstFlight) {
        this.firstFlight = firstFlight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}


