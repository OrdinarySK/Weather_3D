package com.springboot.springboot_demo.entity;

/**
 * @ClassName Win
 * @Description TODO
 * @Author luokai
 * @CreateDate 2020/10/22 14:57
 * @UPpdateUser luokai
 * @UpdateDate 2020/10/22 14:57
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
public class Win {
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

    public int getAverage_wind_speed() {
        return Average_wind_speed;
    }

    public void setAverage_wind_speed(int average_wind_speed) {
        Average_wind_speed = average_wind_speed;
    }

    public int getMaximum_wind_speed() {
        return Maximum_wind_speed;
    }

    public void setMaximum_wind_speed(int maximum_wind_speed) {
        Maximum_wind_speed = maximum_wind_speed;
    }

    public int getWind_direction_of_Maximnum_speed() {
        return Wind_direction_of_Maximnum_speed;
    }

    public void setWind_direction_of_Maximnum_speed(int wind_direction_of_Maximnum_speed) {
        Wind_direction_of_Maximnum_speed = wind_direction_of_Maximnum_speed;
    }

    public int getLarge_wind_speed() {
        return Large_wind_speed;
    }

    public void setLarge_wind_speed(int large_wind_speed) {
        Large_wind_speed = large_wind_speed;
    }

    public int getWind_direction_of_Large_wind_speed() {
        return Wind_direction_of_Large_wind_speed;
    }

    public void setWind_direction_of_Large_wind_speed(int wind_direction_of_Large_wind_speed) {
        Wind_direction_of_Large_wind_speed = wind_direction_of_Large_wind_speed;
    }

    public int getAverage_wind_speed_control_code() {
        return Average_wind_speed_control_code;
    }

    public void setAverage_wind_speed_control_code(int average_wind_speed_control_code) {
        Average_wind_speed_control_code = average_wind_speed_control_code;
    }

    public int getMaximum_wind_speed_control_code() {
        return Maximum_wind_speed_control_code;
    }

    public void setMaximum_wind_speed_control_code(int maximum_wind_speed_control_code) {
        Maximum_wind_speed_control_code = maximum_wind_speed_control_code;
    }

    private int Area_Station_No;
    private int Latitude;
    private int Longitude;
    private int Height;
    private int year;
    private int month;
    private int day;
    private int Average_wind_speed;
    private int Maximum_wind_speed;
    private int Wind_direction_of_Maximnum_speed;
    private int Large_wind_speed;
    private int Wind_direction_of_Large_wind_speed;
    private int Average_wind_speed_control_code;
    private int Maximum_wind_speed_control_code;

    public int getWind_direction_maximum_wind_speed_control_code() {
        return Wind_direction_maximum_wind_speed_control_code;
    }

    public void setWind_direction_maximum_wind_speed_control_code(int wind_direction_maximum_wind_speed_control_code) {
        Wind_direction_maximum_wind_speed_control_code = wind_direction_maximum_wind_speed_control_code;
    }

    public int getLarge_wind_speed_control_code() {
        return Large_wind_speed_control_code;
    }

    public void setLarge_wind_speed_control_code(int large_wind_speed_control_code) {
        Large_wind_speed_control_code = large_wind_speed_control_code;
    }

    public int getWind_direction_large_wind_speed_control_code() {
        return Wind_direction_large_wind_speed_control_code;
    }

    public void setWind_direction_large_wind_speed_control_code(int wind_direction_large_wind_speed_control_code) {
        Wind_direction_large_wind_speed_control_code = wind_direction_large_wind_speed_control_code;
    }

    private int Wind_direction_maximum_wind_speed_control_code;
    private int Large_wind_speed_control_code;
    private int Wind_direction_large_wind_speed_control_code;
    public Win(){}
}
