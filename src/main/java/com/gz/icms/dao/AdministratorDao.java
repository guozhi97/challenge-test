package com.gz.icms.dao;

import java.util.List;

import com.gz.icms.pojo.TbAdministrator;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;                    
import org.apache.ibatis.annotations.Select;                    
import org.apache.ibatis.annotations.Update;                    
import org.springframework.stereotype.Repository;

@Repository("administratorDao")
public interface AdministratorDao {
/*create by gz*/

	@Select("select * from administrator ")
	 List<TbAdministrator> selects() throws Exception;

	@Select("select * from administrator where id=#{id}")
	 TbAdministrator selectById(String id) throws Exception;

	@Delete("delete from administrator where id=#{id}")
	 Boolean delete(String id) throws Exception;

	@Insert("insert into administrator(id,name,password,email,tell) values(#{id},#{name},#{password},#{email},#{tell})")                     
	 Boolean insert(TbAdministrator administrator) throws Exception;

	@Update("update administrator set  id=#{id}, name=#{name}, password=#{password}, email=#{email}, tell=#{tell} where null=#{null}")                     
	 Boolean update(TbAdministrator administrator) throws Exception;

}