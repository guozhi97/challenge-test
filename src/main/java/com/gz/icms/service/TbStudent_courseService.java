package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbStudent_course;

public interface TbStudent_courseService {
    
    
    // 添加
    void addTbStudent_course(TbStudent_course tbstudent_course);
    
    // 更新
    void updateTbStudent_course(TbStudent_course tbstudent_course);
    
    // 找到所有对象
    List<TbStudent_course> findAllTbStudent_course();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbStudent_course> findTbStudent_courseBySome(TbStudent_course tbstudent_course);
    
    
    // 根据id查找
    TbStudent_course findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据studentid查找
    TbStudent_course findByStudentid(String studentid);
    
    // 根据studentid删除
    void deleteByStudentid(String studentid);
    
    // 根据classid查找
    TbStudent_course findByClassid(Integer classid);
    
    // 根据classid删除
    void deleteByClassid(Integer classid);
    
    
}
