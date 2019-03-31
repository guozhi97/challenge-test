package com.gz.icms.dao;

import java.util.List;

import com.gz.icms.pojo.TbAcademy;
import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbAcademyDynaSqlProvider;

public interface TbAcademyDao {
    
    // 动态插入
    @SelectProvider(type=TbAcademyDynaSqlProvider.class,method="insertTbAcademy")
    void insertTbAcademy(TbAcademy tbacademy);
    
    // 动态修改
    @SelectProvider(type=TbAcademyDynaSqlProvider.class,method="updateTbAcademy")
    void updateTbAcademy(TbAcademy tbacademy);
    
    // 查找所有
    @Select("select * from " +  "academy" )
    List<TbAcademy> findAllTbAcademy();
    
    // 动态查询
    @SelectProvider(type=TbAcademyDynaSqlProvider.class,method="selectTbAcademy")
    List<TbAcademy> findTbAcademyBySome(TbAcademy tbacademy);
    
    // 根据id查询和删除
    @Select("select * from "+ "academy" +" where id = #{id}")
    TbAcademy findById(Integer id);
    
    @Select("delete from "+ "academy" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据name查询和删除
    @Select("select * from "+ "academy" +" where name = #{name}")
    TbAcademy findByName(String name);
    
    @Select("delete from "+ "academy" +" where name = #{name}")
    void deleteByName(String name);
    
    
    // 根据school查询和删除
    @Select("select * from "+ "academy" +" where school = #{school}")
    TbAcademy findBySchool(String school);
    
    @Select("delete from "+ "academy" +" where school = #{school}")
    void deleteBySchool(String school);
    
    
    // 根据auditor查询和删除
    @Select("select * from "+ "academy" +" where auditor = #{auditor}")
    TbAcademy findByAuditor(String auditor);
    
    @Select("delete from "+ "academy" +" where auditor = #{auditor}")
    void deleteByAuditor(String auditor);
    
    
}
