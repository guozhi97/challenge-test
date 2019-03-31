package com.gz.icms.service;

import java.util.List;

import com.gz.icms.pojo.TbPerfession_certify_table;

public interface TbPerfession_certify_tableService {
    
    
    // 添加
    void addTbPerfession_certify_table(TbPerfession_certify_table tbperfession_certify_table);
    
    // 更新
    void updateTbPerfession_certify_table(TbPerfession_certify_table tbperfession_certify_table);
    
    // 找到所有对象
    List<TbPerfession_certify_table> findAllTbPerfession_certify_table();
    
    // 根据一个抽象对象找到所有符合要求的对象
    List<TbPerfession_certify_table> findTbPerfession_certify_tableBySome(TbPerfession_certify_table tbperfession_certify_table);
    
    
    // 根据id查找
    TbPerfession_certify_table findById(Integer id);
    
    // 根据id删除
    void deleteById(Integer id);
    
    // 根据content查找
    TbPerfession_certify_table findByContent(String content);
    
    // 根据content删除
    void deleteByContent(String content);
    
    // 根据version查找
    TbPerfession_certify_table findByVersion(String version);
    
    // 根据version删除
    void deleteByVersion(String version);
    
    // 根据specialtyname查找
    TbPerfession_certify_table findBySpecialtyname(String specialtyname);
    
    // 根据specialtyname删除
    void deleteBySpecialtyname(String specialtyname);
    
    
}
