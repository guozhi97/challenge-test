package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbCourse_typeDao;
import com.gz.icms.pojo.TbCourse_type;
import com.gz.icms.service.TbCourse_typeService;

@Service("tbcourse_typeService")
public class TbCourse_typeServiceImpl implements TbCourse_typeService{
    
    @Autowired
    private TbCourse_typeDao tbcourse_typeDao;
    
    // 添加
    public void addTbCourse_type(TbCourse_type tbcourse_type){
        tbcourse_typeDao.insertTbCourse_type(tbcourse_type);
    }
    
    // 更新
    public void updateTbCourse_type(TbCourse_type tbcourse_type){
        tbcourse_typeDao.updateTbCourse_type(tbcourse_type);
    }
    
    // 找到所有对象
    public List<TbCourse_type> findAllTbCourse_type(){
        return tbcourse_typeDao.findAllTbCourse_type();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbCourse_type> findTbCourse_typeBySome(TbCourse_type tbcourse_type){
        return tbcourse_typeDao.findTbCourse_typeBySome(tbcourse_type);
    }
    
    // 根据id查找
    public TbCourse_type findById(Integer id){
        return tbcourse_typeDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbcourse_typeDao.deleteById(id);
    }
    
    // 根据typename查找
    public TbCourse_type findByTypename(String typename){
        return tbcourse_typeDao.findByTypename(typename);
    }
    
    // 根据typename删除
    public void deleteByTypename(String typename){
        tbcourse_typeDao.deleteByTypename(typename);
    }
    
    
}
