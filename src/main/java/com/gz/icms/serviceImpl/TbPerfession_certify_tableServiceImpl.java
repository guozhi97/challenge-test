package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbPerfession_certify_tableDao;
import com.gz.icms.pojo.TbPerfession_certify_table;
import com.gz.icms.service.TbPerfession_certify_tableService;

@Service("tbperfession_certify_tableService")
public class TbPerfession_certify_tableServiceImpl implements TbPerfession_certify_tableService{
    
    @Autowired
    private TbPerfession_certify_tableDao tbperfession_certify_tableDao;
    
    // 添加
    public void addTbPerfession_certify_table(TbPerfession_certify_table tbperfession_certify_table){
        tbperfession_certify_tableDao.insertTbPerfession_certify_table(tbperfession_certify_table);
    }
    
    // 更新
    public void updateTbPerfession_certify_table(TbPerfession_certify_table tbperfession_certify_table){
        tbperfession_certify_tableDao.updateTbPerfession_certify_table(tbperfession_certify_table);
    }
    
    // 找到所有对象
    public List<TbPerfession_certify_table> findAllTbPerfession_certify_table(){
        return tbperfession_certify_tableDao.findAllTbPerfession_certify_table();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbPerfession_certify_table> findTbPerfession_certify_tableBySome(TbPerfession_certify_table tbperfession_certify_table){
        return tbperfession_certify_tableDao.findTbPerfession_certify_tableBySome(tbperfession_certify_table);
    }
    
    // 根据id查找
    public TbPerfession_certify_table findById(Integer id){
        return tbperfession_certify_tableDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbperfession_certify_tableDao.deleteById(id);
    }
    
    // 根据content查找
    public TbPerfession_certify_table findByContent(String content){
        return tbperfession_certify_tableDao.findByContent(content);
    }
    
    // 根据content删除
    public void deleteByContent(String content){
        tbperfession_certify_tableDao.deleteByContent(content);
    }
    
    // 根据version查找
    public TbPerfession_certify_table findByVersion(String version){
        return tbperfession_certify_tableDao.findByVersion(version);
    }
    
    // 根据version删除
    public void deleteByVersion(String version){
        tbperfession_certify_tableDao.deleteByVersion(version);
    }
    
    // 根据specialtyname查找
    public TbPerfession_certify_table findBySpecialtyname(String specialtyname){
        return tbperfession_certify_tableDao.findBySpecialtyname(specialtyname);
    }
    
    // 根据specialtyname删除
    public void deleteBySpecialtyname(String specialtyname){
        tbperfession_certify_tableDao.deleteBySpecialtyname(specialtyname);
    }
    
    
}
