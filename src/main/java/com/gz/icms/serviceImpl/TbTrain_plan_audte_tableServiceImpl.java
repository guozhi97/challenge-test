package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbTrain_plan_audte_tableDao;
import com.gz.icms.pojo.TbTrain_plan_audte_table;
import com.gz.icms.service.TbTrain_plan_audte_tableService;

@Service("tbtrain_plan_audte_tableService")
public class TbTrain_plan_audte_tableServiceImpl implements TbTrain_plan_audte_tableService{
    
    @Autowired
    private TbTrain_plan_audte_tableDao tbtrain_plan_audte_tableDao;
    
    // 添加
    public void addTbTrain_plan_audte_table(TbTrain_plan_audte_table tbtrain_plan_audte_table){
        tbtrain_plan_audte_tableDao.insertTbTrain_plan_audte_table(tbtrain_plan_audte_table);
    }
    
    // 更新
    public void updateTbTrain_plan_audte_table(TbTrain_plan_audte_table tbtrain_plan_audte_table){
        tbtrain_plan_audte_tableDao.updateTbTrain_plan_audte_table(tbtrain_plan_audte_table);
    }
    
    // 找到所有对象
    public List<TbTrain_plan_audte_table> findAllTbTrain_plan_audte_table(){
        return tbtrain_plan_audte_tableDao.findAllTbTrain_plan_audte_table();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbTrain_plan_audte_table> findTbTrain_plan_audte_tableBySome(TbTrain_plan_audte_table tbtrain_plan_audte_table){
        return tbtrain_plan_audte_tableDao.findTbTrain_plan_audte_tableBySome(tbtrain_plan_audte_table);
    }
    
    // 根据id查找
    public TbTrain_plan_audte_table findById(Integer id){
        return tbtrain_plan_audte_tableDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbtrain_plan_audte_tableDao.deleteById(id);
    }
    
    // 根据auditor查找
    public TbTrain_plan_audte_table findByAuditor(String auditor){
        return tbtrain_plan_audte_tableDao.findByAuditor(auditor);
    }
    
    // 根据auditor删除
    public void deleteByAuditor(String auditor){
        tbtrain_plan_audte_tableDao.deleteByAuditor(auditor);
    }
    
    // 根据trainplanid查找
    public TbTrain_plan_audte_table findByTrainplanid(Integer trainplanid){
        return tbtrain_plan_audte_tableDao.findByTrainplanid(trainplanid);
    }
    
    // 根据trainplanid删除
    public void deleteByTrainplanid(Integer trainplanid){
        tbtrain_plan_audte_tableDao.deleteByTrainplanid(trainplanid);
    }
    
    // 根据outcome查找
    public TbTrain_plan_audte_table findByOutcome(String outcome){
        return tbtrain_plan_audte_tableDao.findByOutcome(outcome);
    }
    
    // 根据outcome删除
    public void deleteByOutcome(String outcome){
        tbtrain_plan_audte_tableDao.deleteByOutcome(outcome);
    }
    
    
}
