package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbTrain_plan_detial_tableDynaSqlProvider;

import com.gz.icms.pojo.TbTrain_plan_detial_table;

public interface TbTrain_plan_detial_tableDao {
    
    // 动态插入
    @SelectProvider(type=TbTrain_plan_detial_tableDynaSqlProvider.class,method="insertTbTrain_plan_detial_table")
    void insertTbTrain_plan_detial_table(TbTrain_plan_detial_table tbtrain_plan_detial_table);
    
    // 动态修改
    @SelectProvider(type=TbTrain_plan_detial_tableDynaSqlProvider.class,method="updateTbTrain_plan_detial_table")
    void updateTbTrain_plan_detial_table(TbTrain_plan_detial_table tbtrain_plan_detial_table);
    
    // 查找所有
    @Select("select * from " +  "train_plan_detial_table" )
    List<TbTrain_plan_detial_table> findAllTbTrain_plan_detial_table();
    
    // 动态查询
    @SelectProvider(type=TbTrain_plan_detial_tableDynaSqlProvider.class,method="selectTbTrain_plan_detial_table")
    List<TbTrain_plan_detial_table> findTbTrain_plan_detial_tableBySome(TbTrain_plan_detial_table tbtrain_plan_detial_table);
    
    // 根据id查询和删除
    @Select("select * from "+ "train_plan_detial_table" +" where id = #{id}")
    TbTrain_plan_detial_table findById(Integer id);
    
    @Select("delete from "+ "train_plan_detial_table" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据coursename查询和删除
    @Select("select * from "+ "train_plan_detial_table" +" where coursename = #{coursename}")
    TbTrain_plan_detial_table findByCoursename(String coursename);
    
    @Select("delete from "+ "train_plan_detial_table" +" where coursename = #{coursename}")
    void deleteByCoursename(String coursename);
    
    
    // 根据credit查询和删除
    @Select("select * from "+ "train_plan_detial_table" +" where credit = #{credit}")
    TbTrain_plan_detial_table findByCredit(String credit);
    
    @Select("delete from "+ "train_plan_detial_table" +" where credit = #{credit}")
    void deleteByCredit(String credit);
    
    
    // 根据term查询和删除
    @Select("select * from "+ "train_plan_detial_table" +" where term = #{term}")
    TbTrain_plan_detial_table findByTerm(String term);
    
    @Select("delete from "+ "train_plan_detial_table" +" where term = #{term}")
    void deleteByTerm(String term);
    
    
    // 根据version查询和删除
    @Select("select * from "+ "train_plan_detial_table" +" where version = #{version}")
    TbTrain_plan_detial_table findByVersion(String version);
    
    @Select("delete from "+ "train_plan_detial_table" +" where version = #{version}")
    void deleteByVersion(String version);
    
    
    // 根据trainplanid查询和删除
    @Select("select * from "+ "train_plan_detial_table" +" where trainplanid = #{trainplanid}")
    TbTrain_plan_detial_table findByTrainplanid(Integer trainplanid);
    
    @Select("delete from "+ "train_plan_detial_table" +" where trainplanid = #{trainplanid}")
    void deleteByTrainplanid(Integer trainplanid);
    
    
}
