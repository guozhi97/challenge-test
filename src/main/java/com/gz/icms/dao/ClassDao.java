package com.gz.icms.dao;

import com.gz.icms.pojo.TbClass;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("classDao")
 public interface ClassDao {
/*create by gz*/

	@Select("select * from class ")
	 List<TbClass> selects() throws Exception;

	@Select("select * from class where id=#{id}")                      
	 TbClass selectById(int id) throws Exception;

	@Delete("delete from class where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into class(id,name,teacherid,courseid) values(#{id},#{name},#{teacherid},#{courseid})")                     
	 Boolean insert(TbClass cls) throws Exception;

	@Update("update class set  id=#{id}, name=#{name}, teacherid=#{teacherid}, courseid=#{courseid} where id=#{id}")                     
	 Boolean update(TbClass cls) throws Exception;

}