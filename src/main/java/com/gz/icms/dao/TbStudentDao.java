package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbStudentDynaSqlProvider;

import com.gz.icms.pojo.TbStudent;

public interface TbStudentDao {
    
    // 动态插入
    @SelectProvider(type=TbStudentDynaSqlProvider.class,method="insertTbStudent")
    void insertTbStudent(TbStudent tbstudent);
    
    // 动态修改
    @SelectProvider(type=TbStudentDynaSqlProvider.class,method="updateTbStudent")
    void updateTbStudent(TbStudent tbstudent);
    
    // 查找所有
    @Select("select * from " +  "student" )
    List<TbStudent> findAllTbStudent();
    
    // 动态查询
    @SelectProvider(type=TbStudentDynaSqlProvider.class,method="selectTbStudent")
    List<TbStudent> findTbStudentBySome(TbStudent tbstudent);
    
    // 根据id查询和删除
    @Select("select * from "+ "student" +" where id = #{id}")
    TbStudent findById(String id);
    
    @Select("delete from "+ "student" +" where id = #{id}")
    void deleteById(String id);
    
    
    // 根据name查询和删除
    @Select("select * from "+ "student" +" where name = #{name}")
    TbStudent findByName(String name);
    
    @Select("delete from "+ "student" +" where name = #{name}")
    void deleteByName(String name);
    
    
    // 根据password查询和删除
    @Select("select * from "+ "student" +" where password = #{password}")
    TbStudent findByPassword(String password);
    
    @Select("delete from "+ "student" +" where password = #{password}")
    void deleteByPassword(String password);
    
    
    // 根据age查询和删除
    @Select("select * from "+ "student" +" where age = #{age}")
    TbStudent findByAge(Integer age);
    
    @Select("delete from "+ "student" +" where age = #{age}")
    void deleteByAge(Integer age);
    
    
    // 根据sex查询和删除
    @Select("select * from "+ "student" +" where sex = #{sex}")
    TbStudent findBySex(String sex);
    
    @Select("delete from "+ "student" +" where sex = #{sex}")
    void deleteBySex(String sex);
    
    
    // 根据tell查询和删除
    @Select("select * from "+ "student" +" where tell = #{tell}")
    TbStudent findByTell(String tell);
    
    @Select("delete from "+ "student" +" where tell = #{tell}")
    void deleteByTell(String tell);
    
    
    // 根据major查询和删除
    @Select("select * from "+ "student" +" where major = #{major}")
    TbStudent findByMajor(String major);
    
    @Select("delete from "+ "student" +" where major = #{major}")
    void deleteByMajor(String major);
    
    
    // 根据academic查询和删除
    @Select("select * from "+ "student" +" where academic = #{academic}")
    TbStudent findByAcademic(String academic);
    
    @Select("delete from "+ "student" +" where academic = #{academic}")
    void deleteByAcademic(String academic);
    
    
}
