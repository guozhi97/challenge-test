package com.gz.icms.dao;

import com.gz.icms.pojo.TbSpecialty;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("specialtyDao")
public interface SpecialtyDao {
/*create by gz*/

	@Select("select * from specialty ")
	 List<TbSpecialty> selects() throws Exception;

	@Select("select * from specialty where id=#{id}")                      
	 TbSpecialty selectById(int id) throws Exception;

	@Delete("delete from specialty where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into specialty(id,header,name,explain) values(#{id},#{header},#{name},#{explain})")                     
	 Boolean insert(TbSpecialty specialty) throws Exception;

	@Update("update specialty set  id=#{id}, header=#{header}, name=#{name}, explain=#{explain} where id=#{id}")                     
	 Boolean update(TbSpecialty specialty) throws Exception;

}