package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbCourse_task;

public interface TbCourse_taskService {
    
    
    // 添加
    void addTbCourse_task(TbCourse_task tbcourse_task);
    
    // 更新
    void updateTbCourse_task(TbCourse_task tbcourse_task);
    
    // 找到所有对象
    List<TbCourse_task> findAllTbCourse_task();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbCourse_task> findTbCourse_taskBySome(TbCourse_task tbcourse_task);
    
    
    // 根据id查找
    TbCourse_task findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据chapterid查找
    TbCourse_task findByChapterid(Integer chapterid);
    
    // 根据chapterid删除
    void deleteByChapterid(Integer chapterid);
    
    // 根据content查找
    TbCourse_task findByContent(String content);
    
    // 根据content删除
    void deleteByContent(String content);
    
    
}
