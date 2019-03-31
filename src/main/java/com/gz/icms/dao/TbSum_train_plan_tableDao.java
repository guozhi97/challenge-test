package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbSum_train_plan_tableDynaSqlProvider;

import com.gz.icms.pojo.TbSum_train_plan_table;

public interface TbSum_train_plan_tableDao {
    
    // 动态插入
    @SelectProvider(type=TbSum_train_plan_tableDynaSqlProvider.class,method="insertTbSum_train_plan_table")
    void insertTbSum_train_plan_table(TbSum_train_plan_table tbsum_train_plan_table);
    
    // 动态修改
    @SelectProvider(type=TbSum_train_plan_tableDynaSqlProvider.class,method="updateTbSum_train_plan_table")
    void updateTbSum_train_plan_table(TbSum_train_plan_table tbsum_train_plan_table);
    
    // 查找所有
    @Select("select * from " +  "sum_train_plan_table" )
    List<TbSum_train_plan_table> findAllTbSum_train_plan_table();
    
    // 动态查询
    @SelectProvider(type=TbSum_train_plan_tableDynaSqlProvider.class,method="selectTbSum_train_plan_table")
    List<TbSum_train_plan_table> findTbSum_train_plan_tableBySome(TbSum_train_plan_table tbsum_train_plan_table);
    
    // 根据id查询和删除
    @Select("select * from "+ "sum_train_plan_table" +" where id = #{id}")
    TbSum_train_plan_table findById(Integer id);
    
    @Select("delete from "+ "sum_train_plan_table" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据header查询和删除
    @Select("select * from "+ "sum_train_plan_table" +" where header = #{header}")
    TbSum_train_plan_table findByHeader(String header);
    
    @Select("delete from "+ "sum_train_plan_table" +" where header = #{header}")
    void deleteByHeader(String header);
    
    
    // 根据auditor查询和删除
    @Select("select * from "+ "sum_train_plan_table" +" where auditor = #{auditor}")
    TbSum_train_plan_table findByAuditor(String auditor);
    
    @Select("delete from "+ "sum_train_plan_table" +" where auditor = #{auditor}")
    void deleteByAuditor(String auditor);
    
    
    // 根据trainobjectiveid查询和删除
    @Select("select * from "+ "sum_train_plan_table" +" where trainobjectiveid = #{trainobjectiveid}")
    TbSum_train_plan_table findByTrainobjectiveid(Integer trainobjectiveid);
    
    @Select("delete from "+ "sum_train_plan_table" +" where trainobjectiveid = #{trainobjectiveid}")
    void deleteByTrainobjectiveid(Integer trainobjectiveid);
    
    
}
