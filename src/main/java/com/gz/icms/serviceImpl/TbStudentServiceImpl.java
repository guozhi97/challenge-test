package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbStudentDao;
import com.gz.icms.pojo.TbStudent;
import com.gz.icms.service.TbStudentService;

@Service("tbstudentService")
public class TbStudentServiceImpl implements TbStudentService{
    
    @Autowired
    private TbStudentDao tbstudentDao;
    
    // 添加
    public void addTbStudent(TbStudent tbstudent){
        tbstudentDao.insertTbStudent(tbstudent);
    }
    
    // 更新
    public void updateTbStudent(TbStudent tbstudent){
        tbstudentDao.updateTbStudent(tbstudent);
    }
    
    // 找到所有对象
    public List<TbStudent> findAllTbStudent(){
        return tbstudentDao.findAllTbStudent();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbStudent> findTbStudentBySome(TbStudent tbstudent){
        return tbstudentDao.findTbStudentBySome(tbstudent);
    }
    
    // 根据id查找
    public TbStudent findById(String id){
        return tbstudentDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(String id){
        tbstudentDao.deleteById(id);
    }
    
    // 根据name查找
    public TbStudent findByName(String name){
        return tbstudentDao.findByName(name);
    }
    
    // 根据name删除
    public void deleteByName(String name){
        tbstudentDao.deleteByName(name);
    }
    
    // 根据password查找
    public TbStudent findByPassword(String password){
        return tbstudentDao.findByPassword(password);
    }
    
    // 根据password删除
    public void deleteByPassword(String password){
        tbstudentDao.deleteByPassword(password);
    }
    
    // 根据age查找
    public TbStudent findByAge(Integer age){
        return tbstudentDao.findByAge(age);
    }
    
    // 根据age删除
    public void deleteByAge(Integer age){
        tbstudentDao.deleteByAge(age);
    }
    
    // 根据sex查找
    public TbStudent findBySex(String sex){
        return tbstudentDao.findBySex(sex);
    }
    
    // 根据sex删除
    public void deleteBySex(String sex){
        tbstudentDao.deleteBySex(sex);
    }
    
    // 根据tell查找
    public TbStudent findByTell(String tell){
        return tbstudentDao.findByTell(tell);
    }
    
    // 根据tell删除
    public void deleteByTell(String tell){
        tbstudentDao.deleteByTell(tell);
    }
    
    // 根据major查找
    public TbStudent findByMajor(String major){
        return tbstudentDao.findByMajor(major);
    }
    
    // 根据major删除
    public void deleteByMajor(String major){
        tbstudentDao.deleteByMajor(major);
    }
    
    // 根据academic查找
    public TbStudent findByAcademic(String academic){
        return tbstudentDao.findByAcademic(academic);
    }
    
    // 根据academic删除
    public void deleteByAcademic(String academic){
        tbstudentDao.deleteByAcademic(academic);
    }
    
    
}
