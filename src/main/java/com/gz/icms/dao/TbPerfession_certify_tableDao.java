package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbPerfession_certify_tableDynaSqlProvider;

import com.gz.icms.pojo.TbPerfession_certify_table;

public interface TbPerfession_certify_tableDao {
    
    // 动态插入
    @SelectProvider(type=TbPerfession_certify_tableDynaSqlProvider.class,method="insertTbPerfession_certify_table")
    void insertTbPerfession_certify_table(TbPerfession_certify_table tbperfession_certify_table);
    
    // 动态修改
    @SelectProvider(type=TbPerfession_certify_tableDynaSqlProvider.class,method="updateTbPerfession_certify_table")
    void updateTbPerfession_certify_table(TbPerfession_certify_table tbperfession_certify_table);
    
    // 查找所有
    @Select("select * from " +  "perfession_certify_table" )
    List<TbPerfession_certify_table> findAllTbPerfession_certify_table();
    
    // 动态查询
    @SelectProvider(type=TbPerfession_certify_tableDynaSqlProvider.class,method="selectTbPerfession_certify_table")
    List<TbPerfession_certify_table> findTbPerfession_certify_tableBySome(TbPerfession_certify_table tbperfession_certify_table);
    
    // 根据id查询和删除
    @Select("select * from "+ "perfession_certify_table" +" where id = #{id}")
    TbPerfession_certify_table findById(Integer id);
    
    @Select("delete from "+ "perfession_certify_table" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据content查询和删除
    @Select("select * from "+ "perfession_certify_table" +" where content = #{content}")
    TbPerfession_certify_table findByContent(String content);
    
    @Select("delete from "+ "perfession_certify_table" +" where content = #{content}")
    void deleteByContent(String content);
    
    
    // 根据version查询和删除
    @Select("select * from "+ "perfession_certify_table" +" where version = #{version}")
    TbPerfession_certify_table findByVersion(String version);
    
    @Select("delete from "+ "perfession_certify_table" +" where version = #{version}")
    void deleteByVersion(String version);
    
    
    // 根据specialtyname查询和删除
    @Select("select * from "+ "perfession_certify_table" +" where specialtyname = #{specialtyname}")
    TbPerfession_certify_table findBySpecialtyname(String specialtyname);
    
    @Select("delete from "+ "perfession_certify_table" +" where specialtyname = #{specialtyname}")
    void deleteBySpecialtyname(String specialtyname);
    
    
}
