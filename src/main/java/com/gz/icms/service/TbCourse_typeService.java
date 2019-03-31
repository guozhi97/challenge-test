package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbCourse_type;

public interface TbCourse_typeService {
    
    
    // 添加
    void addTbCourse_type(TbCourse_type tbcourse_type);
    
    // 更新
    void updateTbCourse_type(TbCourse_type tbcourse_type);
    
    // 找到所有对象
    List<TbCourse_type> findAllTbCourse_type();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbCourse_type> findTbCourse_typeBySome(TbCourse_type tbcourse_type);
    
    
    // 根据id查找
    TbCourse_type findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据typename查找
    TbCourse_type findByTypename(String typename);
    
    // 根据typename删除
    void deleteByTypename(String typename);
    
    
}
