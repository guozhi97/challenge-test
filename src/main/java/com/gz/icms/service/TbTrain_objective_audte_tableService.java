package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbTrain_objective_audte_table;

public interface TbTrain_objective_audte_tableService {
    
    
    // 添加
    void addTbTrain_objective_audte_table(TbTrain_objective_audte_table tbtrain_objective_audte_table);
    
    // 更新
    void updateTbTrain_objective_audte_table(TbTrain_objective_audte_table tbtrain_objective_audte_table);
    
    // 找到所有对象
    List<TbTrain_objective_audte_table> findAllTbTrain_objective_audte_table();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbTrain_objective_audte_table> findTbTrain_objective_audte_tableBySome(TbTrain_objective_audte_table tbtrain_objective_audte_table);
    
    
    // 根据id查找
    TbTrain_objective_audte_table findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据auditor查找
    TbTrain_objective_audte_table findByAuditor(String auditor);
    
    // 根据auditor删除
    void deleteByAuditor(String auditor);
    
    // 根据trainobjectiveid查找
    TbTrain_objective_audte_table findByTrainobjectiveid(Integer trainobjectiveid);
    
    // 根据trainobjectiveid删除
    void deleteByTrainobjectiveid(Integer trainobjectiveid);
    
    // 根据outcome查找
    TbTrain_objective_audte_table findByOutcome(String outcome);
    
    // 根据outcome删除
    void deleteByOutcome(String outcome);
    
    
}
