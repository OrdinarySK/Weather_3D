package com.springboot.springboot_demo.entity;

/**
 * @ClassName Ssd
 * @Description TODO
 * @Author luokai
 * @CreateDate 2020/10/21 13:56
 * @UPpdateUser luokai
 * @UpdateDate 2020/10/21 13:56
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
public class Ssd {
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

    public int getSunshine_hours() {
        return Sunshine_hours;
    }

    public void setSunshine_hours(int sunshine_hours) {
        Sunshine_hours = sunshine_hours;
    }

    public int getSunshine_hours_quality_control_code() {
        return Sunshine_hours_quality_control_code;
    }

    public void setSunshine_hours_quality_control_code(int sunshine_hours_quality_control_code) {
        Sunshine_hours_quality_control_code = sunshine_hours_quality_control_code;
    }

    private int Area_Station_No;
    private int Latitude;
    private int Longitude;
    private int Height;
    private int year;
    private int month;
    private int day;
    private int Sunshine_hours;
    private int Sunshine_hours_quality_control_code;

    public Ssd(){

    }

}
