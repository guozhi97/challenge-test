package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbCourse_taskDynaSqlProvider;

import com.gz.icms.pojo.TbCourse_task;

public interface TbCourse_taskDao {
    
    // 动态插入
    @SelectProvider(type=TbCourse_taskDynaSqlProvider.class,method="insertTbCourse_task")
    void insertTbCourse_task(TbCourse_task tbcourse_task);
    
    // 动态修改
    @SelectProvider(type=TbCourse_taskDynaSqlProvider.class,method="updateTbCourse_task")
    void updateTbCourse_task(TbCourse_task tbcourse_task);
    
    // 查找所有
    @Select("select * from " +  "course_task" )
    List<TbCourse_task> findAllTbCourse_task();
    
    // 动态查询
    @SelectProvider(type=TbCourse_taskDynaSqlProvider.class,method="selectTbCourse_task")
    List<TbCourse_task> findTbCourse_taskBySome(TbCourse_task tbcourse_task);
    
    // 根据id查询和删除
    @Select("select * from "+ "course_task" +" where id = #{id}")
    TbCourse_task findById(Integer id);
    
    @Select("delete from "+ "course_task" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据chapterid查询和删除
    @Select("select * from "+ "course_task" +" where chapterid = #{chapterid}")
    TbCourse_task findByChapterid(Integer chapterid);
    
    @Select("delete from "+ "course_task" +" where chapterid = #{chapterid}")
    void deleteByChapterid(Integer chapterid);
    
    
    // 根据content查询和删除
    @Select("select * from "+ "course_task" +" where content = #{content}")
    TbCourse_task findByContent(String content);
    
    @Select("delete from "+ "course_task" +" where content = #{content}")
    void deleteByContent(String content);
    
    
}
