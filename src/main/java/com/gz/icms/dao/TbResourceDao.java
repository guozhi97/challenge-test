package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbResourceDynaSqlProvider;

import com.gz.icms.pojo.TbResource;

public interface TbResourceDao {
    
    // 动态插入
    @SelectProvider(type=TbResourceDynaSqlProvider.class,method="insertTbResource")
    void insertTbResource(TbResource tbresource);
    
    // 动态修改
    @SelectProvider(type=TbResourceDynaSqlProvider.class,method="updateTbResource")
    void updateTbResource(TbResource tbresource);
    
    // 查找所有
    @Select("select * from " +  "resource" )
    List<TbResource> findAllTbResource();
    
    // 动态查询
    @SelectProvider(type=TbResourceDynaSqlProvider.class,method="selectTbResource")
    List<TbResource> findTbResourceBySome(TbResource tbresource);
    
    // 根据id查询和删除
    @Select("select * from "+ "resource" +" where id = #{id}")
    TbResource findById(Integer id);
    
    @Select("delete from "+ "resource" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据chapterid查询和删除
    @Select("select * from "+ "resource" +" where chapterid = #{chapterid}")
    TbResource findByChapterid(Integer chapterid);
    
    @Select("delete from "+ "resource" +" where chapterid = #{chapterid}")
    void deleteByChapterid(Integer chapterid);
    
    
    // 根据description查询和删除
    @Select("select * from "+ "resource" +" where description = #{description}")
    TbResource findByDescription(String description);
    
    @Select("delete from "+ "resource" +" where description = #{description}")
    void deleteByDescription(String description);
    
    
    // 根据path查询和删除
    @Select("select * from "+ "resource" +" where path = #{path}")
    TbResource findByPath(String path);
    
    @Select("delete from "+ "resource" +" where path = #{path}")
    void deleteByPath(String path);
    
    
}
