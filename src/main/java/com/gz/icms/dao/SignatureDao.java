package com.gz.icms.dao;

import com.gz.icms.pojo.TbSignature;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("signatureDao")
public interface SignatureDao {
/*create by gz*/

	@Select("select * from signature ")
	 List<TbSignature> selects() throws Exception;

	@Select("select * from signature where id=#{id}")                      
	 TbSignature selectById(int id) throws Exception;

	@Delete("delete from signature where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into signature(id,studentid,chapterid,period,time,state) values(#{id},#{studentid},#{chapterid},#{period},#{time},#{state})")                     
	 Boolean insert(TbSignature signature) throws Exception;

	@Update("update signature set  id=#{id}, studentid=#{studentid}, chapterid=#{chapterid}, period=#{period}, time=#{time}, state=#{state} where id=#{id}")                     
	 Boolean update(TbSignature signature) throws Exception;

}