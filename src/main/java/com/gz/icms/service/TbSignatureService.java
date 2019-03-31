package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbSignature;

public interface TbSignatureService {
    
    
    // 添加
    void addTbSignature(TbSignature tbsignature);
    
    // 更新
    void updateTbSignature(TbSignature tbsignature);
    
    // 找到所有对象
    List<TbSignature> findAllTbSignature();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbSignature> findTbSignatureBySome(TbSignature tbsignature);
    
    
    // 根据id查找
    TbSignature findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据studentid查找
    TbSignature findByStudentid(String studentid);
    
    // 根据studentid删除
    void deleteByStudentid(String studentid);
    
    // 根据chapterid查找
    TbSignature findByChapterid(Integer chapterid);
    
    // 根据chapterid删除
    void deleteByChapterid(Integer chapterid);
    
    // 根据period查找
    TbSignature findByPeriod(Integer period);
    
    // 根据period删除
    void deleteByPeriod(Integer period);
    
    // 根据state查找
    TbSignature findByState(Integer state);
    
    // 根据state删除
    void deleteByState(Integer state);
    
    
}
