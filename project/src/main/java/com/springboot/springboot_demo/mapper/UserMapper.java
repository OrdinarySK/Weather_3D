package com.springboot.springboot_demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import com.springboot.springboot_demo.entity.User;
import com.springboot.springboot_demo.entity.ProvinceStation;
import com.springboot.springboot_demo.entity.StationHistoryObserveData;
import com.springboot.springboot_demo.entity.CountrySumData;
import com.springboot.springboot_demo.entity.StationAverageData;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    public User ProvinceAverageByName(String name);

//    public User ProvinceAverageTemperatureByName(String name);

    public List<ProvinceStation> ProvinceStationData();
    public List<ProvinceStation> StationMarkerData();

    public User insertUser(User user);

    public int delete(int id);

    public int Update(User user);

    public List<StationHistoryObserveData> StationPressureData(String name);
    public List<StationHistoryObserveData> StationTemperatureData(String name);
    public List<StationHistoryObserveData> StationHumidityData(String name);
    public List<StationHistoryObserveData> StationPecipitationData(String name);
    public List<StationHistoryObserveData> StationEvaporationData(String name);
    public List<StationHistoryObserveData> StationWindSpeedData(String name);
    public List<StationHistoryObserveData> StationSunshineHoursData(String name);
    public List<StationHistoryObserveData> StationSurfaceTemperatureData(String name);

    public List<CountrySumData> CountrySumData_cold_wave();
    public List<CountrySumData> CountrySumData_high_temperature();
    public List<CountrySumData> CountrySumData_heavy_rain();
    public List<CountrySumData> CountrySumData_gale();
    public List<CountrySumData> CountrySumData_strong_tropical_storm();

    public List<StationAverageData> get_station_avg_data_by_station_name(String name);

    public List<CountrySumData> get_station_extreme_weather_data_by_name(String name);

    public List<Map<String,Object>> getAllStation();


}
