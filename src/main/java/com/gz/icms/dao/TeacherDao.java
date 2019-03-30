package com.gz.icms.dao;

import com.gz.icms.pojo.TbTeacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("teacherDao")
public interface TeacherDao {
/*create by gz*/

	@Select("select * from teacher ")
	 List<TbTeacher> selects() throws Exception;

	@Select("select * from teacher where id=#{id}")                      
	 TbTeacher selectById(String id) throws Exception;

	@Delete("delete from teacher where id=#{id}")                      
	 Boolean delete(String id) throws Exception;

	@Insert("insert into teacher(id,name,password,email,academic,tell) values(#{id},#{name},#{password},#{email},#{academic},#{tell})")                     
	 Boolean insert(TbTeacher teacher) throws Exception;

	@Update("update teacher set  id=#{id}, name=#{name}, password=#{password}, email=#{email}, academic=#{academic}, tell=#{tell} where id=#{id}")                     
	 Boolean update(TbTeacher teacher) throws Exception;

}