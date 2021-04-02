package com.springboot.springboot_demo.mapper;

import com.springboot.springboot_demo.entity.AdminIstrative;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface AdminIstrativeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminIstrative record);

    int insertSelective(AdminIstrative record);

    AdminIstrative selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminIstrative record);

    int updateByPrimaryKey(AdminIstrative record);

    /**
     * 查询行政区划树
     * */
    List<AdminIstrative> getXzqhTree(@Param("gbcode") String gbcode, @Param("maplevel") String maplevel);

    List<AdminIstrative> getCitysByName(@Param("cname") String cname);

    AdminIstrative getCityXY(@Param("gbcode") String gbcode);

    AdminIstrative getUpXY(@Param("gbcode") String gbcode, @Param("maplevel") String maplevel);
}