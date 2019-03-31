package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbStudent;

public interface TbStudentService {
    
    
    // 添加
    void addTbStudent(TbStudent tbstudent);
    
    // 更新
    void updateTbStudent(TbStudent tbstudent);
    
    // 找到所有对象
    List<TbStudent> findAllTbStudent();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbStudent> findTbStudentBySome(TbStudent tbstudent);
    
    
    // 根据id查找
    TbStudent findById(String id);
    
    // 根据id删除
    void deleteById(String id);
    
    // 根据name查找
    TbStudent findByName(String name);
    
    // 根据name删除
    void deleteByName(String name);
    
    // 根据password查找
    TbStudent findByPassword(String password);
    
    // 根据password删除
    void deleteByPassword(String password);
    
    // 根据age查找
    TbStudent findByAge(Integer age);
    
    // 根据age删除
    void deleteByAge(Integer age);
    
    // 根据sex查找
    TbStudent findBySex(String sex);
    
    // 根据sex删除
    void deleteBySex(String sex);
    
    // 根据tell查找
    TbStudent findByTell(String tell);
    
    // 根据tell删除
    void deleteByTell(String tell);
    
    // 根据major查找
    TbStudent findByMajor(String major);
    
    // 根据major删除
    void deleteByMajor(String major);
    
    // 根据academic查找
    TbStudent findByAcademic(String academic);
    
    // 根据academic删除
    void deleteByAcademic(String academic);
    
    
}
