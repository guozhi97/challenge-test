package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbTrain_plan_detial_table;

public interface TbTrain_plan_detial_tableService {
    
    
    // 添加
    void addTbTrain_plan_detial_table(TbTrain_plan_detial_table tbtrain_plan_detial_table);
    
    // 更新
    void updateTbTrain_plan_detial_table(TbTrain_plan_detial_table tbtrain_plan_detial_table);
    
    // 找到所有对象
    List<TbTrain_plan_detial_table> findAllTbTrain_plan_detial_table();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbTrain_plan_detial_table> findTbTrain_plan_detial_tableBySome(TbTrain_plan_detial_table tbtrain_plan_detial_table);
    
    
    // 根据id查找
    TbTrain_plan_detial_table findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据coursename查找
    TbTrain_plan_detial_table findByCoursename(String coursename);
    
    // 根据coursename删除
    void deleteByCoursename(String coursename);
    
    // 根据credit查找
    TbTrain_plan_detial_table findByCredit(String credit);
    
    // 根据credit删除
    void deleteByCredit(String credit);
    
    // 根据term查找
    TbTrain_plan_detial_table findByTerm(String term);
    
    // 根据term删除
    void deleteByTerm(String term);
    
    // 根据version查找
    TbTrain_plan_detial_table findByVersion(String version);
    
    // 根据version删除
    void deleteByVersion(String version);
    
    // 根据trainplanid查找
    TbTrain_plan_detial_table findByTrainplanid(Integer trainplanid);
    
    // 根据trainplanid删除
    void deleteByTrainplanid(Integer trainplanid);
    
    
}
