package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbSum_train_plan_table;

public interface TbSum_train_plan_tableService {
    
    
    // 添加
    void addTbSum_train_plan_table(TbSum_train_plan_table tbsum_train_plan_table);
    
    // 更新
    void updateTbSum_train_plan_table(TbSum_train_plan_table tbsum_train_plan_table);
    
    // 找到所有对象
    List<TbSum_train_plan_table> findAllTbSum_train_plan_table();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbSum_train_plan_table> findTbSum_train_plan_tableBySome(TbSum_train_plan_table tbsum_train_plan_table);
    
    
    // 根据id查找
    TbSum_train_plan_table findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据header查找
    TbSum_train_plan_table findByHeader(String header);
    
    // 根据header删除
    void deleteByHeader(String header);
    
    // 根据auditor查找
    TbSum_train_plan_table findByAuditor(String auditor);
    
    // 根据auditor删除
    void deleteByAuditor(String auditor);
    
    // 根据trainobjectiveid查找
    TbSum_train_plan_table findByTrainobjectiveid(Integer trainobjectiveid);
    
    // 根据trainobjectiveid删除
    void deleteByTrainobjectiveid(Integer trainobjectiveid);
    
    
}
