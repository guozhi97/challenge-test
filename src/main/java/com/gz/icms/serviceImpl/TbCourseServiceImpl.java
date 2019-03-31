package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbCourseDao;
import com.gz.icms.pojo.TbCourse;
import com.gz.icms.service.TbCourseService;

@Service("tbcourseService")
public class TbCourseServiceImpl implements TbCourseService{
    
    @Autowired
    private TbCourseDao tbcourseDao;
    
    // 添加
    public void addTbCourse(TbCourse tbcourse){
        tbcourseDao.insertTbCourse(tbcourse);
    }
    
    // 更新
    public void updateTbCourse(TbCourse tbcourse){
        tbcourseDao.updateTbCourse(tbcourse);
    }
    
    // 找到所有对象
    public List<TbCourse> findAllTbCourse(){
        return tbcourseDao.findAllTbCourse();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbCourse> findTbCourseBySome(TbCourse tbcourse){
        return tbcourseDao.findTbCourseBySome(tbcourse);
    }
    
    // 根据id查找
    public TbCourse findById(Integer id){
        return tbcourseDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbcourseDao.deleteById(id);
    }
    
    // 根据name查找
    public TbCourse findByName(String name){
        return tbcourseDao.findByName(name);
    }
    
    // 根据name删除
    public void deleteByName(String name){
        tbcourseDao.deleteByName(name);
    }
    
    // 根据period查找
    public TbCourse findByPeriod(Integer period){
        return tbcourseDao.findByPeriod(period);
    }
    
    // 根据period删除
    public void deleteByPeriod(Integer period){
        tbcourseDao.deleteByPeriod(period);
    }
    
    // 根据credit查找
    public TbCourse findByCredit(Integer credit){
        return tbcourseDao.findByCredit(credit);
    }
    
    // 根据credit删除
    public void deleteByCredit(Integer credit){
        tbcourseDao.deleteByCredit(credit);
    }
    
    // 根据type查找
    public TbCourse findByType(Integer type){
        return tbcourseDao.findByType(type);
    }
    
    // 根据type删除
    public void deleteByType(Integer type){
        tbcourseDao.deleteByType(type);
    }
    
    // 根据header查找
    public TbCourse findByHeader(String header){
        return tbcourseDao.findByHeader(header);
    }
    
    // 根据header删除
    public void deleteByHeader(String header){
        tbcourseDao.deleteByHeader(header);
    }
    
    
}
