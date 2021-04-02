package com.springboot.springboot_demo.controller;

import com.springboot.springboot_demo.entity.Pre;
import com.springboot.springboot_demo.service.GetCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GetCommonController
 * @Description TODO
 * @Author luokai
 * @CreateDate 2019/7/24 10:03
 * @UPpdateUser luokai
 * @UpdateDate 2019/7/24 10:03
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
@RestController
@RequestMapping("/ggys")
public class GetCommonController {

    @Autowired
    GetCommonService getCommonService;
    /**
     * 查询行政区
     */
    @GetMapping("/getXzqhTree")
     public Object getXzqhTree(String gbcode, String maplevel){
        return getCommonService.getXzqhTree(gbcode, maplevel);
    }

    /**
     * 根据城市模糊查询获取索引
     */
    @GetMapping(value="/getCitysByName")
    public Object getCitysByName(String cname){
        return getCommonService.getCitysByName(cname);
    }

    /**
     * 根据选定的城市获取城市经纬度
     * @param gbcode
     * @return
     */
    @GetMapping(value = "/getCityXY")
    public Object getCityXY(String gbcode){
        return getCommonService.getCityXY(gbcode);
    }


    @GetMapping(value = "/readTxt")
    public Object readTxt()throws IOException, ParseException {


            List logInfoList = new ArrayList();
            String dir = "F:/all/pre/";
            File[] files = new File(dir).listFiles();
            int insertFlag =0;
            for (File file : files){
                if (file.isFile() && file.exists()) { //判断文件是否存在
                    System.out.println(file);
                    String name = ""+file;
                    logInfoList = getTxt(name);
                     insertFlag = getCommonService.readTxt(logInfoList);   //将集合中的数据批量入库
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
    public ArrayList<Pre> getTxt(String filepath) {
        try {
            String temp = null;
            File f = new File(filepath);
            String adn = "";
            //指定读取编码用于读取中文
            InputStreamReader read = new InputStreamReader(new FileInputStream(f), "GBK");
            ArrayList<String> readList = new ArrayList<String>();
            ArrayList<Pre> retList = new ArrayList<Pre>();
            BufferedReader reader = new BufferedReader(read);
            //bufReader = new BufferedReader(new FileReader(filepath));
            while ((temp = reader.readLine()) != null && !"".equals(temp)) {
                readList.add(temp);
                Pre pp = new Pre();
                String [] a = temp.split("\\s+");
                pp.setArea_Station_No(Integer.valueOf(a[0]));
                pp.setLatitude(Integer.valueOf(a[1]));
                pp.setLongitude(Integer.valueOf(a[2]));
                pp.setHeight(Integer.valueOf(a[3]));
                pp.setYear(Integer.valueOf(a[4]));
                pp.setMonth(Integer.valueOf(a[5]));
                pp.setDay(Integer.valueOf(a[6]));
                pp.setRainfall_8_20(Integer.valueOf(a[7]));
                pp.setQuality_control_code_20_8(Integer.valueOf(a[8]));
                pp.setRainfall_20_20(Integer.valueOf(a[9]));
                pp.setQuality_control_code_8_20(Integer.valueOf(a[10]));
                pp.setQuality_control_code_20_8(Integer.valueOf(a[11]));
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
    }}
