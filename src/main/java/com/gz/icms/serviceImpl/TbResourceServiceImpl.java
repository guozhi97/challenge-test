package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbResourceDao;
import com.gz.icms.pojo.TbResource;
import com.gz.icms.service.TbResourceService;

@Service("tbresourceService")
public class TbResourceServiceImpl implements TbResourceService{
    
    @Autowired
    private TbResourceDao tbresourceDao;
    
    // 添加
    public void addTbResource(TbResource tbresource){
        tbresourceDao.insertTbResource(tbresource);
    }
    
    // 更新
    public void updateTbResource(TbResource tbresource){
        tbresourceDao.updateTbResource(tbresource);
    }
    
    // 找到所有对象
    public List<TbResource> findAllTbResource(){
        return tbresourceDao.findAllTbResource();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbResource> findTbResourceBySome(TbResource tbresource){
        return tbresourceDao.findTbResourceBySome(tbresource);
    }
    
    // 根据id查找
    public TbResource findById(Integer id){
        return tbresourceDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbresourceDao.deleteById(id);
    }
    
    // 根据chapterid查找
    public TbResource findByChapterid(Integer chapterid){
        return tbresourceDao.findByChapterid(chapterid);
    }
    
    // 根据chapterid删除
    public void deleteByChapterid(Integer chapterid){
        tbresourceDao.deleteByChapterid(chapterid);
    }
    
    // 根据description查找
    public TbResource findByDescription(String description){
        return tbresourceDao.findByDescription(description);
    }
    
    // 根据description删除
    public void deleteByDescription(String description){
        tbresourceDao.deleteByDescription(description);
    }
    
    // 根据path查找
    public TbResource findByPath(String path){
        return tbresourceDao.findByPath(path);
    }
    
    // 根据path删除
    public void deleteByPath(String path){
        tbresourceDao.deleteByPath(path);
    }
    
    
}
