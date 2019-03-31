package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbClassDao;
import com.gz.icms.pojo.TbClass;
import com.gz.icms.service.TbClassService;

@Service("tbclassService")
public class TbClassServiceImpl implements TbClassService{
    
    @Autowired
    private TbClassDao tbclassDao;
    
    // 添加
    public void addTbClass(TbClass tbclass){
        tbclassDao.insertTbClass(tbclass);
    }
    
    // 更新
    public void updateTbClass(TbClass tbclass){
        tbclassDao.updateTbClass(tbclass);
    }
    
    // 找到所有对象
    public List<TbClass> findAllTbClass(){
        return tbclassDao.findAllTbClass();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbClass> findTbClassBySome(TbClass tbclass){
        return tbclassDao.findTbClassBySome(tbclass);
    }
    
    // 根据id查找
    public TbClass findById(Integer id){
        return tbclassDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbclassDao.deleteById(id);
    }
    
    // 根据name查找
    public TbClass findByName(String name){
        return tbclassDao.findByName(name);
    }
    
    // 根据name删除
    public void deleteByName(String name){
        tbclassDao.deleteByName(name);
    }
    
    // 根据teacherid查找
    public TbClass findByTeacherid(String teacherid){
        return tbclassDao.findByTeacherid(teacherid);
    }
    
    // 根据teacherid删除
    public void deleteByTeacherid(String teacherid){
        tbclassDao.deleteByTeacherid(teacherid);
    }
    
    // 根据courseid查找
    public TbClass findByCourseid(Integer courseid){
        return tbclassDao.findByCourseid(courseid);
    }
    
    // 根据courseid删除
    public void deleteByCourseid(Integer courseid){
        tbclassDao.deleteByCourseid(courseid);
    }
    
    
}
