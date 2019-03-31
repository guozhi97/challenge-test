package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbStudent_courseDynaSqlProvider;

import com.gz.icms.pojo.TbStudent_course;

public interface TbStudent_courseDao {
    
    // 动态插入
    @SelectProvider(type=TbStudent_courseDynaSqlProvider.class,method="insertTbStudent_course")
    void insertTbStudent_course(TbStudent_course tbstudent_course);
    
    // 动态修改
    @SelectProvider(type=TbStudent_courseDynaSqlProvider.class,method="updateTbStudent_course")
    void updateTbStudent_course(TbStudent_course tbstudent_course);
    
    // 查找所有
    @Select("select * from " +  "student_course" )
    List<TbStudent_course> findAllTbStudent_course();
    
    // 动态查询
    @SelectProvider(type=TbStudent_courseDynaSqlProvider.class,method="selectTbStudent_course")
    List<TbStudent_course> findTbStudent_courseBySome(TbStudent_course tbstudent_course);
    
    // 根据id查询和删除
    @Select("select * from "+ "student_course" +" where id = #{id}")
    TbStudent_course findById(Integer id);
    
    @Select("delete from "+ "student_course" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据studentid查询和删除
    @Select("select * from "+ "student_course" +" where studentid = #{studentid}")
    TbStudent_course findByStudentid(String studentid);
    
    @Select("delete from "+ "student_course" +" where studentid = #{studentid}")
    void deleteByStudentid(String studentid);
    
    
    // 根据classid查询和删除
    @Select("select * from "+ "student_course" +" where classid = #{classid}")
    TbStudent_course findByClassid(Integer classid);
    
    @Select("delete from "+ "student_course" +" where classid = #{classid}")
    void deleteByClassid(Integer classid);
    
    
}
