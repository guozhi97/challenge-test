package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbTrain_objective_tableDynaSqlProvider;

import com.gz.icms.pojo.TbTrain_objective_table;

public interface TbTrain_objective_tableDao {
    
    // 动态插入
    @SelectProvider(type=TbTrain_objective_tableDynaSqlProvider.class,method="insertTbTrain_objective_table")
    void insertTbTrain_objective_table(TbTrain_objective_table tbtrain_objective_table);
    
    // 动态修改
    @SelectProvider(type=TbTrain_objective_tableDynaSqlProvider.class,method="updateTbTrain_objective_table")
    void updateTbTrain_objective_table(TbTrain_objective_table tbtrain_objective_table);
    
    // 查找所有
    @Select("select * from " +  "train_objective_table" )
    List<TbTrain_objective_table> findAllTbTrain_objective_table();
    
    // 动态查询
    @SelectProvider(type=TbTrain_objective_tableDynaSqlProvider.class,method="selectTbTrain_objective_table")
    List<TbTrain_objective_table> findTbTrain_objective_tableBySome(TbTrain_objective_table tbtrain_objective_table);
    
    // 根据id查询和删除
    @Select("select * from "+ "train_objective_table" +" where id = #{id}")
    TbTrain_objective_table findById(Integer id);
    
    @Select("delete from "+ "train_objective_table" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据header查询和删除
    @Select("select * from "+ "train_objective_table" +" where header = #{header}")
    TbTrain_objective_table findByHeader(String header);
    
    @Select("delete from "+ "train_objective_table" +" where header = #{header}")
    void deleteByHeader(String header);
    
    
    // 根据specialtyid查询和删除
    @Select("select * from "+ "train_objective_table" +" where specialtyid = #{specialtyid}")
    TbTrain_objective_table findBySpecialtyid(Integer specialtyid);
    
    @Select("delete from "+ "train_objective_table" +" where specialtyid = #{specialtyid}")
    void deleteBySpecialtyid(Integer specialtyid);
    
    
    // 根据content查询和删除
    @Select("select * from "+ "train_objective_table" +" where content = #{content}")
    TbTrain_objective_table findByContent(String content);
    
    @Select("delete from "+ "train_objective_table" +" where content = #{content}")
    void deleteByContent(String content);
    
    
    // 根据version查询和删除
    @Select("select * from "+ "train_objective_table" +" where version = #{version}")
    TbTrain_objective_table findByVersion(String version);
    
    @Select("delete from "+ "train_objective_table" +" where version = #{version}")
    void deleteByVersion(String version);
    
    
    // 根据auditor查询和删除
    @Select("select * from "+ "train_objective_table" +" where auditor = #{auditor}")
    TbTrain_objective_table findByAuditor(String auditor);
    
    @Select("delete from "+ "train_objective_table" +" where auditor = #{auditor}")
    void deleteByAuditor(String auditor);
    
    
}
