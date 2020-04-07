package com.example.AttractionsCanada;

import java.io.Serializable;

public class CanadaAttraction implements Serializable {

    private int placeId;
    private String placeName;
    private String address;
    private String City;
    private String province;
    private String description;


    public CanadaAttraction() {
    }


    public CanadaAttraction(int placeId, String placeName, String address, String city, String province, String description) {
        this.placeId = placeId;
        this.placeName = placeName;
        this.address = address;
        this.City = city;
        this.province = province;
        this.description = description;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
