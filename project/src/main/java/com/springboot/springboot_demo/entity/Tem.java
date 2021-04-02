package com.springboot.springboot_demo.entity;

/**
 * @ClassName Tem
 * @Description TODO
 * @Author luokai
 * @CreateDate 2020/10/22 14:55
 * @UPpdateUser luokai
 * @UpdateDate 2020/10/22 14:55
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
public class Tem {
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

    public int getAverage_temperature() {
        return Average_temperature;
    }

    public void setAverage_temperature(int average_temperature) {
        Average_temperature = average_temperature;
    }

    public int getDaily_maximum_temperature() {
        return Daily_maximum_temperature;
    }

    public void setDaily_maximum_temperature(int daily_maximum_temperature) {
        Daily_maximum_temperature = daily_maximum_temperature;
    }

    public int getDaily_minimum_temperature() {
        return Daily_minimum_temperature;
    }

    public void setDaily_minimum_temperature(int daily_minimum_temperature) {
        Daily_minimum_temperature = daily_minimum_temperature;
    }

    public int getAverage_control_code() {
        return Average_control_code;
    }

    public void setAverage_control_code(int average_control_code) {
        Average_control_code = average_control_code;
    }

    public int getThe_highest_control_code() {
        return The_highest_control_code;
    }

    public void setThe_highest_control_code(int the_highest_control_code) {
        The_highest_control_code = the_highest_control_code;
    }

    public int getThe_lowest_control_code() {
        return The_lowest_control_code;
    }

    public void setThe_lowest_control_code(int the_lowest_control_code) {
        The_lowest_control_code = the_lowest_control_code;
    }

    private int Area_Station_No;
    private int Latitude;
    private int Longitude;
    private int Height;
    private int year;
    private int month;
    private int day;
    private int Average_temperature;
    private int Daily_maximum_temperature;
    private int Daily_minimum_temperature;
    private int Average_control_code;
    private int The_highest_control_code;
    private int The_lowest_control_code;

    public Tem(){

    }
}
