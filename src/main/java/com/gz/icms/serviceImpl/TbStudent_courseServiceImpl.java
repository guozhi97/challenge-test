package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbStudent_courseDao;
import com.gz.icms.pojo.TbStudent_course;
import com.gz.icms.service.TbStudent_courseService;

@Service("tbstudent_courseService")
public class TbStudent_courseServiceImpl implements TbStudent_courseService{
    
    @Autowired
    private TbStudent_courseDao tbstudent_courseDao;
    
    // 添加
    public void addTbStudent_course(TbStudent_course tbstudent_course){
        tbstudent_courseDao.insertTbStudent_course(tbstudent_course);
    }
    
    // 更新
    public void updateTbStudent_course(TbStudent_course tbstudent_course){
        tbstudent_courseDao.updateTbStudent_course(tbstudent_course);
    }
    
    // 找到所有对象
    public List<TbStudent_course> findAllTbStudent_course(){
        return tbstudent_courseDao.findAllTbStudent_course();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbStudent_course> findTbStudent_courseBySome(TbStudent_course tbstudent_course){
        return tbstudent_courseDao.findTbStudent_courseBySome(tbstudent_course);
    }
    
    // 根据id查找
    public TbStudent_course findById(Integer id){
        return tbstudent_courseDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbstudent_courseDao.deleteById(id);
    }
    
    // 根据studentid查找
    public TbStudent_course findByStudentid(String studentid){
        return tbstudent_courseDao.findByStudentid(studentid);
    }
    
    // 根据studentid删除
    public void deleteByStudentid(String studentid){
        tbstudent_courseDao.deleteByStudentid(studentid);
    }
    
    // 根据classid查找
    public TbStudent_course findByClassid(Integer classid){
        return tbstudent_courseDao.findByClassid(classid);
    }
    
    // 根据classid删除
    public void deleteByClassid(Integer classid){
        tbstudent_courseDao.deleteByClassid(classid);
    }
    
    
}
