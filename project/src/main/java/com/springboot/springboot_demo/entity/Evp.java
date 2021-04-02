package com.springboot.springboot_demo.entity;

/**
 * @ClassName Evp
 * @Description TODO
 * @Author luokai
 * @CreateDate 2020/10/22 11:29
 * @UPpdateUser luokai
 * @UpdateDate 2020/10/22 11:29
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
public class Evp {
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

    public int getSmall_evaporation() {
        return Small_evaporation;
    }

    public void setSmall_evaporation(int small_evaporation) {
        Small_evaporation = small_evaporation;
    }

    public int getLarge_evaporation() {
        return Large_evaporation;
    }

    public void setLarge_evaporation(int large_evaporation) {
        Large_evaporation = large_evaporation;
    }

    public int getSmall_evaporation_control_code() {
        return Small_evaporation_control_code;
    }

    public void setSmall_evaporation_control_code(int small_evaporation_control_code) {
        Small_evaporation_control_code = small_evaporation_control_code;
    }

    public int getLarge_evaporation_control_code() {
        return Large_evaporation_control_code;
    }

    public void setLarge_evaporation_control_code(int large_evaporation_control_code) {
        Large_evaporation_control_code = large_evaporation_control_code;
    }

    private int Area_Station_No;
    private int Latitude;
    private int Longitude;
    private int Height;
    private int year;
    private int month;
    private int day;
    private int Small_evaporation;
    private int Large_evaporation;
    private int Small_evaporation_control_code;
    private int Large_evaporation_control_code;

    public Evp(){

    }
}
