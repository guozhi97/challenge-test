package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbChapter;

public interface TbChapterService {
    
    
    // 添加
    void addTbChapter(TbChapter tbchapter);
    
    // 更新
    void updateTbChapter(TbChapter tbchapter);
    
    // 找到所有对象
    List<TbChapter> findAllTbChapter();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbChapter> findTbChapterBySome(TbChapter tbchapter);
    
    
    // 根据id查找
    TbChapter findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据classid查找
    TbChapter findByClassid(Integer classid);
    
    // 根据classid删除
    void deleteByClassid(Integer classid);
    
    // 根据title查找
    TbChapter findByTitle(String title);
    
    // 根据title删除
    void deleteByTitle(String title);
    
    // 根据content查找
    TbChapter findByContent(String content);
    
    // 根据content删除
    void deleteByContent(String content);
    
    
}
