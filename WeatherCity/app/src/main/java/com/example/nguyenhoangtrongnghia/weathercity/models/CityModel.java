package com.example.nguyenhoangtrongnghia.weathercity.models;

/**
 * Created by nguyenhoangtrongnghia on 5/21/17.
 */

public class CityModel {
    private String cityName;
    private String langCode;
    private Boolean isBookMark;


    public CityModel(){

    }


    public Boolean getBookMark() {
        return isBookMark;
    }

    public void setBookMark(Boolean bookMark) {
        isBookMark = bookMark;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }
}
