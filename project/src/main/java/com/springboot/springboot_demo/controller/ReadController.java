package com.springboot.springboot_demo.controller;

import com.springboot.springboot_demo.entity.*;
import com.springboot.springboot_demo.service.GetCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ReadController
 * @Description TODO
 * @Author luokai
 * @CreateDate 2020/10/21 13:50
 * @UPpdateUser luokai
 * @UpdateDate 2020/10/21 13:50
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
@RestController
@RequestMapping("/read")
public class ReadController {

    @Autowired
    GetCommonService getCommonService;
    @GetMapping("/readSsd")
    public Object readSsd()throws IOException, ParseException {

        List logInfoList = new ArrayList();
        String dir = "F:/all/ssd/";
        File[] files = new File(dir).listFiles();
        int insertFlag =0;
        for (File file : files){
            if (file.isFile() && file.exists()) { //判断文件是否存在
                System.out.println(file);
                String name = ""+file;
                logInfoList = getTxtSsd(name);
                insertFlag = getCommonService.readSsd(logInfoList);   //将集合中的数据批量入库
                System.out.println(insertFlag);//将文件中的数据读取出来，并存放进集合中
            } else {
                return ("文件不存在，请检查文件位置！");
            }
        }


        if (insertFlag == 0) {
            return "0";
        }
        return "1";
        }

    /** 读取数据，存入集合中 */
    public ArrayList<Ssd> getTxtSsd(String filepath) {
        try {
            String temp = null;
            File f = new File(filepath);
            String adn = "";
            //指定读取编码用于读取中文
            InputStreamReader read = new InputStreamReader(new FileInputStream(f), "GBK");
            //ArrayList<String> readList = new ArrayList<String>();
            ArrayList<Ssd> retList = new ArrayList<Ssd>();
            BufferedReader reader = new BufferedReader(read);

            while ((temp = reader.readLine()) != null && !"".equals(temp)) {

                Ssd pp = new Ssd();
                String [] a = temp.split("\\s+");
                pp.setArea_Station_No(Integer.valueOf(a[0]));
                pp.setLatitude(Integer.valueOf(a[1]));
                pp.setLongitude(Integer.valueOf(a[2]));
                pp.setHeight(Integer.valueOf(a[3]));
                pp.setYear(Integer.valueOf(a[4]));
                pp.setMonth(Integer.valueOf(a[5]));
                pp.setDay(Integer.valueOf(a[6]));
                pp.setSunshine_hours(Integer.valueOf(a[7]));
                pp.setSunshine_hours_quality_control_code(Integer.valueOf(a[8]));
                retList.add(pp);
            }
            read.close();
            return retList;
        } catch (Exception e) {
            // TODO: handle exception
            //logger.info("读取文件--->失败！- 原因：文件路径错误或者文件不存在");
            e.printStackTrace();
            return null;
        }
    }


    /*read pre*/
    @GetMapping("/readPre")
    public Object readPre()throws IOException, ParseException {

        List logInfoList = new ArrayList();
        String dir = "F:/all/pre/";
        File[] files = new File(dir).listFiles();
        int insertFlag =0;
        for (File file : files){
            if (file.isFile() && file.exists()) { //判断文件是否存在
                System.out.println(file);
                String name = ""+file;
                logInfoList = getTxtPre(name);
                insertFlag = getCommonService.readPre(logInfoList);   //将集合中的数据批量入库
                System.out.println(insertFlag);//将文件中的数据读取出来，并存放进集合中
            } else {
                return ("文件不存在，请检查文件位置！");
            }
        }


        if (insertFlag == 0) {
            return "0";
        }
        return "1";
    }

    /** 读取数据，存入集合中 */
    public ArrayList<Pre> getTxtPre(String filepath) {
        try {
            String temp = null;
            File f = new File(filepath);
            String adn = "";
            //指定读取编码用于读取中文
            InputStreamReader read = new InputStreamReader(new FileInputStream(f), "GBK");
            //ArrayList<String> readList = new ArrayList<String>();
            ArrayList<Pre> retList = new ArrayList<Pre>();
            BufferedReader reader = new BufferedReader(read);
            //bufReader = new BufferedReader(new FileReader(filepath));
            while ((temp = reader.readLine()) != null && !"".equals(temp)) {
                //readList.add(temp);
                Pre pp = new Pre();
                String [] a = temp.split("\\s+");
                pp.setArea_Station_No(Integer.valueOf(a[0]));
                pp.setLatitude(Integer.valueOf(a[1]));
                pp.setLongitude(Integer.valueOf(a[2]));
                pp.setHeight(Integer.valueOf(a[3]));
                pp.setYear(Integer.valueOf(a[4]));
                pp.setMonth(Integer.valueOf(a[5]));
                pp.setDay(Integer.valueOf(a[6]));
                pp.setRainfall_20_8(Integer.valueOf(a[7]));
                pp.setRainfall_8_20(Integer.valueOf(a[8]));
                pp.setRainfall_20_20(Integer.valueOf(a[9]));
                pp.setQuality_control_code_20_8(Integer.valueOf(a[10]));
                pp.setQuality_control_code_8_20(Integer.valueOf(a[11]));
                pp.setQuality_control_code_20_20(Integer.valueOf(a[12]));
                retList.add(pp);
            }
            read.close();
            return retList;
        } catch (Exception e) {
            // TODO: handle exception
            //logger.info("读取文件--->失败！- 原因：文件路径错误或者文件不存在");
            e.printStackTrace();
            return null;
        }
    }

    /*read prs*/
    @GetMapping("/readPrs")
    public Object readPrs()throws IOException, ParseException {

        List logInfoList = new ArrayList();
        String dir = "F:/all/prs/";
        File[] files = new File(dir).listFiles();
        int insertFlag =0;
        for (File file : files){
            if (file.isFile() && file.exists()) { //判断文件是否存在
                System.out.println(file);
                String name = ""+file;
                logInfoList = getTxtPrs(name);
                insertFlag = getCommonService.readPrs(logInfoList);   //将集合中的数据批量入库
                System.out.println(insertFlag);//将文件中的数据读取出来，并存放进集合中
            } else {
                return ("文件不存在，请检查文件位置！");
            }
        }


        if (insertFlag == 0) {
            return "0";
        }
        return "1";
    }

    /** 读取数据，存入集合中 */
    public ArrayList<Prs> getTxtPrs(String filepath) {
        try {
            String temp = null;
            File f = new File(filepath);
            String adn = "";
            //指定读取编码用于读取中文
            InputStreamReader read = new InputStreamReader(new FileInputStream(f), "GBK");
            ArrayList<Prs> retList = new ArrayList<Prs>();
            BufferedReader reader = new BufferedReader(read);
            while ((temp = reader.readLine()) != null && !"".equals(temp)) {
                Prs pp = new Prs();
                String [] a = temp.split("\\s+");
                pp.setArea_Station_No(Integer.valueOf(a[0]));
                pp.setLatitude(Integer.valueOf(a[1]));
                pp.setLongitude(Integer.valueOf(a[2]));
                pp.setHeight(Integer.valueOf(a[3]));
                pp.setYear(Integer.valueOf(a[4]));
                pp.setMonth(Integer.valueOf(a[5]));
                pp.setDay(Integer.valueOf(a[6]));
                pp.setAverage_pressure(Integer.valueOf(a[7]));
                pp.setThe_highest_pressure_of_day(Integer.valueOf(a[8]));
                pp.setThe_lowest_pressure_of_day(Integer.valueOf(a[9]));
                pp.setAverage_control_code(Integer.valueOf(a[10]));
                pp.setThe_highest_control_code(Integer.valueOf(a[11]));
                pp.setThe_lowest_control_code(Integer.valueOf(a[12]));
                retList.add(pp);
            }
            read.close();
            return retList;
        } catch (Exception e) {
            // TODO: handle exception
            //logger.info("读取文件--->失败！- 原因：文件路径错误或者文件不存在");
            e.printStackTrace();
            return null;
        }
    }


    /*read evp*/
    @GetMapping("/readEvp")
    public Object readEvp()throws IOException, ParseException {

        List logInfoList = new ArrayList();
        String dir = "F:/all/evp/";
        File[] files = new File(dir).listFiles();
        int insertFlag =0;
        for (File file : files){
            if (file.isFile() && file.exists()) { //判断文件是否存在
                System.out.println(file);
                String name = ""+file;
                logInfoList = getTxtEvp(name);
                insertFlag = getCommonService.readEvp(logInfoList);   //将集合中的数据批量入库
                System.out.println(insertFlag);//将文件中的数据读取出来，并存放进集合中
            } else {
                return ("文件不存在，请检查文件位置！");
            }
        }


        if (insertFlag == 0) {
            return "0";
        }
        return "1";
    }

    /** 读取数据，存入集合中 */
    public ArrayList<Evp> getTxtEvp(String filepath) {
        try {
            String temp = null;
            File f = new File(filepath);
            String adn = "";
            //指定读取编码用于读取中文
            InputStreamReader read = new InputStreamReader(new FileInputStream(f), "GBK");
            ArrayList<Evp> retList = new ArrayList<Evp>();
            BufferedReader reader = new BufferedReader(read);
            while ((temp = reader.readLine()) != null && !"".equals(temp)) {
                Evp pp = new Evp();
                String [] a = temp.split("\\s+");
                pp.setArea_Station_No(Integer.valueOf(a[0]));
                pp.setLatitude(Integer.valueOf(a[1]));
                pp.setLongitude(Integer.valueOf(a[2]));
                pp.setHeight(Integer.valueOf(a[3]));
                pp.setYear(Integer.valueOf(a[4]));
                pp.setMonth(Integer.valueOf(a[5]));
                pp.setDay(Integer.valueOf(a[6]));
                pp.setSmall_evaporation(Integer.valueOf(a[7]));
                pp.setLarge_evaporation(Integer.valueOf(a[8]));
                pp.setSmall_evaporation_control_code(Integer.valueOf(a[9]));
                pp.setLarge_evaporation_control_code(Integer.valueOf(a[10]));
                retList.add(pp);
            }
            read.close();
            return retList;
        } catch (Exception e) {
            // TODO: handle exception
            //logger.info("读取文件--->失败！- 原因：文件路径错误或者文件不存在");
            e.printStackTrace();
            return null;
        }
    }


    /*read gst*/
    @GetMapping("/readGst")
    public Object readGst()throws IOException, ParseException {

        List logInfoList = new ArrayList();
        String dir = "F:/all/gst/";
        File[] files = new File(dir).listFiles();
        int insertFlag =0;
        for (File file : files){
            if (file.isFile() && file.exists()) { //判断文件是否存在
                System.out.println(file);
                String name = ""+file;
                logInfoList = getTxtGst(name);
                insertFlag = getCommonService.readGst(logInfoList);   //将集合中的数据批量入库
                System.out.println(insertFlag);//将文件中的数据读取出来，并存放进集合中
            } else {
                return ("文件不存在，请检查文件位置！");
            }
        }


        if (insertFlag == 0) {
            return "0";
        }
        return "1";
    }

    /** 读取数据，存入集合中 */
    public ArrayList<Gst> getTxtGst(String filepath) {
        try {
            String temp = null;
            File f = new File(filepath);
            String adn = "";
            //指定读取编码用于读取中文
            InputStreamReader read = new InputStreamReader(new FileInputStream(f), "GBK");
            ArrayList<Gst> retList = new ArrayList<Gst>();
            BufferedReader reader = new BufferedReader(read);
            while ((temp = reader.readLine()) != null && !"".equals(temp)) {
                Gst pp = new Gst();
                String [] a = temp.split("\\s+");
                pp.setArea_Station_No(Integer.valueOf(a[0]));
                pp.setLatitude(Integer.valueOf(a[1]));
                pp.setLongitude(Integer.valueOf(a[2]));
                pp.setHeight(Integer.valueOf(a[3]));
                pp.setYear(Integer.valueOf(a[4]));
                pp.setMonth(Integer.valueOf(a[5]));
                pp.setDay(Integer.valueOf(a[6]));
                pp.setAverage_surface_temperature(Integer.valueOf(a[7]));
                pp.setThe_highest_surface_temperature(Integer.valueOf(a[8]));
                pp.setThe_minimum_surface_temperature(Integer.valueOf(a[9]));
                pp.setAverage_surface_temperature_quality_control_code(Integer.valueOf(a[10]));
                pp.setDaily_highest_surface_temperature_quality_control_code(Integer.valueOf(a[11]));
                pp.setDaily_minimum_surface_temperature_quality_control_code(Integer.valueOf(a[12]));
                retList.add(pp);
            }
            read.close();
            return retList;
        } catch (Exception e) {
            // TODO: handle exception
            //logger.info("读取文件--->失败！- 原因：文件路径错误或者文件不存在");
            e.printStackTrace();
            return null;
        }
    }

    /*read rhu*/
    @GetMapping("/readRhu")
    public Object readRhu()throws IOException, ParseException {

        List logInfoList = new ArrayList();
        String dir = "F:/all/rhu/";
        File[] files = new File(dir).listFiles();
        int insertFlag =0;
        for (File file : files){
            if (file.isFile() && file.exists()) { //判断文件是否存在
                System.out.println(file);
                String name = ""+file;
                logInfoList = getTxtRhu(name);
                insertFlag = getCommonService.readRhu(logInfoList);   //将集合中的数据批量入库
                System.out.println(insertFlag);//将文件中的数据读取出来，并存放进集合中
            } else {
                return ("文件不存在，请检查文件位置！");
            }
        }


        if (insertFlag == 0) {
            return "0";
        }
        return "1";
    }

    /** 读取数据，存入集合中 */
    public ArrayList<Rhu> getTxtRhu(String filepath) {
        try {
            String temp = null;
            File f = new File(filepath);
            String adn = "";
            //指定读取编码用于读取中文
            InputStreamReader read = new InputStreamReader(new FileInputStream(f), "GBK");
            ArrayList<Rhu> retList = new ArrayList<Rhu>();
            BufferedReader reader = new BufferedReader(read);
            while ((temp = reader.readLine()) != null && !"".equals(temp)) {
                Rhu pp = new Rhu();
                String [] a = temp.split("\\s+");
                pp.setArea_Station_No(Integer.valueOf(a[0]));
                pp.setLatitude(Integer.valueOf(a[1]));
                pp.setLongitude(Integer.valueOf(a[2]));
                pp.setHeight(Integer.valueOf(a[3]));
                pp.setYear(Integer.valueOf(a[4]));
                pp.setMonth(Integer.valueOf(a[5]));
                pp.setDay(Integer.valueOf(a[6]));
                pp.setAverage_relative_humidity(Integer.valueOf(a[7]));
                pp.setMinimum_relative_humidity(Integer.valueOf(a[8]));
                pp.setAverage_control_code(Integer.valueOf(a[9]));
                pp.setThe_minimum_control_code(Integer.valueOf(a[10]));
                retList.add(pp);
            }
            read.close();
            return retList;
        } catch (Exception e) {
            // TODO: handle exception
            //logger.info("读取文件--->失败！- 原因：文件路径错误或者文件不存在");
            e.printStackTrace();
            return null;
        }
    }

    /*read rhu*/
    @GetMapping("/readTem")
    public Object readTem()throws IOException, ParseException {

        List logInfoList = new ArrayList();
        String dir = "F:/all/tem/";
        File[] files = new File(dir).listFiles();
        int insertFlag =0;
        for (File file : files){
            if (file.isFile() && file.exists()) { //判断文件是否存在
                System.out.println(file);
                String name = ""+file;
                logInfoList = getTxtTem(name);
                insertFlag = getCommonService.readTem(logInfoList);   //将集合中的数据批量入库
                System.out.println(insertFlag);//将文件中的数据读取出来，并存放进集合中
            } else {
                return ("文件不存在，请检查文件位置！");
            }
        }


        if (insertFlag == 0) {
            return "0";
        }
        return "1";
    }

    /** 读取数据，存入集合中 */
    public ArrayList<Tem> getTxtTem(String filepath) {
        try {
            String temp = null;
            File f = new File(filepath);
            String adn = "";
            //指定读取编码用于读取中文
            InputStreamReader read = new InputStreamReader(new FileInputStream(f), "GBK");
            ArrayList<Tem> retList = new ArrayList<Tem>();
            BufferedReader reader = new BufferedReader(read);
            while ((temp = reader.readLine()) != null && !"".equals(temp)) {
                Tem pp = new Tem();
                String [] a = temp.split("\\s+");
                pp.setArea_Station_No(Integer.valueOf(a[0]));
                pp.setLatitude(Integer.valueOf(a[1]));
                pp.setLongitude(Integer.valueOf(a[2]));
                pp.setHeight(Integer.valueOf(a[3]));
                pp.setYear(Integer.valueOf(a[4]));
                pp.setMonth(Integer.valueOf(a[5]));
                pp.setDay(Integer.valueOf(a[6]));
                pp.setAverage_temperature(Integer.valueOf(a[7]));
                pp.setDaily_maximum_temperature(Integer.valueOf(a[8]));
                pp.setDaily_minimum_temperature(Integer.valueOf(a[9]));
                pp.setAverage_control_code(Integer.valueOf(a[10]));
                pp.setThe_highest_control_code(Integer.valueOf(a[11]));
                pp.setThe_lowest_control_code(Integer.valueOf(a[12]));
                retList.add(pp);
            }
            read.close();
            return retList;
        } catch (Exception e) {
            // TODO: handle exception
            //logger.info("读取文件--->失败！- 原因：文件路径错误或者文件不存在");
            e.printStackTrace();
            return null;
        }
    }

    /*read Win*/
    @GetMapping("/readWin")
    public Object readWin()throws IOException, ParseException {

        List logInfoList = new ArrayList();
        String dir = "F:/all/win/";
        File[] files = new File(dir).listFiles();
        int insertFlag =0;
        for (File file : files){
            if (file.isFile() && file.exists()) { //判断文件是否存在
                System.out.println(file);
                String name = ""+file;
                logInfoList = getTxtWin(name);
                insertFlag = getCommonService.readWin(logInfoList);   //将集合中的数据批量入库
                System.out.println(insertFlag);//将文件中的数据读取出来，并存放进集合中
            } else {
                return ("文件不存在，请检查文件位置！");
            }
        }


        if (insertFlag == 0) {
            return "0";
        }
        return "1";
    }

    /** 读取数据，存入集合中 */
    public ArrayList<Win> getTxtWin(String filepath) {
        try {
            String temp = null;
            File f = new File(filepath);
            String adn = "";
            //指定读取编码用于读取中文
            InputStreamReader read = new InputStreamReader(new FileInputStream(f), "GBK");
            ArrayList<Win> retList = new ArrayList<Win>();
            BufferedReader reader = new BufferedReader(read);
            while ((temp = reader.readLine()) != null && !"".equals(temp)) {
                Win pp = new Win();
                String [] a = temp.split("\\s+");
                pp.setArea_Station_No(Integer.valueOf(a[0]));
                pp.setLatitude(Integer.valueOf(a[1]));
                pp.setLongitude(Integer.valueOf(a[2]));
                pp.setHeight(Integer.valueOf(a[3]));
                pp.setYear(Integer.valueOf(a[4]));
                pp.setMonth(Integer.valueOf(a[5]));
                pp.setDay(Integer.valueOf(a[6]));
                pp.setAverage_wind_speed(Integer.valueOf(a[7]));
                pp.setMaximum_wind_speed(Integer.valueOf(a[8]));
                pp.setWind_direction_of_Maximnum_speed(Integer.valueOf(a[9]));
                pp.setLarge_wind_speed(Integer.valueOf(a[10]));
                pp.setWind_direction_of_Large_wind_speed(Integer.valueOf(a[11]));
                pp.setAverage_wind_speed_control_code(Integer.valueOf(a[12]));
                pp.setMaximum_wind_speed_control_code(Integer.valueOf(a[13]));
                pp.setWind_direction_maximum_wind_speed_control_code(Integer.valueOf(a[14]));
                pp.setLarge_wind_speed_control_code(Integer.valueOf(a[15]));
                pp.setWind_direction_large_wind_speed_control_code(Integer.valueOf(a[16]));
                retList.add(pp);
            }
            read.close();
            return retList;
        } catch (Exception e) {
            // TODO: handle exception
            //logger.info("读取文件--->失败！- 原因：文件路径错误或者文件不存在");
            e.printStackTrace();
            return null;
        }
    }
}
