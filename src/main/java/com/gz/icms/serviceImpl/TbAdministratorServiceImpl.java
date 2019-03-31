package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbAdministratorDao;
import com.gz.icms.pojo.TbAdministrator;
import com.gz.icms.service.TbAdministratorService;

@Service("tbadministratorService")
public class TbAdministratorServiceImpl implements TbAdministratorService{
    
    @Autowired
    private TbAdministratorDao tbadministratorDao;
    
    // 添加
    public void addTbAdministrator(TbAdministrator tbadministrator){
        tbadministratorDao.insertTbAdministrator(tbadministrator);
    }
    
    // 更新
    public void updateTbAdministrator(TbAdministrator tbadministrator){
        tbadministratorDao.updateTbAdministrator(tbadministrator);
    }
    
    // 找到所有对象
    public List<TbAdministrator> findAllTbAdministrator(){
        return tbadministratorDao.findAllTbAdministrator();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbAdministrator> findTbAdministratorBySome(TbAdministrator tbadministrator){
        return tbadministratorDao.findTbAdministratorBySome(tbadministrator);
    }
    
    // 根据id查找
    public TbAdministrator findById(Integer id){
        return tbadministratorDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbadministratorDao.deleteById(id);
    }
    
    // 根据name查找
    public TbAdministrator findByName(String name){
        return tbadministratorDao.findByName(name);
    }
    
    // 根据name删除
    public void deleteByName(String name){
        tbadministratorDao.deleteByName(name);
    }
    
    // 根据password查找
    public TbAdministrator findByPassword(String password){
        return tbadministratorDao.findByPassword(password);
    }
    
    // 根据password删除
    public void deleteByPassword(String password){
        tbadministratorDao.deleteByPassword(password);
    }
    
    // 根据email查找
    public TbAdministrator findByEmail(String email){
        return tbadministratorDao.findByEmail(email);
    }
    
    // 根据email删除
    public void deleteByEmail(String email){
        tbadministratorDao.deleteByEmail(email);
    }
    
    // 根据tell查找
    public TbAdministrator findByTell(String tell){
        return tbadministratorDao.findByTell(tell);
    }
    
    // 根据tell删除
    public void deleteByTell(String tell){
        tbadministratorDao.deleteByTell(tell);
    }
    
    
}
