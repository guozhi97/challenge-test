package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbCourse_taskDao;
import com.gz.icms.pojo.TbCourse_task;
import com.gz.icms.service.TbCourse_taskService;

@Service("tbcourse_taskService")
public class TbCourse_taskServiceImpl implements TbCourse_taskService{
    
    @Autowired
    private TbCourse_taskDao tbcourse_taskDao;
    
    // 添加
    public void addTbCourse_task(TbCourse_task tbcourse_task){
        tbcourse_taskDao.insertTbCourse_task(tbcourse_task);
    }
    
    // 更新
    public void updateTbCourse_task(TbCourse_task tbcourse_task){
        tbcourse_taskDao.updateTbCourse_task(tbcourse_task);
    }
    
    // 找到所有对象
    public List<TbCourse_task> findAllTbCourse_task(){
        return tbcourse_taskDao.findAllTbCourse_task();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbCourse_task> findTbCourse_taskBySome(TbCourse_task tbcourse_task){
        return tbcourse_taskDao.findTbCourse_taskBySome(tbcourse_task);
    }
    
    // 根据id查找
    public TbCourse_task findById(Integer id){
        return tbcourse_taskDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbcourse_taskDao.deleteById(id);
    }
    
    // 根据chapterid查找
    public TbCourse_task findByChapterid(Integer chapterid){
        return tbcourse_taskDao.findByChapterid(chapterid);
    }
    
    // 根据chapterid删除
    public void deleteByChapterid(Integer chapterid){
        tbcourse_taskDao.deleteByChapterid(chapterid);
    }
    
    // 根据content查找
    public TbCourse_task findByContent(String content){
        return tbcourse_taskDao.findByContent(content);
    }
    
    // 根据content删除
    public void deleteByContent(String content){
        tbcourse_taskDao.deleteByContent(content);
    }
    
    
}
