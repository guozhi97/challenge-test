package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbChapterDao;
import com.gz.icms.pojo.TbChapter;
import com.gz.icms.service.TbChapterService;

@Service("tbchapterService")
public class TbChapterServiceImpl implements TbChapterService{
    
    @Autowired
    private TbChapterDao tbchapterDao;
    
    // 添加
    public void addTbChapter(TbChapter tbchapter){
        tbchapterDao.insertTbChapter(tbchapter);
    }
    
    // 更新
    public void updateTbChapter(TbChapter tbchapter){
        tbchapterDao.updateTbChapter(tbchapter);
    }
    
    // 找到所有对象
    public List<TbChapter> findAllTbChapter(){
        return tbchapterDao.findAllTbChapter();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbChapter> findTbChapterBySome(TbChapter tbchapter){
        return tbchapterDao.findTbChapterBySome(tbchapter);
    }
    
    // 根据id查找
    public TbChapter findById(Integer id){
        return tbchapterDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbchapterDao.deleteById(id);
    }
    
    // 根据classid查找
    public TbChapter findByClassid(Integer classid){
        return tbchapterDao.findByClassid(classid);
    }
    
    // 根据classid删除
    public void deleteByClassid(Integer classid){
        tbchapterDao.deleteByClassid(classid);
    }
    
    // 根据title查找
    public TbChapter findByTitle(String title){
        return tbchapterDao.findByTitle(title);
    }
    
    // 根据title删除
    public void deleteByTitle(String title){
        tbchapterDao.deleteByTitle(title);
    }
    
    // 根据content查找
    public TbChapter findByContent(String content){
        return tbchapterDao.findByContent(content);
    }
    
    // 根据content删除
    public void deleteByContent(String content){
        tbchapterDao.deleteByContent(content);
    }
    
    
}
