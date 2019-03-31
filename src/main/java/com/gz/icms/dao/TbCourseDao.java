package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbCourseDynaSqlProvider;

import com.gz.icms.pojo.TbCourse;

public interface TbCourseDao {
    
    // 动态插入
    @SelectProvider(type=TbCourseDynaSqlProvider.class,method="insertTbCourse")
    void insertTbCourse(TbCourse tbcourse);
    
    // 动态修改
    @SelectProvider(type=TbCourseDynaSqlProvider.class,method="updateTbCourse")
    void updateTbCourse(TbCourse tbcourse);
    
    // 查找所有
    @Select("select * from " +  "course" )
    List<TbCourse> findAllTbCourse();
    
    // 动态查询
    @SelectProvider(type=TbCourseDynaSqlProvider.class,method="selectTbCourse")
    List<TbCourse> findTbCourseBySome(TbCourse tbcourse);
    
    // 根据id查询和删除
    @Select("select * from "+ "course" +" where id = #{id}")
    TbCourse findById(Integer id);
    
    @Select("delete from "+ "course" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据name查询和删除
    @Select("select * from "+ "course" +" where name = #{name}")
    TbCourse findByName(String name);
    
    @Select("delete from "+ "course" +" where name = #{name}")
    void deleteByName(String name);
    
    
    // 根据period查询和删除
    @Select("select * from "+ "course" +" where period = #{period}")
    TbCourse findByPeriod(Integer period);
    
    @Select("delete from "+ "course" +" where period = #{period}")
    void deleteByPeriod(Integer period);
    
    
    // 根据credit查询和删除
    @Select("select * from "+ "course" +" where credit = #{credit}")
    TbCourse findByCredit(Integer credit);
    
    @Select("delete from "+ "course" +" where credit = #{credit}")
    void deleteByCredit(Integer credit);
    
    
    // 根据type查询和删除
    @Select("select * from "+ "course" +" where type = #{type}")
    TbCourse findByType(Integer type);
    
    @Select("delete from "+ "course" +" where type = #{type}")
    void deleteByType(Integer type);
    
    
    // 根据header查询和删除
    @Select("select * from "+ "course" +" where header = #{header}")
    TbCourse findByHeader(String header);
    
    @Select("delete from "+ "course" +" where header = #{header}")
    void deleteByHeader(String header);
    
    
}
