package com.gz.icms.dao;

import com.gz.icms.pojo.TbAcademy;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("academyDao")
 public interface AcademyDao {
/*create by gz*/

	@Select("select * from academy ")
	 List<TbAcademy> selects() throws Exception;

	@Select("select * from academy where id=#{id}")                      
	 TbAcademy selectById(int id) throws Exception;

	@Delete("delete from academy where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into academy(id,name,school,auditor) values(#{id},#{name},#{school},#{auditor})")                     
	 Boolean insert(TbAcademy academy) throws Exception;

	@Update("update academy set  id=#{id}, name=#{name}, school=#{school}, auditor=#{auditor} where id=#{id}")                     
	 Boolean update(TbAcademy academy) throws Exception;

}