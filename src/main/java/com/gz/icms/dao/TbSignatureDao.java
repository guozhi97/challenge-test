package com.gz.icms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.SelectProvider;

import com.gz.icms.dao.provider.TbSignatureDynaSqlProvider;

import com.gz.icms.pojo.TbSignature;

public interface TbSignatureDao {
    
    // 动态插入
    @SelectProvider(type=TbSignatureDynaSqlProvider.class,method="insertTbSignature")
    void insertTbSignature(TbSignature tbsignature);
    
    // 动态修改
    @SelectProvider(type=TbSignatureDynaSqlProvider.class,method="updateTbSignature")
    void updateTbSignature(TbSignature tbsignature);
    
    // 查找所有
    @Select("select * from " +  "signature" )
    List<TbSignature> findAllTbSignature();
    
    // 动态查询
    @SelectProvider(type=TbSignatureDynaSqlProvider.class,method="selectTbSignature")
    List<TbSignature> findTbSignatureBySome(TbSignature tbsignature);
    
    // 根据id查询和删除
    @Select("select * from "+ "signature" +" where id = #{id}")
    TbSignature findById(Integer id);
    
    @Select("delete from "+ "signature" +" where id = #{id}")
    void deleteById(Integer id);
    
    
    // 根据studentid查询和删除
    @Select("select * from "+ "signature" +" where studentid = #{studentid}")
    TbSignature findByStudentid(String studentid);
    
    @Select("delete from "+ "signature" +" where studentid = #{studentid}")
    void deleteByStudentid(String studentid);
    
    
    // 根据chapterid查询和删除
    @Select("select * from "+ "signature" +" where chapterid = #{chapterid}")
    TbSignature findByChapterid(Integer chapterid);
    
    @Select("delete from "+ "signature" +" where chapterid = #{chapterid}")
    void deleteByChapterid(Integer chapterid);
    
    
    // 根据period查询和删除
    @Select("select * from "+ "signature" +" where period = #{period}")
    TbSignature findByPeriod(Integer period);
    
    @Select("delete from "+ "signature" +" where period = #{period}")
    void deleteByPeriod(Integer period);
    
    
    // 根据state查询和删除
    @Select("select * from "+ "signature" +" where state = #{state}")
    TbSignature findByState(Integer state);
    
    @Select("delete from "+ "signature" +" where state = #{state}")
    void deleteByState(Integer state);
    
    
}
