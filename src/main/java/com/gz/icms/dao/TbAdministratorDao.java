package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbAdministratorDynaSqlProvider;

import com.gz.icms.pojo.TbAdministrator;

public interface TbAdministratorDao {
    
    // 动态插入
    @SelectProvider(type=TbAdministratorDynaSqlProvider.class,method="insertTbAdministrator")
    void insertTbAdministrator(TbAdministrator tbadministrator);
    
    // 动态修改
    @SelectProvider(type=TbAdministratorDynaSqlProvider.class,method="updateTbAdministrator")
    void updateTbAdministrator(TbAdministrator tbadministrator);
    
    // 查找所有
    @Select("select * from " +  "administrator" )
    List<TbAdministrator> findAllTbAdministrator();
    
    // 动态查询
    @SelectProvider(type=TbAdministratorDynaSqlProvider.class,method="selectTbAdministrator")
    List<TbAdministrator> findTbAdministratorBySome(TbAdministrator tbadministrator);
    
    // 根据id查询和删除
    @Select("select * from "+ "administrator" +" where id = #{id}")
    TbAdministrator findById(Integer id);
    
    @Select("delete from "+ "administrator" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据name查询和删除
    @Select("select * from "+ "administrator" +" where name = #{name}")
    TbAdministrator findByName(String name);
    
    @Select("delete from "+ "administrator" +" where name = #{name}")
    void deleteByName(String name);
    
    
    // 根据password查询和删除
    @Select("select * from "+ "administrator" +" where password = #{password}")
    TbAdministrator findByPassword(String password);
    
    @Select("delete from "+ "administrator" +" where password = #{password}")
    void deleteByPassword(String password);
    
    
    // 根据email查询和删除
    @Select("select * from "+ "administrator" +" where email = #{email}")
    TbAdministrator findByEmail(String email);
    
    @Select("delete from "+ "administrator" +" where email = #{email}")
    void deleteByEmail(String email);
    
    
    // 根据tell查询和删除
    @Select("select * from "+ "administrator" +" where tell = #{tell}")
    TbAdministrator findByTell(String tell);
    
    @Select("delete from "+ "administrator" +" where tell = #{tell}")
    void deleteByTell(String tell);
    
    
}
