package ru.startandroid.develop.guide;

import android.annotation.SuppressLint;

public class Information {


    private String parkName;

    private String districtName;

    private String numberPhone;

    private int information;

    String show;

    private String address;



    double lat;

    double lon;





    private int imageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Information(String parkName, String districtName, int imageResourceId,String numberPhone, int information, String show, String address) {
        this.parkName = parkName;
        this.districtName = districtName;
        this.imageResourceId = imageResourceId;
        this.numberPhone = numberPhone;
        this.information = information;
        this.show = show;
        this.address = address;
        //this.lat = lat;
        //this.lon = lon;

    }



    public String getShow(){
        return  show;
    }

    public Information(String parkName, String districtName, int imageResourceId, int information, String show, String address) {
        this.parkName = parkName;
        this.districtName = districtName;
        this.imageResourceId = imageResourceId;
        this.information = information;
        this.show = show;
        this.address = address;
        //this.lat = lat;
        //this.lon = lon;
    }

    /*
    @SuppressLint("DefaultLocale")
    public  String location(){
        return String.format("geo:%f,%f", lat, lon);
    }*/


    public String getParkName() {

        return parkName;
    }

    public String getDistrictName()
    {
        return districtName;
    }

    public int getImageResourceId() {
        return imageResourceId;

    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public String getNumberPhone(){
        return numberPhone;
    }

    public int getInformation(){
        return information;
    }

    public String getAddress(){
        return address;
    }

}




