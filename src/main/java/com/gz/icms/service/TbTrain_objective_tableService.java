package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbTrain_objective_table;

public interface TbTrain_objective_tableService {
    
    
    // 添加
    void addTbTrain_objective_table(TbTrain_objective_table tbtrain_objective_table);
    
    // 更新
    void updateTbTrain_objective_table(TbTrain_objective_table tbtrain_objective_table);
    
    // 找到所有对象
    List<TbTrain_objective_table> findAllTbTrain_objective_table();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbTrain_objective_table> findTbTrain_objective_tableBySome(TbTrain_objective_table tbtrain_objective_table);
    
    
    // 根据id查找
    TbTrain_objective_table findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据header查找
    TbTrain_objective_table findByHeader(String header);
    
    // 根据header删除
    void deleteByHeader(String header);
    
    // 根据specialtyid查找
    TbTrain_objective_table findBySpecialtyid(Integer specialtyid);
    
    // 根据specialtyid删除
    void deleteBySpecialtyid(Integer specialtyid);
    
    // 根据content查找
    TbTrain_objective_table findByContent(String content);
    
    // 根据content删除
    void deleteByContent(String content);
    
    // 根据version查找
    TbTrain_objective_table findByVersion(String version);
    
    // 根据version删除
    void deleteByVersion(String version);
    
    // 根据auditor查找
    TbTrain_objective_table findByAuditor(String auditor);
    
    // 根据auditor删除
    void deleteByAuditor(String auditor);
    
    
}
