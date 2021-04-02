package com.springboot.springboot_demo.entity;

public class User {
//    private int PRS_station_number;
//    private int PRS_latitude;
//    private int PRS_longitude;
//    private int PRS_altitude;
//    private int PRS_year;
//    private int PRS_month;
//    private int PRS_day;
//    private int PRS_average_pressure;
//    private int PRS_maximum_pressure;
//    private int PRS_minimum_pressure;
//    private int PRS_average_pressure_code;
//    private int PRS_maximum_pressure_code;
//    private int PRS_minimum_pressure_code;
//    public int AVG_PRS_average_pressure;
//    public int getPRS_station_number() {return PRS_station_number;}
//    public void setPRS_station_number(int PRS_station_number) {this.PRS_station_number = PRS_station_number; }
//    public int getPRS_latitude() {return PRS_latitude;}
//    public void setPRS_latitude(int PRS_latitude) {this.PRS_latitude = PRS_latitude; }
//    public int getPRS_longitude() {return PRS_longitude;}
//    public void setPRS_longitude(int PRS_longitude) {this.PRS_longitude = PRS_longitude; }
//    public int getPRS_altitude() {return PRS_altitude;}
//    public void setPRS_altitude(int PRS_altitude) {this.PRS_altitude = PRS_altitude; }
//    public int getPRS_year() {return PRS_year;}
//    public void setPRS_year(int PRS_year) {this.PRS_year = PRS_year; }
//    public int getPRS_month() {return PRS_month;}
//    public void setPRS_month(int PRS_month) {this.PRS_month = PRS_month; }
//    public int getPRS_day() {return PRS_day;}
//    public void setPRS_day(int PRS_day) {this.PRS_day = PRS_day; }
//    public int getPRS_average_pressure() {return PRS_average_pressure;}
//    public void setPRS_average_pressure(int PRS_average_pressure) {this.PRS_average_pressure = PRS_average_pressure; }
//    public int getPRS_maximum_pressure() {return PRS_maximum_pressure;}
//    public void setPRS_maximum_pressure(int PRS_maximum_pressure) {this.PRS_maximum_pressure = PRS_maximum_pressure; }
//    public int getPRS_minimum_pressure() {return PRS_minimum_pressure;}
//    public void setPRS_minimum_pressure(int PRS_minimum_pressure) {this.PRS_minimum_pressure = PRS_minimum_pressure; }
//    public int getPRS_average_pressure_code() {return PRS_average_pressure_code;}
//    public void setPRS_average_pressure_code(int PRS_average_pressure_code) {this.PRS_average_pressure_code = PRS_average_pressure_code; }
//    public int getPRS_maximum_pressure_code() {return PRS_maximum_pressure_code;}
//    public void setPRS_maximum_pressure_code(int PRS_maximum_pressure_code) {this.PRS_maximum_pressure_code = PRS_maximum_pressure_code; }
//    public int getPRS_minimum_pressure_code() {return PRS_minimum_pressure_code;}
//    public void setPRS_minimum_pressure_code(int PRS_minimum_pressure_code) {this.PRS_minimum_pressure_code = PRS_minimum_pressure_code; }
//    public int getAVG_PRS_average_pressure() {return AVG_PRS_average_pressure;}
//    public void setAVG_PRS_average_pressure(int AVG_PRS_average_pressure) {this.AVG_PRS_average_pressure = AVG_PRS_average_pressure; }


//    private int id;
//    private String name;
//    private String password;
//    private String number;
//    private String birthday;
//    private String job;
//    private String gender;
//
//    public int getId() {return id;}
//    public void setId(int id) {this.id = id; }
//    public String getName() {return name;}
//    public void setName(String name) {this.name = name;}
//    public String getPassword() {return password;}
//    public void setPassword(String password) {this.password =password;}
//    public String getNumber() { return number;}
//    public void setNumber(String number) {this.number = number;}
//    public String getBirthday() {return birthday;}
//    public void setBirthday(String birthday) {this.birthday = birthday; }
//    public String getJob() {return job; }
//    public void setJob(String job) {this.job = job; }
//    public String getGender() { return gender;}
//    public void setGender(String gender) {this.gender = gender; }
//    @Override
//    public String toString() {
//        return "User [id=" + id + ", name=" + name + ",gender="+gender+", job="+job+",password=" + password + "," +
//                "birthday="+birthday+", number=" + number + "password="+password+"]";
//    }
    public String province;
    public int province_average_pressure;
    public int province_average_temperature;
    public int province_average_humidity;
    public int province_average_20_20_cmulative_recipitation;
    public int province_average_small_evaporation;
    public int province_average_wind_speed;
    public int province_average_sunshine_hours;
    public int province_average_surface_temperature;

    public String getProvince() {return province;}
    public void setProvince(String province) {this.province = province; }

    public int getProvince_average_pressure() {return province_average_pressure;}
    public void setProvince_average_pressure(int province_average_pressure) {this.province_average_pressure = province_average_pressure; }

    public int getProvince_average_temperature() {return province_average_temperature;}
    public void setProvince_average_temperature(int province_average_temperature) {this.province_average_temperature = province_average_temperature; }

    public int getProvince_average_humidity() {return province_average_humidity;}
    public void setProvince_average_humidity(int province_average_humidity) {this.province_average_humidity = province_average_humidity; }

    public int getProvince_average_20_20_cmulative_recipitation() {return province_average_20_20_cmulative_recipitation;}
    public void setProvince_average_20_20_cmulative_recipitation(int province_average_20_20_cmulative_recipitation) {this.province_average_20_20_cmulative_recipitation = province_average_20_20_cmulative_recipitation; }

    public int getProvince_average_small_evaporation() {return province_average_small_evaporation;}
    public void setProvince_average_small_evaporation(int province_average_small_evaporation) {this.province_average_small_evaporation = province_average_small_evaporation; }

    public int getProvince_average_wind_speed() {return province_average_wind_speed;}
    public void setProvince_average_wind_speed(int province_average_wind_speed) {this.province_average_wind_speed = province_average_wind_speed; }

    public int getProvince_average_sunshine_hours() {return province_average_sunshine_hours;}
    public void setProvince_average_sunshine_hours(int province_average_sunshine_hours) {this.province_average_sunshine_hours = province_average_sunshine_hours; }

    public int getProvince_average_surface_temperature() {return province_average_surface_temperature;}
    public void setProvince_average_surface_temperature(int province_average_surface_temperature) {this.province_average_surface_temperature = province_average_surface_temperature; }


}