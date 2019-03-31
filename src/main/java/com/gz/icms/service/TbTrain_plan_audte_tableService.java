package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbTrain_plan_audte_table;

public interface TbTrain_plan_audte_tableService {
    
    
    // 添加
    void addTbTrain_plan_audte_table(TbTrain_plan_audte_table tbtrain_plan_audte_table);
    
    // 更新
    void updateTbTrain_plan_audte_table(TbTrain_plan_audte_table tbtrain_plan_audte_table);
    
    // 找到所有对象
    List<TbTrain_plan_audte_table> findAllTbTrain_plan_audte_table();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbTrain_plan_audte_table> findTbTrain_plan_audte_tableBySome(TbTrain_plan_audte_table tbtrain_plan_audte_table);
    
    
    // 根据id查找
    TbTrain_plan_audte_table findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据auditor查找
    TbTrain_plan_audte_table findByAuditor(String auditor);
    
    // 根据auditor删除
    void deleteByAuditor(String auditor);
    
    // 根据trainplanid查找
    TbTrain_plan_audte_table findByTrainplanid(Integer trainplanid);
    
    // 根据trainplanid删除
    void deleteByTrainplanid(Integer trainplanid);
    
    // 根据outcome查找
    TbTrain_plan_audte_table findByOutcome(String outcome);
    
    // 根据outcome删除
    void deleteByOutcome(String outcome);
    
    
}
