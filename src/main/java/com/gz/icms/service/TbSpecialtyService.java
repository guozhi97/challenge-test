package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbSpecialty;

public interface TbSpecialtyService {
    
    
    // 添加
    void addTbSpecialty(TbSpecialty tbspecialty);
    
    // 更新
    void updateTbSpecialty(TbSpecialty tbspecialty);
    
    // 找到所有对象
    List<TbSpecialty> findAllTbSpecialty();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbSpecialty> findTbSpecialtyBySome(TbSpecialty tbspecialty);
    
    
    // 根据id查找
    TbSpecialty findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据header查找
    TbSpecialty findByHeader(String header);
    
    // 根据header删除
    void deleteByHeader(String header);
    
    // 根据name查找
    TbSpecialty findByName(String name);
    
    // 根据name删除
    void deleteByName(String name);
    
    // 根据explain查找
    TbSpecialty findByExplain(String explain);
    
    // 根据explain删除
    void deleteByExplain(String explain);
    
    
}
