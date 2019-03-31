package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbTeacherDynaSqlProvider;

import com.gz.icms.pojo.TbTeacher;

public interface TbTeacherDao {
    
    // 动态插入
    @SelectProvider(type=TbTeacherDynaSqlProvider.class,method="insertTbTeacher")
    void insertTbTeacher(TbTeacher tbteacher);
    
    // 动态修改
    @SelectProvider(type=TbTeacherDynaSqlProvider.class,method="updateTbTeacher")
    void updateTbTeacher(TbTeacher tbteacher);
    
    // 查找所有
    @Select("select * from " +  "teacher" )
    List<TbTeacher> findAllTbTeacher();
    
    // 动态查询
    @SelectProvider(type=TbTeacherDynaSqlProvider.class,method="selectTbTeacher")
    List<TbTeacher> findTbTeacherBySome(TbTeacher tbteacher);
    
    // 根据id查询和删除
    @Select("select * from "+ "teacher" +" where id = #{id}")
    TbTeacher findById(String id);
    
    @Select("delete from "+ "teacher" +" where id = #{id}")
    void deleteById(String id);
    
    
    // 根据name查询和删除
    @Select("select * from "+ "teacher" +" where name = #{name}")
    TbTeacher findByName(String name);
    
    @Select("delete from "+ "teacher" +" where name = #{name}")
    void deleteByName(String name);
    
    
    // 根据password查询和删除
    @Select("select * from "+ "teacher" +" where password = #{password}")
    TbTeacher findByPassword(String password);
    
    @Select("delete from "+ "teacher" +" where password = #{password}")
    void deleteByPassword(String password);
    
    
    // 根据email查询和删除
    @Select("select * from "+ "teacher" +" where email = #{email}")
    TbTeacher findByEmail(String email);
    
    @Select("delete from "+ "teacher" +" where email = #{email}")
    void deleteByEmail(String email);
    
    
    // 根据academic查询和删除
    @Select("select * from "+ "teacher" +" where academic = #{academic}")
    TbTeacher findByAcademic(String academic);
    
    @Select("delete from "+ "teacher" +" where academic = #{academic}")
    void deleteByAcademic(String academic);
    
    
    // 根据tell查询和删除
    @Select("select * from "+ "teacher" +" where tell = #{tell}")
    TbTeacher findByTell(String tell);
    
    @Select("delete from "+ "teacher" +" where tell = #{tell}")
    void deleteByTell(String tell);
    
    
}
