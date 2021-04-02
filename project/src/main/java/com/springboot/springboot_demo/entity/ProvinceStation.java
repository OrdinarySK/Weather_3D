package com.springboot.springboot_demo.entity;

public class ProvinceStation {
    public String provice;
    public int latitude;
    public int longitude;
    public String position;

    public String getPosition() {return position;}
    public void setPosition(String position) {this.position = position; }

    public String getProvice() {return provice;}
    public void setProvice(String provice) {this.provice = provice; }

    public int getLatitude() {return latitude;}
    public void setLatitude(int latitude) {this.latitude = latitude; }
    public int getLongitude() {return longitude;}
    public void setLongitude(int longitude) {this.longitude = longitude; }
}
