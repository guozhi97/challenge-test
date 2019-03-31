package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbTask_records;

public interface TbTask_recordsService {
    
    
    // 添加
    void addTbTask_records(TbTask_records tbtask_records);
    
    // 更新
    void updateTbTask_records(TbTask_records tbtask_records);
    
    // 找到所有对象
    List<TbTask_records> findAllTbTask_records();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbTask_records> findTbTask_recordsBySome(TbTask_records tbtask_records);
    
    
    // 根据id查找
    TbTask_records findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据taskid查找
    TbTask_records findByTaskid(Integer taskid);
    
    // 根据taskid删除
    void deleteByTaskid(Integer taskid);
    
    // 根据studentid查找
    TbTask_records findByStudentid(String studentid);
    
    // 根据studentid删除
    void deleteByStudentid(String studentid);
    
    
}
