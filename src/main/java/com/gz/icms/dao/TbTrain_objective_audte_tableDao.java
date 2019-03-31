package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbTrain_objective_audte_tableDynaSqlProvider;

import com.gz.icms.pojo.TbTrain_objective_audte_table;

public interface TbTrain_objective_audte_tableDao {
    
    // 动态插入
    @SelectProvider(type=TbTrain_objective_audte_tableDynaSqlProvider.class,method="insertTbTrain_objective_audte_table")
    void insertTbTrain_objective_audte_table(TbTrain_objective_audte_table tbtrain_objective_audte_table);
    
    // 动态修改
    @SelectProvider(type=TbTrain_objective_audte_tableDynaSqlProvider.class,method="updateTbTrain_objective_audte_table")
    void updateTbTrain_objective_audte_table(TbTrain_objective_audte_table tbtrain_objective_audte_table);
    
    // 查找所有
    @Select("select * from " +  "train_objective_audte_table" )
    List<TbTrain_objective_audte_table> findAllTbTrain_objective_audte_table();
    
    // 动态查询
    @SelectProvider(type=TbTrain_objective_audte_tableDynaSqlProvider.class,method="selectTbTrain_objective_audte_table")
    List<TbTrain_objective_audte_table> findTbTrain_objective_audte_tableBySome(TbTrain_objective_audte_table tbtrain_objective_audte_table);
    
    // 根据id查询和删除
    @Select("select * from "+ "train_objective_audte_table" +" where id = #{id}")
    TbTrain_objective_audte_table findById(Integer id);
    
    @Select("delete from "+ "train_objective_audte_table" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据auditor查询和删除
    @Select("select * from "+ "train_objective_audte_table" +" where auditor = #{auditor}")
    TbTrain_objective_audte_table findByAuditor(String auditor);
    
    @Select("delete from "+ "train_objective_audte_table" +" where auditor = #{auditor}")
    void deleteByAuditor(String auditor);
    
    
    // 根据trainobjectiveid查询和删除
    @Select("select * from "+ "train_objective_audte_table" +" where trainobjectiveid = #{trainobjectiveid}")
    TbTrain_objective_audte_table findByTrainobjectiveid(Integer trainobjectiveid);
    
    @Select("delete from "+ "train_objective_audte_table" +" where trainobjectiveid = #{trainobjectiveid}")
    void deleteByTrainobjectiveid(Integer trainobjectiveid);
    
    
    // 根据outcome查询和删除
    @Select("select * from "+ "train_objective_audte_table" +" where outcome = #{outcome}")
    TbTrain_objective_audte_table findByOutcome(String outcome);
    
    @Select("delete from "+ "train_objective_audte_table" +" where outcome = #{outcome}")
    void deleteByOutcome(String outcome);
    
    
}
