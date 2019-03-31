package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbSpecialtyDynaSqlProvider;

import com.gz.icms.pojo.TbSpecialty;

public interface TbSpecialtyDao {
    
    // 动态插入
    @SelectProvider(type=TbSpecialtyDynaSqlProvider.class,method="insertTbSpecialty")
    void insertTbSpecialty(TbSpecialty tbspecialty);
    
    // 动态修改
    @SelectProvider(type=TbSpecialtyDynaSqlProvider.class,method="updateTbSpecialty")
    void updateTbSpecialty(TbSpecialty tbspecialty);
    
    // 查找所有
    @Select("select * from " +  "specialty" )
    List<TbSpecialty> findAllTbSpecialty();
    
    // 动态查询
    @SelectProvider(type=TbSpecialtyDynaSqlProvider.class,method="selectTbSpecialty")
    List<TbSpecialty> findTbSpecialtyBySome(TbSpecialty tbspecialty);
    
    // 根据id查询和删除
    @Select("select * from "+ "specialty" +" where id = #{id}")
    TbSpecialty findById(Integer id);
    
    @Select("delete from "+ "specialty" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据header查询和删除
    @Select("select * from "+ "specialty" +" where header = #{header}")
    TbSpecialty findByHeader(String header);
    
    @Select("delete from "+ "specialty" +" where header = #{header}")
    void deleteByHeader(String header);
    
    
    // 根据name查询和删除
    @Select("select * from "+ "specialty" +" where name = #{name}")
    TbSpecialty findByName(String name);
    
    @Select("delete from "+ "specialty" +" where name = #{name}")
    void deleteByName(String name);
    
    
    // 根据explain查询和删除
    @Select("select * from "+ "specialty" +" where explain = #{explain}")
    TbSpecialty findByExplain(String explain);
    
    @Select("delete from "+ "specialty" +" where explain = #{explain}")
    void deleteByExplain(String explain);
    
    
}
