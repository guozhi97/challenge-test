package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbSum_train_plan_tableDao;
import com.gz.icms.pojo.TbSum_train_plan_table;
import com.gz.icms.service.TbSum_train_plan_tableService;

@Service("tbsum_train_plan_tableService")
public class TbSum_train_plan_tableServiceImpl implements TbSum_train_plan_tableService{
    
    @Autowired
    private TbSum_train_plan_tableDao tbsum_train_plan_tableDao;
    
    // 添加
    public void addTbSum_train_plan_table(TbSum_train_plan_table tbsum_train_plan_table){
        tbsum_train_plan_tableDao.insertTbSum_train_plan_table(tbsum_train_plan_table);
    }
    
    // 更新
    public void updateTbSum_train_plan_table(TbSum_train_plan_table tbsum_train_plan_table){
        tbsum_train_plan_tableDao.updateTbSum_train_plan_table(tbsum_train_plan_table);
    }
    
    // 找到所有对象
    public List<TbSum_train_plan_table> findAllTbSum_train_plan_table(){
        return tbsum_train_plan_tableDao.findAllTbSum_train_plan_table();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbSum_train_plan_table> findTbSum_train_plan_tableBySome(TbSum_train_plan_table tbsum_train_plan_table){
        return tbsum_train_plan_tableDao.findTbSum_train_plan_tableBySome(tbsum_train_plan_table);
    }
    
    // 根据id查找
    public TbSum_train_plan_table findById(Integer id){
        return tbsum_train_plan_tableDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbsum_train_plan_tableDao.deleteById(id);
    }
    
    // 根据header查找
    public TbSum_train_plan_table findByHeader(String header){
        return tbsum_train_plan_tableDao.findByHeader(header);
    }
    
    // 根据header删除
    public void deleteByHeader(String header){
        tbsum_train_plan_tableDao.deleteByHeader(header);
    }
    
    // 根据auditor查找
    public TbSum_train_plan_table findByAuditor(String auditor){
        return tbsum_train_plan_tableDao.findByAuditor(auditor);
    }
    
    // 根据auditor删除
    public void deleteByAuditor(String auditor){
        tbsum_train_plan_tableDao.deleteByAuditor(auditor);
    }
    
    // 根据trainobjectiveid查找
    public TbSum_train_plan_table findByTrainobjectiveid(Integer trainobjectiveid){
        return tbsum_train_plan_tableDao.findByTrainobjectiveid(trainobjectiveid);
    }
    
    // 根据trainobjectiveid删除
    public void deleteByTrainobjectiveid(Integer trainobjectiveid){
        tbsum_train_plan_tableDao.deleteByTrainobjectiveid(trainobjectiveid);
    }
    
    
}
