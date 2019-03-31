package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbTrain_objective_tableDao;
import com.gz.icms.pojo.TbTrain_objective_table;
import com.gz.icms.service.TbTrain_objective_tableService;

@Service("tbtrain_objective_tableService")
public class TbTrain_objective_tableServiceImpl implements TbTrain_objective_tableService{
    
    @Autowired
    private TbTrain_objective_tableDao tbtrain_objective_tableDao;
    
    // 添加
    public void addTbTrain_objective_table(TbTrain_objective_table tbtrain_objective_table){
        tbtrain_objective_tableDao.insertTbTrain_objective_table(tbtrain_objective_table);
    }
    
    // 更新
    public void updateTbTrain_objective_table(TbTrain_objective_table tbtrain_objective_table){
        tbtrain_objective_tableDao.updateTbTrain_objective_table(tbtrain_objective_table);
    }
    
    // 找到所有对象
    public List<TbTrain_objective_table> findAllTbTrain_objective_table(){
        return tbtrain_objective_tableDao.findAllTbTrain_objective_table();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbTrain_objective_table> findTbTrain_objective_tableBySome(TbTrain_objective_table tbtrain_objective_table){
        return tbtrain_objective_tableDao.findTbTrain_objective_tableBySome(tbtrain_objective_table);
    }
    
    // 根据id查找
    public TbTrain_objective_table findById(Integer id){
        return tbtrain_objective_tableDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbtrain_objective_tableDao.deleteById(id);
    }
    
    // 根据header查找
    public TbTrain_objective_table findByHeader(String header){
        return tbtrain_objective_tableDao.findByHeader(header);
    }
    
    // 根据header删除
    public void deleteByHeader(String header){
        tbtrain_objective_tableDao.deleteByHeader(header);
    }
    
    // 根据specialtyid查找
    public TbTrain_objective_table findBySpecialtyid(Integer specialtyid){
        return tbtrain_objective_tableDao.findBySpecialtyid(specialtyid);
    }
    
    // 根据specialtyid删除
    public void deleteBySpecialtyid(Integer specialtyid){
        tbtrain_objective_tableDao.deleteBySpecialtyid(specialtyid);
    }
    
    // 根据content查找
    public TbTrain_objective_table findByContent(String content){
        return tbtrain_objective_tableDao.findByContent(content);
    }
    
    // 根据content删除
    public void deleteByContent(String content){
        tbtrain_objective_tableDao.deleteByContent(content);
    }
    
    // 根据version查找
    public TbTrain_objective_table findByVersion(String version){
        return tbtrain_objective_tableDao.findByVersion(version);
    }
    
    // 根据version删除
    public void deleteByVersion(String version){
        tbtrain_objective_tableDao.deleteByVersion(version);
    }
    
    // 根据auditor查找
    public TbTrain_objective_table findByAuditor(String auditor){
        return tbtrain_objective_tableDao.findByAuditor(auditor);
    }
    
    // 根据auditor删除
    public void deleteByAuditor(String auditor){
        tbtrain_objective_tableDao.deleteByAuditor(auditor);
    }
    
    
}
