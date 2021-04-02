package com.springboot.springboot_demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import org.springframework.beans.factory.
import com.springboot.springboot_demo.entity.StationHistoryObserveData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.springboot_demo.entity.User;
import com.springboot.springboot_demo.entity.ProvinceStation;
import com.springboot.springboot_demo.entity.CountrySumData;
import com.springboot.springboot_demo.entity.StationAverageData;
import com.springboot.springboot_demo.mapper.UserMapper;

@Service
public class UserService {
    @Autowired
//    @Override
    private UserMapper userMapper;
    public User ProvinceAverageByName(String name) {
        return userMapper.ProvinceAverageByName(name);
    }
//    public User ProvinceAveragetemperatureByName(String name) {
//        return userMapper.ProvinceAverageTemperatureByName(name);
//    }



    public User insertUser(User user) {
        userMapper.insertUser(user);
        return user;
    }
    public List<ProvinceStation> ProvinceStationData(){
        return  userMapper.ProvinceStationData();
    }
    public List<ProvinceStation> StationMarkerData(){
        return  userMapper.StationMarkerData();
    }

    public int Update(User user){
        return userMapper.Update(user);
    }
    public int delete(int id){
        return userMapper.delete(id);
    }

    public List<StationHistoryObserveData> StationPressureData(String name) {
        return userMapper.StationPressureData(name);
    }
    public List<StationHistoryObserveData> StationTemperatureData(String name) {
        return userMapper.StationTemperatureData(name);
    }
    public List<StationHistoryObserveData> StationHumidityData(String name) {
        return userMapper.StationHumidityData(name);
    }
    public List<StationHistoryObserveData> StationPecipitationData(String name) {
        return userMapper.StationPecipitationData(name);
    }
    public List<StationHistoryObserveData> StationEvaporationData(String name) {
        return userMapper.StationEvaporationData(name);
    }
    public List<StationHistoryObserveData> StationWindSpeedData(String name) {
        return userMapper.StationWindSpeedData(name);
    }
    public List<StationHistoryObserveData> StationSunshineHoursData(String name) {
        return userMapper.StationSunshineHoursData(name);
    }
    public List<StationHistoryObserveData> StationSurfaceTemperatureData(String name) {
        return userMapper.StationSurfaceTemperatureData(name);
    }

    public List<CountrySumData>[] getCountrySumData() {
        //CountrySumData data[] = new CountrySumData[5];

        List<CountrySumData>[] CountrySumDatalalala = (List<CountrySumData>[])new ArrayList[5];
        CountrySumDatalalala[0]=userMapper.CountrySumData_cold_wave();
        CountrySumDatalalala[1]=userMapper.CountrySumData_high_temperature();
        CountrySumDatalalala[2]=userMapper.CountrySumData_heavy_rain();
        CountrySumDatalalala[3]=userMapper.CountrySumData_gale();
        CountrySumDatalalala[4]=userMapper.CountrySumData_strong_tropical_storm();
        return CountrySumDatalalala;
    }

    public List<StationAverageData> get_station_avg_data_by_station_name(String name) {
        return userMapper.get_station_avg_data_by_station_name(name);
    }

    public List<CountrySumData> get_station_extreme_weather_data_by_name(String name) {
        return userMapper.get_station_extreme_weather_data_by_name(name);
    }

    public List<Map<String,Object>> getAllStation(){

        return userMapper.getAllStation();
    }
}