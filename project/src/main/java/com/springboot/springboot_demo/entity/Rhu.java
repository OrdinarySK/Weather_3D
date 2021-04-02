package com.springboot.springboot_demo.entity;

/**
 * @ClassName Rhu
 * @Description TODO
 * @Author luokai
 * @CreateDate 2020/10/22 14:29
 * @UPpdateUser luokai
 * @UpdateDate 2020/10/22 14:29
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
public class Rhu {
    private int Area_Station_No;

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

    public int getAverage_relative_humidity() {
        return Average_relative_humidity;
    }

    public void setAverage_relative_humidity(int average_relative_humidity) {
        Average_relative_humidity = average_relative_humidity;
    }

    public int getMinimum_relative_humidity() {
        return Minimum_relative_humidity;
    }

    public void setMinimum_relative_humidity(int minimum_relative_humidity) {
        Minimum_relative_humidity = minimum_relative_humidity;
    }

    public int getAverage_control_code() {
        return Average_control_code;
    }

    public void setAverage_control_code(int average_control_code) {
        Average_control_code = average_control_code;
    }

    public int getThe_minimum_control_code() {
        return The_minimum_control_code;
    }

    public void setThe_minimum_control_code(int the_minimum_control_code) {
        The_minimum_control_code = the_minimum_control_code;
    }

    private int Latitude;
    private int Longitude;
    private int Height;
    private int year;
    private int month;
    private int day;
    private int Average_relative_humidity;
    private int Minimum_relative_humidity;
    private int Average_control_code;
    private int The_minimum_control_code;
    public Rhu(){}
}
