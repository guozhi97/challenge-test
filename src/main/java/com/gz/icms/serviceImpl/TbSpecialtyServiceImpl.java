package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbSpecialtyDao;
import com.gz.icms.pojo.TbSpecialty;
import com.gz.icms.service.TbSpecialtyService;

@Service("tbspecialtyService")
public class TbSpecialtyServiceImpl implements TbSpecialtyService{
    
    @Autowired
    private TbSpecialtyDao tbspecialtyDao;
    
    // 添加
    public void addTbSpecialty(TbSpecialty tbspecialty){
        tbspecialtyDao.insertTbSpecialty(tbspecialty);
    }
    
    // 更新
    public void updateTbSpecialty(TbSpecialty tbspecialty){
        tbspecialtyDao.updateTbSpecialty(tbspecialty);
    }
    
    // 找到所有对象
    public List<TbSpecialty> findAllTbSpecialty(){
        return tbspecialtyDao.findAllTbSpecialty();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbSpecialty> findTbSpecialtyBySome(TbSpecialty tbspecialty){
        return tbspecialtyDao.findTbSpecialtyBySome(tbspecialty);
    }
    
    // 根据id查找
    public TbSpecialty findById(Integer id){
        return tbspecialtyDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbspecialtyDao.deleteById(id);
    }
    
    // 根据header查找
    public TbSpecialty findByHeader(String header){
        return tbspecialtyDao.findByHeader(header);
    }
    
    // 根据header删除
    public void deleteByHeader(String header){
        tbspecialtyDao.deleteByHeader(header);
    }
    
    // 根据name查找
    public TbSpecialty findByName(String name){
        return tbspecialtyDao.findByName(name);
    }
    
    // 根据name删除
    public void deleteByName(String name){
        tbspecialtyDao.deleteByName(name);
    }
    
    // 根据explain查找
    public TbSpecialty findByExplain(String explain){
        return tbspecialtyDao.findByExplain(explain);
    }
    
    // 根据explain删除
    public void deleteByExplain(String explain){
        tbspecialtyDao.deleteByExplain(explain);
    }
    
    
}
