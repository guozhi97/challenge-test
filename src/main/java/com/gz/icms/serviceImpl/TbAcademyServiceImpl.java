package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbAcademyDao;
import com.gz.icms.pojo.TbAcademy;
import com.gz.icms.service.TbAcademyService;

@Service("tbacademyService")
public class TbAcademyServiceImpl implements TbAcademyService{
    
    @Autowired
    private TbAcademyDao tbacademyDao;
    
    // 添加
    public void addTbAcademy(TbAcademy tbacademy){
        tbacademyDao.insertTbAcademy(tbacademy);
    }
    
    // 更新
    public void updateTbAcademy(TbAcademy tbacademy){
        tbacademyDao.updateTbAcademy(tbacademy);
    }
    
    // 找到所有对象
    public List<TbAcademy> findAllTbAcademy(){
        return tbacademyDao.findAllTbAcademy();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbAcademy> findTbAcademyBySome(TbAcademy tbacademy){
        return tbacademyDao.findTbAcademyBySome(tbacademy);
    }
    
    // 根据id查找
    public TbAcademy findById(Integer id){
        return tbacademyDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbacademyDao.deleteById(id);
    }
    
    // 根据name查找
    public TbAcademy findByName(String name){
        return tbacademyDao.findByName(name);
    }
    
    // 根据name删除
    public void deleteByName(String name){
        tbacademyDao.deleteByName(name);
    }
    
    // 根据school查找
    public TbAcademy findBySchool(String school){
        return tbacademyDao.findBySchool(school);
    }
    
    // 根据school删除
    public void deleteBySchool(String school){
        tbacademyDao.deleteBySchool(school);
    }
    
    // 根据auditor查找
    public TbAcademy findByAuditor(String auditor){
        return tbacademyDao.findByAuditor(auditor);
    }
    
    // 根据auditor删除
    public void deleteByAuditor(String auditor){
        tbacademyDao.deleteByAuditor(auditor);
    }
    
    
}
