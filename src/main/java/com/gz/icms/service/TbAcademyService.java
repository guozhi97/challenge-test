package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbAcademy;

public interface TbAcademyService {
    
    
    // 添加
    void addTbAcademy(TbAcademy tbacademy);
    
    // 更新
    void updateTbAcademy(TbAcademy tbacademy);
    
    // 找到所有对象
    List<TbAcademy> findAllTbAcademy();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbAcademy> findTbAcademyBySome(TbAcademy tbacademy);
    
    
    // 根据id查找
    TbAcademy findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据name查找
    TbAcademy findByName(String name);
    
    // 根据name删除
    void deleteByName(String name);
    
    // 根据school查找
    TbAcademy findBySchool(String school);
    
    // 根据school删除
    void deleteBySchool(String school);
    
    // 根据auditor查找
    TbAcademy findByAuditor(String auditor);
    
    // 根据auditor删除
    void deleteByAuditor(String auditor);
    
    
}
