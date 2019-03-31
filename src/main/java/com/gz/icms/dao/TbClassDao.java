package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbClassDynaSqlProvider;

import com.gz.icms.pojo.TbClass;

public interface TbClassDao {
    
    // 动态插入
    @SelectProvider(type=TbClassDynaSqlProvider.class,method="insertTbClass")
    void insertTbClass(TbClass tbclass);
    
    // 动态修改
    @SelectProvider(type=TbClassDynaSqlProvider.class,method="updateTbClass")
    void updateTbClass(TbClass tbclass);
    
    // 查找所有
    @Select("select * from " +  "class" )
    List<TbClass> findAllTbClass();
    
    // 动态查询
    @SelectProvider(type=TbClassDynaSqlProvider.class,method="selectTbClass")
    List<TbClass> findTbClassBySome(TbClass tbclass);
    
    // 根据id查询和删除
    @Select("select * from "+ "class" +" where id = #{id}")
    TbClass findById(Integer id);
    
    @Select("delete from "+ "class" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据name查询和删除
    @Select("select * from "+ "class" +" where name = #{name}")
    TbClass findByName(String name);
    
    @Select("delete from "+ "class" +" where name = #{name}")
    void deleteByName(String name);
    
    
    // 根据teacherid查询和删除
    @Select("select * from "+ "class" +" where teacherid = #{teacherid}")
    TbClass findByTeacherid(String teacherid);
    
    @Select("delete from "+ "class" +" where teacherid = #{teacherid}")
    void deleteByTeacherid(String teacherid);
    
    
    // 根据courseid查询和删除
    @Select("select * from "+ "class" +" where courseid = #{courseid}")
    TbClass findByCourseid(Integer courseid);
    
    @Select("delete from "+ "class" +" where courseid = #{courseid}")
    void deleteByCourseid(Integer courseid);
    
    
}
