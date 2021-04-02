package com.springboot.springboot_demo.entity;

/**
 * @ClassName Pre
 * @Description TODO
 * @Author luokai
 * @CreateDate 2020/10/20 20:30
 * @UPpdateUser luokai
 * @UpdateDate 2020/10/20 20:30
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
public class Pre {
    public int getArea_Station_No() {
        return Area_Station_No;
    }

    public void setArea_Station_No(int area_Station_No) {
        Area_Station_No = area_Station_No;
    }

    public int getLatitude() {
        return Latitude;
    }

    public void setLatitude(int latitude) {
        Latitude = latitude;
    }

    public int getLongitude() {
        return Longitude;
    }

    public void setLongitude(int longitude) {
        Longitude = longitude;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getRainfall_20_8() {
        return Rainfall_20_8;
    }

    public void setRainfall_20_8(int rainfall_20_8) {
        Rainfall_20_8 = rainfall_20_8;
    }

    public int getRainfall_8_20() {
        return Rainfall_8_20;
    }

    public void setRainfall_8_20(int rainfall_8_20) {
        Rainfall_8_20 = rainfall_8_20;
    }

    public int getRainfall_20_20() {
        return Rainfall_20_20;
    }

    public void setRainfall_20_20(int rainfall_20_20) {
        Rainfall_20_20 = rainfall_20_20;
    }

    public int getQuality_control_code_20_8() {
        return Quality_control_code_20_8;
    }

    public void setQuality_control_code_20_8(int quality_control_code_20_8) {
        Quality_control_code_20_8 = quality_control_code_20_8;
    }

    public int getQuality_control_code_8_20() {
        return Quality_control_code_8_20;
    }

    public void setQuality_control_code_8_20(int quality_control_code_8_20) {
        Quality_control_code_8_20 = quality_control_code_8_20;
    }

    public int getQuality_control_code_20_20() {
        return Quality_control_code_20_20;
    }

    public void setQuality_control_code_20_20(int quality_control_code_20_20) {
        Quality_control_code_20_20 = quality_control_code_20_20;
    }



    public Pre(){

    }
    public Pre(int area_Station_No, int latitude, int longitude, int height, int year, int month, int day, int rainfall_20_8, int rainfall_8_20, int rainfall_20_20, int quality_control_code_20_8, int quality_control_code_8_20, int quality_control_code_20_20) {
        Area_Station_No = area_Station_No;
        Latitude = latitude;
        Longitude = longitude;
        Height = height;
        this.year = year;
        this.month = month;
        this.day = day;
        Rainfall_20_8 = rainfall_20_8;
        Rainfall_8_20 = rainfall_8_20;
        Rainfall_20_20 = rainfall_20_20;
        Quality_control_code_20_8 = quality_control_code_20_8;
        Quality_control_code_8_20 = quality_control_code_8_20;
        Quality_control_code_20_20 = quality_control_code_20_20;
    }
    private int Area_Station_No;
    private int Latitude;
    private int Longitude;
    private int Height;
    private int year;
    private int month;
    private int day;
    private int Rainfall_20_8;
    private int Rainfall_8_20;
    private int Rainfall_20_20;
    private int Quality_control_code_20_8;

    @Override
    public String toString() {
        return "Pre{" +
                "Area_Station_No=" + Area_Station_No +
                ", Latitude=" + Latitude +
                ", Longitude=" + Longitude +
                ", Height=" + Height +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", Rainfall_20_8=" + Rainfall_20_8 +
                ", Rainfall_8_20=" + Rainfall_8_20 +
                ", Rainfall_20_20=" + Rainfall_20_20 +
                ", Quality_control_code_20_8=" + Quality_control_code_20_8 +
                ", Quality_control_code_8_20=" + Quality_control_code_8_20 +
                ", Quality_control_code_20_20=" + Quality_control_code_20_20 +
                '}';
    }

    private int Quality_control_code_8_20;
    private int Quality_control_code_20_20;
}
