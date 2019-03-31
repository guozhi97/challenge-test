package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbTrain_plan_detial_tableDao;
import com.gz.icms.pojo.TbTrain_plan_detial_table;
import com.gz.icms.service.TbTrain_plan_detial_tableService;

@Service("tbtrain_plan_detial_tableService")
public class TbTrain_plan_detial_tableServiceImpl implements TbTrain_plan_detial_tableService{
    
    @Autowired
    private TbTrain_plan_detial_tableDao tbtrain_plan_detial_tableDao;
    
    // 添加
    public void addTbTrain_plan_detial_table(TbTrain_plan_detial_table tbtrain_plan_detial_table){
        tbtrain_plan_detial_tableDao.insertTbTrain_plan_detial_table(tbtrain_plan_detial_table);
    }
    
    // 更新
    public void updateTbTrain_plan_detial_table(TbTrain_plan_detial_table tbtrain_plan_detial_table){
        tbtrain_plan_detial_tableDao.updateTbTrain_plan_detial_table(tbtrain_plan_detial_table);
    }
    
    // 找到所有对象
    public List<TbTrain_plan_detial_table> findAllTbTrain_plan_detial_table(){
        return tbtrain_plan_detial_tableDao.findAllTbTrain_plan_detial_table();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbTrain_plan_detial_table> findTbTrain_plan_detial_tableBySome(TbTrain_plan_detial_table tbtrain_plan_detial_table){
        return tbtrain_plan_detial_tableDao.findTbTrain_plan_detial_tableBySome(tbtrain_plan_detial_table);
    }
    
    // 根据id查找
    public TbTrain_plan_detial_table findById(Integer id){
        return tbtrain_plan_detial_tableDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbtrain_plan_detial_tableDao.deleteById(id);
    }
    
    // 根据coursename查找
    public TbTrain_plan_detial_table findByCoursename(String coursename){
        return tbtrain_plan_detial_tableDao.findByCoursename(coursename);
    }
    
    // 根据coursename删除
    public void deleteByCoursename(String coursename){
        tbtrain_plan_detial_tableDao.deleteByCoursename(coursename);
    }
    
    // 根据credit查找
    public TbTrain_plan_detial_table findByCredit(String credit){
        return tbtrain_plan_detial_tableDao.findByCredit(credit);
    }
    
    // 根据credit删除
    public void deleteByCredit(String credit){
        tbtrain_plan_detial_tableDao.deleteByCredit(credit);
    }
    
    // 根据term查找
    public TbTrain_plan_detial_table findByTerm(String term){
        return tbtrain_plan_detial_tableDao.findByTerm(term);
    }
    
    // 根据term删除
    public void deleteByTerm(String term){
        tbtrain_plan_detial_tableDao.deleteByTerm(term);
    }
    
    // 根据version查找
    public TbTrain_plan_detial_table findByVersion(String version){
        return tbtrain_plan_detial_tableDao.findByVersion(version);
    }
    
    // 根据version删除
    public void deleteByVersion(String version){
        tbtrain_plan_detial_tableDao.deleteByVersion(version);
    }
    
    // 根据trainplanid查找
    public TbTrain_plan_detial_table findByTrainplanid(Integer trainplanid){
        return tbtrain_plan_detial_tableDao.findByTrainplanid(trainplanid);
    }
    
    // 根据trainplanid删除
    public void deleteByTrainplanid(Integer trainplanid){
        tbtrain_plan_detial_tableDao.deleteByTrainplanid(trainplanid);
    }
    
    
}
