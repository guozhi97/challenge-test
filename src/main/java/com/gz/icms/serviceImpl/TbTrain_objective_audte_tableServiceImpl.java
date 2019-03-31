package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbTrain_objective_audte_tableDao;
import com.gz.icms.pojo.TbTrain_objective_audte_table;
import com.gz.icms.service.TbTrain_objective_audte_tableService;

@Service("tbtrain_objective_audte_tableService")
public class TbTrain_objective_audte_tableServiceImpl implements TbTrain_objective_audte_tableService{
    
    @Autowired
    private TbTrain_objective_audte_tableDao tbtrain_objective_audte_tableDao;
    
    // 添加
    public void addTbTrain_objective_audte_table(TbTrain_objective_audte_table tbtrain_objective_audte_table){
        tbtrain_objective_audte_tableDao.insertTbTrain_objective_audte_table(tbtrain_objective_audte_table);
    }
    
    // 更新
    public void updateTbTrain_objective_audte_table(TbTrain_objective_audte_table tbtrain_objective_audte_table){
        tbtrain_objective_audte_tableDao.updateTbTrain_objective_audte_table(tbtrain_objective_audte_table);
    }
    
    // 找到所有对象
    public List<TbTrain_objective_audte_table> findAllTbTrain_objective_audte_table(){
        return tbtrain_objective_audte_tableDao.findAllTbTrain_objective_audte_table();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbTrain_objective_audte_table> findTbTrain_objective_audte_tableBySome(TbTrain_objective_audte_table tbtrain_objective_audte_table){
        return tbtrain_objective_audte_tableDao.findTbTrain_objective_audte_tableBySome(tbtrain_objective_audte_table);
    }
    
    // 根据id查找
    public TbTrain_objective_audte_table findById(Integer id){
        return tbtrain_objective_audte_tableDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbtrain_objective_audte_tableDao.deleteById(id);
    }
    
    // 根据auditor查找
    public TbTrain_objective_audte_table findByAuditor(String auditor){
        return tbtrain_objective_audte_tableDao.findByAuditor(auditor);
    }
    
    // 根据auditor删除
    public void deleteByAuditor(String auditor){
        tbtrain_objective_audte_tableDao.deleteByAuditor(auditor);
    }
    
    // 根据trainobjectiveid查找
    public TbTrain_objective_audte_table findByTrainobjectiveid(Integer trainobjectiveid){
        return tbtrain_objective_audte_tableDao.findByTrainobjectiveid(trainobjectiveid);
    }
    
    // 根据trainobjectiveid删除
    public void deleteByTrainobjectiveid(Integer trainobjectiveid){
        tbtrain_objective_audte_tableDao.deleteByTrainobjectiveid(trainobjectiveid);
    }
    
    // 根据outcome查找
    public TbTrain_objective_audte_table findByOutcome(String outcome){
        return tbtrain_objective_audte_tableDao.findByOutcome(outcome);
    }
    
    // 根据outcome删除
    public void deleteByOutcome(String outcome){
        tbtrain_objective_audte_tableDao.deleteByOutcome(outcome);
    }
    
    
}
