package com.example.nguyenhoangtrongnghia.weathercity.models;

/**
 * Created by nguyenhoangtrongnghia on 5/21/17.
 */

public class CityModel {
    private String city;
    private Boolean isBookMark;


    public CityModel(){

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getBookMark() {
        return isBookMark;
    }

    public void setBookMark(Boolean bookMark) {
        isBookMark = bookMark;
    }
}
