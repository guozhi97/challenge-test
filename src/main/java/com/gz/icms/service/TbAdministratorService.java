package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbAdministrator;

public interface TbAdministratorService {
    
    
    // 添加
    void addTbAdministrator(TbAdministrator tbadministrator);
    
    // 更新
    void updateTbAdministrator(TbAdministrator tbadministrator);
    
    // 找到所有对象
    List<TbAdministrator> findAllTbAdministrator();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbAdministrator> findTbAdministratorBySome(TbAdministrator tbadministrator);
    
    
    // 根据id查找
    TbAdministrator findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据name查找
    TbAdministrator findByName(String name);
    
    // 根据name删除
    void deleteByName(String name);
    
    // 根据password查找
    TbAdministrator findByPassword(String password);
    
    // 根据password删除
    void deleteByPassword(String password);
    
    // 根据email查找
    TbAdministrator findByEmail(String email);
    
    // 根据email删除
    void deleteByEmail(String email);
    
    // 根据tell查找
    TbAdministrator findByTell(String tell);
    
    // 根据tell删除
    void deleteByTell(String tell);
    
    
}
