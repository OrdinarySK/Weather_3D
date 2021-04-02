package com.springboot.springboot_demo.entity;

public class StationHistoryObserveData {
    public int year;
    public int month;
    public int day;
    public int prs_average_pressure;
    public int tem_average_temperature;
    public int rhu_average_humidity;
    public int pre_20_20_cmulative_recipitation;
    public int evp_small_evaporation;
    public int win_average_wind_speed;
    public int ssd_sunshine_hours;
    public int gst_average_surface_temperature;




    public int getYear() {return year;}
    public void setYear(int year) {this.year = year; }
    
    public int getMonth() {return month;}
    public void setMonth(int month) {this.month = month; }
    
    public int getDay() {return day;}
    public void setDay(int day) {this.day = day; }

    public int getPrs_average_pressure() {return prs_average_pressure;}
    public void setPrs_average_pressure(int prs_average_pressure) {this.prs_average_pressure = prs_average_pressure; }

    public int getTem_average_temperature() {return tem_average_temperature;}
    public void setTem_average_temperature(int tem_average_temperature) {this.tem_average_temperature = tem_average_temperature; }

    public int getRhu_average_humidity() {return rhu_average_humidity;}
    public void setRhu_average_humidity(int rhu_average_humidity) {this.rhu_average_humidity = rhu_average_humidity; }

    public int getPre_20_20_cmulative_recipitation() {return pre_20_20_cmulative_recipitation;}
    public void setPre_20_20_cmulative_recipitation(int pre_20_20_cmulative_recipitation) {this.pre_20_20_cmulative_recipitation = pre_20_20_cmulative_recipitation; }

    public int getEvp_small_evaporation() {return evp_small_evaporation;}
    public void setEvp_small_evaporation(int evp_small_evaporation) {this.evp_small_evaporation = evp_small_evaporation; }

    public int getWin_average_wind_speed() {return win_average_wind_speed;}
    public void setWin_average_wind_speed(int win_average_wind_speed) {this.win_average_wind_speed = win_average_wind_speed; }

    public int getSsd_sunshine_hours() {return ssd_sunshine_hours;}
    public void setSsd_sunshine_hours(int ssd_sunshine_hours) {this.ssd_sunshine_hours = ssd_sunshine_hours; }

    public int getGst_average_surface_temperature() {return gst_average_surface_temperature;}
    public void setGst_average_surface_temperature(int gst_average_surface_temperature) {this.gst_average_surface_temperature = gst_average_surface_temperature; }
}
