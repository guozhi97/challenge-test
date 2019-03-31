package com.gz.icms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gz.icms.dao.TbSignatureDao;
import com.gz.icms.pojo.TbSignature;
import com.gz.icms.service.TbSignatureService;

@Service("tbsignatureService")
public class TbSignatureServiceImpl implements TbSignatureService{
    
    @Autowired
    private TbSignatureDao tbsignatureDao;
    
    // 添加
    public void addTbSignature(TbSignature tbsignature){
        tbsignatureDao.insertTbSignature(tbsignature);
    }
    
    // 更新
    public void updateTbSignature(TbSignature tbsignature){
        tbsignatureDao.updateTbSignature(tbsignature);
    }
    
    // 找到所有对象
    public List<TbSignature> findAllTbSignature(){
        return tbsignatureDao.findAllTbSignature();
    }
    
    // 根据一个抽象对象找到所有符合要求的对象
    public List<TbSignature> findTbSignatureBySome(TbSignature tbsignature){
        return tbsignatureDao.findTbSignatureBySome(tbsignature);
    }
    
    // 根据id查找
    public TbSignature findById(Integer id){
        return tbsignatureDao.findById(id);
    }
    
    // 根据id删除
    public void deleteById(Integer id){
        tbsignatureDao.deleteById(id);
    }
    
    // 根据studentid查找
    public TbSignature findByStudentid(String studentid){
        return tbsignatureDao.findByStudentid(studentid);
    }
    
    // 根据studentid删除
    public void deleteByStudentid(String studentid){
        tbsignatureDao.deleteByStudentid(studentid);
    }
    
    // 根据chapterid查找
    public TbSignature findByChapterid(Integer chapterid){
        return tbsignatureDao.findByChapterid(chapterid);
    }
    
    // 根据chapterid删除
    public void deleteByChapterid(Integer chapterid){
        tbsignatureDao.deleteByChapterid(chapterid);
    }
    
    // 根据period查找
    public TbSignature findByPeriod(Integer period){
        return tbsignatureDao.findByPeriod(period);
    }
    
    // 根据period删除
    public void deleteByPeriod(Integer period){
        tbsignatureDao.deleteByPeriod(period);
    }
    
    // 根据state查找
    public TbSignature findByState(Integer state){
        return tbsignatureDao.findByState(state);
    }
    
    // 根据state删除
    public void deleteByState(Integer state){
        tbsignatureDao.deleteByState(state);
    }
    
    
}
