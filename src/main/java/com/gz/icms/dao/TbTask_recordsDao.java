package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbTask_recordsDynaSqlProvider;

import com.gz.icms.pojo.TbTask_records;

public interface TbTask_recordsDao {
    
    // 动态插入
    @SelectProvider(type=TbTask_recordsDynaSqlProvider.class,method="insertTbTask_records")
    void insertTbTask_records(TbTask_records tbtask_records);
    
    // 动态修改
    @SelectProvider(type=TbTask_recordsDynaSqlProvider.class,method="updateTbTask_records")
    void updateTbTask_records(TbTask_records tbtask_records);
    
    // 查找所有
    @Select("select * from " +  "task_records" )
    List<TbTask_records> findAllTbTask_records();
    
    // 动态查询
    @SelectProvider(type=TbTask_recordsDynaSqlProvider.class,method="selectTbTask_records")
    List<TbTask_records> findTbTask_recordsBySome(TbTask_records tbtask_records);
    
    // 根据id查询和删除
    @Select("select * from "+ "task_records" +" where id = #{id}")
    TbTask_records findById(Integer id);
    
    @Select("delete from "+ "task_records" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据taskid查询和删除
    @Select("select * from "+ "task_records" +" where taskid = #{taskid}")
    TbTask_records findByTaskid(Integer taskid);
    
    @Select("delete from "+ "task_records" +" where taskid = #{taskid}")
    void deleteByTaskid(Integer taskid);
    
    
    // 根据studentid查询和删除
    @Select("select * from "+ "task_records" +" where studentid = #{studentid}")
    TbTask_records findByStudentid(String studentid);
    
    @Select("delete from "+ "task_records" +" where studentid = #{studentid}")
    void deleteByStudentid(String studentid);
    
    
}
