package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbCourse_typeDynaSqlProvider;

import com.gz.icms.pojo.TbCourse_type;

public interface TbCourse_typeDao {
    
    // 动态插入
    @SelectProvider(type=TbCourse_typeDynaSqlProvider.class,method="insertTbCourse_type")
    void insertTbCourse_type(TbCourse_type tbcourse_type);
    
    // 动态修改
    @SelectProvider(type=TbCourse_typeDynaSqlProvider.class,method="updateTbCourse_type")
    void updateTbCourse_type(TbCourse_type tbcourse_type);
    
    // 查找所有
    @Select("select * from " +  "course_type" )
    List<TbCourse_type> findAllTbCourse_type();
    
    // 动态查询
    @SelectProvider(type=TbCourse_typeDynaSqlProvider.class,method="selectTbCourse_type")
    List<TbCourse_type> findTbCourse_typeBySome(TbCourse_type tbcourse_type);
    
    // 根据id查询和删除
    @Select("select * from "+ "course_type" +" where id = #{id}")
    TbCourse_type findById(Integer id);
    
    @Select("delete from "+ "course_type" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据typename查询和删除
    @Select("select * from "+ "course_type" +" where typename = #{typename}")
    TbCourse_type findByTypename(String typename);
    
    @Select("delete from "+ "course_type" +" where typename = #{typename}")
    void deleteByTypename(String typename);
    
    
}
