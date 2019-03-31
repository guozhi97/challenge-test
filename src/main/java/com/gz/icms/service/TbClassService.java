package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbClass;

public interface TbClassService {
    
    
    // 添加
    void addTbClass(TbClass tbclass);
    
    // 更新
    void updateTbClass(TbClass tbclass);
    
    // 找到所有对象
    List<TbClass> findAllTbClass();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbClass> findTbClassBySome(TbClass tbclass);
    
    
    // 根据id查找
    TbClass findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据name查找
    TbClass findByName(String name);
    
    // 根据name删除
    void deleteByName(String name);
    
    // 根据teacherid查找
    TbClass findByTeacherid(String teacherid);
    
    // 根据teacherid删除
    void deleteByTeacherid(String teacherid);
    
    // 根据courseid查找
    TbClass findByCourseid(Integer courseid);
    
    // 根据courseid删除
    void deleteByCourseid(Integer courseid);
    
    
}
