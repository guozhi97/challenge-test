package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbTask_recordsDao;
import com.gz.icms.pojo.TbTask_records;
import com.gz.icms.service.TbTask_recordsService;

@Service("tbtask_recordsService")
public class TbTask_recordsServiceImpl implements TbTask_recordsService{
    
    @Autowired
    private TbTask_recordsDao tbtask_recordsDao;
    
    // 添加
    public void addTbTask_records(TbTask_records tbtask_records){
        tbtask_recordsDao.insertTbTask_records(tbtask_records);
    }
    
    // 更新
    public void updateTbTask_records(TbTask_records tbtask_records){
        tbtask_recordsDao.updateTbTask_records(tbtask_records);
    }
    
    // 找到所有对象
    public List<TbTask_records> findAllTbTask_records(){
        return tbtask_recordsDao.findAllTbTask_records();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbTask_records> findTbTask_recordsBySome(TbTask_records tbtask_records){
        return tbtask_recordsDao.findTbTask_recordsBySome(tbtask_records);
    }
    
    // 根据id查找
    public TbTask_records findById(Integer id){
        return tbtask_recordsDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbtask_recordsDao.deleteById(id);
    }
    
    // 根据taskid查找
    public TbTask_records findByTaskid(Integer taskid){
        return tbtask_recordsDao.findByTaskid(taskid);
    }
    
    // 根据taskid删除
    public void deleteByTaskid(Integer taskid){
        tbtask_recordsDao.deleteByTaskid(taskid);
    }
    
    // 根据studentid查找
    public TbTask_records findByStudentid(String studentid){
        return tbtask_recordsDao.findByStudentid(studentid);
    }
    
    // 根据studentid删除
    public void deleteByStudentid(String studentid){
        tbtask_recordsDao.deleteByStudentid(studentid);
    }
    
    
}
