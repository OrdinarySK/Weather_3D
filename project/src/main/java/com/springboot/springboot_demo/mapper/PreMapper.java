package com.springboot.springboot_demo.mapper;

import com.springboot.springboot_demo.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName PreMapper
 * @Description TODO
 * @Author luokai
 * @CreateDate 2020/10/20 20:45
 * @UPpdateUser luokai
 * @UpdateDate 2020/10/20 20:45
 * @UpdateRemark
 * @Version 1.0
 * Copyright (c) 2019,武汉中地云申科技有限公司
 * All rights reserved.
 **/
@Mapper
@Repository
public interface PreMapper {
     int insertTxt(Pre log);

     int insertSsd(@Param(value = "list") List<Ssd> list);

     int insertPre(@Param(value="list") List<Pre> list);
     int insertPrs(@Param(value="list") List<Prs> list);
     int insertEvp(@Param(value="list") List<Evp> list);
     int insertGst(@Param(value="list") List<Gst> list);
     int insertRhu(@Param(value="list") List<Rhu> list);
     int insertTem(@Param(value="list") List<Tem> list);
     int insertWin(@Param(value="list") List<Win> list);
}
