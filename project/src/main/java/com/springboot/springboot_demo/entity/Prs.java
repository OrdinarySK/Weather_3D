package com.springboot.springboot_demo.entity;

/**
 * @ClassName Prs
 * @Description TODO
 * @Author luokai
 * @CreateDate 2020/10/22 11:09
 * @UPpdateUser luokai
 * @UpdateDate 2020/10/22 11:09
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
public class Prs {
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

    public int getAverage_pressure() {
        return Average_pressure;
    }

    public void setAverage_pressure(int average_pressure) {
        Average_pressure = average_pressure;
    }

    public int getThe_highest_pressure_of_day() {
        return The_highest_pressure_of_day;
    }

    public void setThe_highest_pressure_of_day(int the_highest_pressure_of_day) {
        The_highest_pressure_of_day = the_highest_pressure_of_day;
    }

    public int getThe_lowest_pressure_of_day() {
        return The_lowest_pressure_of_day;
    }

    public void setThe_lowest_pressure_of_day(int the_lowest_pressure_of_day) {
        The_lowest_pressure_of_day = the_lowest_pressure_of_day;
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
    private int Average_pressure;
    private int The_highest_pressure_of_day;
    private int The_lowest_pressure_of_day;
    private int Average_control_code;
    private int The_highest_control_code;
    private int The_lowest_control_code;

    public Prs(){

    }

}
