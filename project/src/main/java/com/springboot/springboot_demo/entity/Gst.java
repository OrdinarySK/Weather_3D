package com.springboot.springboot_demo.entity;

/**
 * @ClassName Gst
 * @Description TODO
 * @Author luokai
 * @CreateDate 2020/10/22 14:22
 * @UPpdateUser luokai
 * @UpdateDate 2020/10/22 14:22
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
public class Gst {
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

    public int getAverage_surface_temperature() {
        return Average_surface_temperature;
    }

    public void setAverage_surface_temperature(int average_surface_temperature) {
        Average_surface_temperature = average_surface_temperature;
    }

    public int getThe_highest_surface_temperature() {
        return The_highest_surface_temperature;
    }

    public void setThe_highest_surface_temperature(int the_highest_surface_temperature) {
        The_highest_surface_temperature = the_highest_surface_temperature;
    }

    public int getThe_minimum_surface_temperature() {
        return The_minimum_surface_temperature;
    }

    public void setThe_minimum_surface_temperature(int the_minimum_surface_temperature) {
        The_minimum_surface_temperature = the_minimum_surface_temperature;
    }

    public int getAverage_surface_temperature_quality_control_code() {
        return Average_surface_temperature_quality_control_code;
    }

    public void setAverage_surface_temperature_quality_control_code(int average_surface_temperature_quality_control_code) {
        Average_surface_temperature_quality_control_code = average_surface_temperature_quality_control_code;
    }

    public int getDaily_highest_surface_temperature_quality_control_code() {
        return Daily_highest_surface_temperature_quality_control_code;
    }

    public void setDaily_highest_surface_temperature_quality_control_code(int daily_highest_surface_temperature_quality_control_code) {
        Daily_highest_surface_temperature_quality_control_code = daily_highest_surface_temperature_quality_control_code;
    }

    public int getDaily_minimum_surface_temperature_quality_control_code() {
        return Daily_minimum_surface_temperature_quality_control_code;
    }

    public void setDaily_minimum_surface_temperature_quality_control_code(int daily_minimum_surface_temperature_quality_control_code) {
        Daily_minimum_surface_temperature_quality_control_code = daily_minimum_surface_temperature_quality_control_code;
    }

    private int Area_Station_No;
    private int Latitude;
    private int Longitude;
    private int Height;
    private int year;
    private int month;
    private int day;
    private int Average_surface_temperature;
    private int The_highest_surface_temperature;
    private int The_minimum_surface_temperature;
    private int Average_surface_temperature_quality_control_code;
    private int Daily_highest_surface_temperature_quality_control_code;
    private int Daily_minimum_surface_temperature_quality_control_code;

    public Gst(){}
}
