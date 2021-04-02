package com.springboot.springboot_demo.controller;

import com.springboot.springboot_demo.entity.CountrySumData;
import com.springboot.springboot_demo.entity.StationHistoryObserveData;
import com.springboot.springboot_demo.entity.User;
import com.springboot.springboot_demo.entity.ProvinceStation;
import com.springboot.springboot_demo.entity.StationAverageData;
import com.springboot.springboot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;


@RestController
@RequestMapping(value = "/UserController", method = { RequestMethod.GET, RequestMethod.POST })
public class UserController {
    @Autowired
    private UserService userservice;

    //获取省级marker数据
    @RequestMapping("/ProvinceStationData")
    @ResponseBody
    public List<ProvinceStation>[] ProvinceStationData(){
        //User u=userservice.ListUser();
        List<ProvinceStation> array = new ArrayList<ProvinceStation>();
        //List<ProvinceStation>[] myList = new List<ProvinceStation>[6];
        //myList[0] = userservice.ProvinceAverageByName(name).Province_average_pressure;
        List<ProvinceStation>[] genericArray = (List<ProvinceStation>[])new ArrayList[2];
        genericArray[0]=userservice.ProvinceStationData();
        genericArray[1]=userservice.StationMarkerData();
        //array.add(userservice.ProvinceStationData());
        return genericArray;
    }

    //获取站点marker数据
    @RequestMapping("/StationMarkerData")
    @ResponseBody
    public List<ProvinceStation> StationMarkerData(){
        return userservice.StationMarkerData();
    }

    //根据省份名称获取省份气象数据平均值
    @RequestMapping("/ProvinceAverageByName")
    @ResponseBody
    public String ProvinceAverageByName(String name){
        User u=userservice.ProvinceAverageByName(name);
        return JSONObject.toJSONString(u);
    }

    @RequestMapping("/StationHistoryObserveDataByName")
    @ResponseBody
    public List<StationHistoryObserveData>[] StationHistoryObserveDataByName(String name){

        List<StationHistoryObserveData>[] StationHistoryObserveDataInfo = (List<StationHistoryObserveData>[])new ArrayList[8];
        StationHistoryObserveDataInfo[0]=userservice.StationPressureData(name);
        StationHistoryObserveDataInfo[1]=userservice.StationTemperatureData(name);
        StationHistoryObserveDataInfo[2]=userservice.StationHumidityData(name);
        StationHistoryObserveDataInfo[3]=userservice.StationPecipitationData(name);
        StationHistoryObserveDataInfo[4]=userservice.StationEvaporationData(name);
        StationHistoryObserveDataInfo[5]=userservice.StationWindSpeedData(name);
        StationHistoryObserveDataInfo[6]=userservice.StationSunshineHoursData(name);
        StationHistoryObserveDataInfo[7]=userservice.StationSurfaceTemperatureData(name);

        return StationHistoryObserveDataInfo;
    }

    //    @Autowired
//    private UserService userservice;
    //对数据库进行的删除操作
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String Delete(int id) {
        int result = userservice.delete(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    //对数据进行修改的操作
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(User user) {
        int result = userservice.Update(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //对数据库进行增加字段操作
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public User insert(User user)
    {
        return userservice.insertUser(user);
    }

    //  省级界面极端天气总和
    @RequestMapping("/getCountrySumData")
    @ResponseBody
    public List<CountrySumData>[] getCountrySumData(){
        //User u=userservice.getCountrySumData();
        return userservice.getCountrySumData();
    }

    //站点页面历史观测数据平均值
    @RequestMapping("/getStationAvgDataByStationName")
    @ResponseBody
    public List<StationAverageData> get_station_avg_data_by_station_name(String name){

        return userservice.get_station_avg_data_by_station_name(name);
    }

    //站点页面极端天气数据
    @RequestMapping("/getStationExtremeWeatherDataByName")
    @ResponseBody
    public List<CountrySumData> get_station_extreme_weather_data_by_name(String name){

        return userservice.get_station_extreme_weather_data_by_name(name);
    }

    //获取所有的站点数据
    @GetMapping("/getAllStation")
    public Object getAllStation (){
        return userservice.getAllStation();
    }


}