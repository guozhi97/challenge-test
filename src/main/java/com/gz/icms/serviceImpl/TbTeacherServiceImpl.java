package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbTeacherDao;
import com.gz.icms.pojo.TbTeacher;
import com.gz.icms.service.TbTeacherService;

@Service("tbteacherService")
public class TbTeacherServiceImpl implements TbTeacherService{
    
    @Autowired
    private TbTeacherDao tbteacherDao;
    
    // 添加
    public void addTbTeacher(TbTeacher tbteacher){
        tbteacherDao.insertTbTeacher(tbteacher);
    }
    
    // 更新
    public void updateTbTeacher(TbTeacher tbteacher){
        tbteacherDao.updateTbTeacher(tbteacher);
    }
    
    // 找到所有对象
    public List<TbTeacher> findAllTbTeacher(){
        return tbteacherDao.findAllTbTeacher();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbTeacher> findTbTeacherBySome(TbTeacher tbteacher){
        return tbteacherDao.findTbTeacherBySome(tbteacher);
    }
    
    // 根据id查找
    public TbTeacher findById(String id){
        return tbteacherDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(String id){
        tbteacherDao.deleteById(id);
    }
    
    // 根据name查找
    public TbTeacher findByName(String name){
        return tbteacherDao.findByName(name);
    }
    
    // 根据name删除
    public void deleteByName(String name){
        tbteacherDao.deleteByName(name);
    }
    
    // 根据password查找
    public TbTeacher findByPassword(String password){
        return tbteacherDao.findByPassword(password);
    }
    
    // 根据password删除
    public void deleteByPassword(String password){
        tbteacherDao.deleteByPassword(password);
    }
    
    // 根据email查找
    public TbTeacher findByEmail(String email){
        return tbteacherDao.findByEmail(email);
    }
    
    // 根据email删除
    public void deleteByEmail(String email){
        tbteacherDao.deleteByEmail(email);
    }
    
    // 根据academic查找
    public TbTeacher findByAcademic(String academic){
        return tbteacherDao.findByAcademic(academic);
    }
    
    // 根据academic删除
    public void deleteByAcademic(String academic){
        tbteacherDao.deleteByAcademic(academic);
    }
    
    // 根据tell查找
    public TbTeacher findByTell(String tell){
        return tbteacherDao.findByTell(tell);
    }
    
    // 根据tell删除
    public void deleteByTell(String tell){
        tbteacherDao.deleteByTell(tell);
    }
    
    
}
