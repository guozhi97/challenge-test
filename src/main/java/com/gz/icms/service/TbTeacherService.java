package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbTeacher;

public interface TbTeacherService {
    
    
    // 添加
    void addTbTeacher(TbTeacher tbteacher);
    
    // 更新
    void updateTbTeacher(TbTeacher tbteacher);
    
    // 找到所有对象
    List<TbTeacher> findAllTbTeacher();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbTeacher> findTbTeacherBySome(TbTeacher tbteacher);
    
    
    // 根据id查找
    TbTeacher findById(String id);
    
    // 根据id删除
    void deleteById(String id);
    
    // 根据name查找
    TbTeacher findByName(String name);
    
    // 根据name删除
    void deleteByName(String name);
    
    // 根据password查找
    TbTeacher findByPassword(String password);
    
    // 根据password删除
    void deleteByPassword(String password);
    
    // 根据email查找
    TbTeacher findByEmail(String email);
    
    // 根据email删除
    void deleteByEmail(String email);
    
    // 根据academic查找
    TbTeacher findByAcademic(String academic);
    
    // 根据academic删除
    void deleteByAcademic(String academic);
    
    // 根据tell查找
    TbTeacher findByTell(String tell);
    
    // 根据tell删除
    void deleteByTell(String tell);
    
    
}
