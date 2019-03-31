package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbChapterDynaSqlProvider;

import com.gz.icms.pojo.TbChapter;

public interface TbChapterDao {
    
    // 动态插入
    @SelectProvider(type=TbChapterDynaSqlProvider.class,method="insertTbChapter")
    void insertTbChapter(TbChapter tbchapter);
    
    // 动态修改
    @SelectProvider(type=TbChapterDynaSqlProvider.class,method="updateTbChapter")
    void updateTbChapter(TbChapter tbchapter);
    
    // 查找所有
    @Select("select * from " +  "chapter" )
    List<TbChapter> findAllTbChapter();
    
    // 动态查询
    @SelectProvider(type=TbChapterDynaSqlProvider.class,method="selectTbChapter")
    List<TbChapter> findTbChapterBySome(TbChapter tbchapter);
    
    // 根据id查询和删除
    @Select("select * from "+ "chapter" +" where id = #{id}")
    TbChapter findById(Integer id);
    
    @Select("delete from "+ "chapter" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据classid查询和删除
    @Select("select * from "+ "chapter" +" where classid = #{classid}")
    TbChapter findByClassid(Integer classid);
    
    @Select("delete from "+ "chapter" +" where classid = #{classid}")
    void deleteByClassid(Integer classid);
    
    
    // 根据title查询和删除
    @Select("select * from "+ "chapter" +" where title = #{title}")
    TbChapter findByTitle(String title);
    
    @Select("delete from "+ "chapter" +" where title = #{title}")
    void deleteByTitle(String title);
    
    
    // 根据content查询和删除
    @Select("select * from "+ "chapter" +" where content = #{content}")
    TbChapter findByContent(String content);
    
    @Select("delete from "+ "chapter" +" where content = #{content}")
    void deleteByContent(String content);
    
    
}
