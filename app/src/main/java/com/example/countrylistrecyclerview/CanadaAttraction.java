package com.example.countrylistrecyclerview;

public class CanadaAttraction {

    private int placeId;
    private String placeName;
    private String address;
    private String City;
    private String province;
    private int placeImage;
    private String description;


    public CanadaAttraction() {
    }


    public CanadaAttraction(int placeId, String placeName, String address, String city, String province, int placeImage, String description) {
        this.placeId = placeId;
        this.placeName = placeName;
        this.address = address;
        this.City = city;
        this.province = province;
        this.placeImage = placeImage;
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

    public int getPlaceImage() {
        return placeImage;
    }

    public void setPlaceImage(int placeImage) {
        this.placeImage = placeImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
