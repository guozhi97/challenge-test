package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbResource;

public interface TbResourceService {
    
    
    // 添加
    void addTbResource(TbResource tbresource);
    
    // 更新
    void updateTbResource(TbResource tbresource);
    
    // 找到所有对象
    List<TbResource> findAllTbResource();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbResource> findTbResourceBySome(TbResource tbresource);
    
    
    // 根据id查找
    TbResource findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据chapterid查找
    TbResource findByChapterid(Integer chapterid);
    
    // 根据chapterid删除
    void deleteByChapterid(Integer chapterid);
    
    // 根据description查找
    TbResource findByDescription(String description);
    
    // 根据description删除
    void deleteByDescription(String description);
    
    // 根据path查找
    TbResource findByPath(String path);
    
    // 根据path删除
    void deleteByPath(String path);
    
    
}
