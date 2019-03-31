package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbCourse;

public interface TbCourseService {
    
    
    // 添加
    void addTbCourse(TbCourse tbcourse);
    
    // 更新
    void updateTbCourse(TbCourse tbcourse);
    
    // 找到所有对象
    List<TbCourse> findAllTbCourse();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbCourse> findTbCourseBySome(TbCourse tbcourse);
    
    
    // 根据id查找
    TbCourse findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据name查找
    TbCourse findByName(String name);
    
    // 根据name删除
    void deleteByName(String name);
    
    // 根据period查找
    TbCourse findByPeriod(Integer period);
    
    // 根据period删除
    void deleteByPeriod(Integer period);
    
    // 根据credit查找
    TbCourse findByCredit(Integer credit);
    
    // 根据credit删除
    void deleteByCredit(Integer credit);
    
    // 根据type查找
    TbCourse findByType(Integer type);
    
    // 根据type删除
    void deleteByType(Integer type);
    
    // 根据header查找
    TbCourse findByHeader(String header);
    
    // 根据header删除
    void deleteByHeader(String header);
    
    
}
