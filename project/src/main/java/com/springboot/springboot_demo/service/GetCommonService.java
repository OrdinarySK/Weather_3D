package com.springboot.springboot_demo.service;


import com.springboot.springboot_demo.entity.*;
import com.springboot.springboot_demo.mapper.AdminIstrativeMapper;
import com.springboot.springboot_demo.mapper.PreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GetCommonService
 * @Description TODO
 * @Author luokai
 * @CreateDate 2019/7/24 10:07
 * @UPpdateUser luokai
 * @UpdateDate 2019/7/24 10:07
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
@Service
public class GetCommonService {

    private final String mapLevelShi="9";
    private final String mapLevelXian="11";

    @Autowired
    PreMapper preMapper;
    AdminIstrativeMapper adminIstrativeMapper;


    public Object getXzqhTree(String gbcode, String maplevel){
        if(!(gbcode == null || gbcode.isEmpty())){
            if(!(maplevel == null || maplevel.isEmpty())){
                if(mapLevelShi.equals(maplevel)){
                    //查询省下面的所有的市
                    gbcode = gbcode.substring(0, 2);
                }else if(mapLevelXian.equals(maplevel)){
                    //查询市下面的所有县
                    gbcode = gbcode.substring(0, 4);
                }

            }
        }
        return adminIstrativeMapper.getXzqhTree(gbcode, maplevel);
    }

    public Object getCitysByName(String cname){
        if(cname != null && cname !=""){
            return adminIstrativeMapper.getCitysByName(cname);
        }else{
            return null;
        }
    }

    public Object getCityXY(String gbcode){
        AdminIstrative adminIstrative = adminIstrativeMapper.getCityXY(gbcode);
        if(adminIstrative.getCenterx() == 0.0 && adminIstrative.getCentery() == 0.0){
            return adminIstrativeMapper.getUpXY(gbcode.substring(0,4), "9");
        }else{
            return adminIstrative;
        }
    }

    public int readTxt(List<Pre> log){
        int index = 0;
        for(Pre mm : log){

            preMapper.insertTxt(mm);
            index++;
        }
        return index;
    }


    /*读取ssd*/
    public int readSsd(List<Ssd> list){
        int a =0;
        int toindex = 800;
        for(int i = 0; i<list.size(); i+=800){
            if(i+800>list.size()){
                toindex = list.size()-i;
            }
            List<Ssd> newlist = list.subList(i,i+toindex);
            preMapper.insertSsd(newlist);
        }
        if(a!=0){
            return a;
        }else{
            return 0;
        }
    }

    /*读取pre*/
    public int readPre(List<Pre> list){
        int a =0;
        int toindex = 800;
        for(int i = 0; i<list.size(); i+=800){
            if(i+800>list.size()){
                toindex = list.size()-i;
            }
            List<Pre> newlist = list.subList(i,i+toindex);
            preMapper.insertPre(newlist);
        }
        if(a!=0){
            return a;
        }else{
            return 0;
        }
    }

    /*读取prs*/
    public int readPrs(List<Prs> list){
        int a =0;
        int toindex = 800;
        for(int i = 0; i<list.size(); i+=800){
            if(i+800>list.size()){
                toindex = list.size()-i;
            }
            List<Prs> newlist = list.subList(i,i+toindex);
            preMapper.insertPrs(newlist);
        }
        if(a!=0){
            return a;
        }else{
            return 0;
        }
    }

    /*读取evp*/
    public int readEvp(List<Evp> list){
        int a =0;
        int toindex = 800;
        for(int i = 0; i<list.size(); i+=800){
            if(i+800>list.size()){
                toindex = list.size()-i;
            }
            List<Evp> newlist = list.subList(i,i+toindex);
            preMapper.insertEvp(newlist);
        }
        if(a!=0){
            return a;
        }else{
            return 0;
        }
    }

    /*读取gst*/
    public int readGst(List<Gst> list){
        int a =0;
        int toindex = 800;
        for(int i = 0; i<list.size(); i+=800){
            if(i+800>list.size()){
                toindex = list.size()-i;
            }
            List<Gst> newlist = list.subList(i,i+toindex);
            preMapper.insertGst(newlist);
        }
        if(a!=0){
            return a;
        }else{
            return 0;
        }
    }


    /*读取rhu*/
    public int readRhu(List<Rhu> list){
        int a =0;
        int toindex = 800;
        for(int i = 0; i<list.size(); i+=800){
            if(i+800>list.size()){
                toindex = list.size()-i;
            }
            List<Rhu> newlist = list.subList(i,i+toindex);
            preMapper.insertRhu(newlist);
        }
        if(a!=0){
            return a;
        }else{
            return 0;
        }
    }

    /*读取rhu*/
    public int readTem(List<Tem> list){
        int a =0;
        int toindex = 800;
        for(int i = 0; i<list.size(); i+=800){
            if(i+800>list.size()){
                toindex = list.size()-i;
            }
            List<Tem> newlist = list.subList(i,i+toindex);
            preMapper.insertTem(newlist);
        }
        if(a!=0){
            return a;
        }else{
            return 0;
        }
    }

    /*读取win*/
    public int readWin(List<Win> list){
        int a =0;
        int toindex = 800;
        for(int i = 0; i<list.size(); i+=800){
            if(i+800>list.size()){
                toindex = list.size()-i;
            }
            List<Win> newlist = list.subList(i,i+toindex);
            preMapper.insertWin(newlist);
        }
        if(a!=0){
            return a;
        }else{
            return 0;
        }
    }

}
