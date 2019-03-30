package com.gz.icms.dao;

import com.gz.icms.pojo.TbStudent;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("studentDao")
public interface StudentDao {
/*create by gz*/

	@Select("select * from student ")
	 List<TbStudent> selects() throws Exception;

	@Select("select * from student where id=#{id}")                      
	 TbStudent selectById(String id) throws Exception;

	@Delete("delete from student where id=#{id}")                      
	 Boolean delete(String id) throws Exception;

	@Insert("insert into student(id,name,password,age,sex,tell,major,academic) values(#{id},#{name},#{password},#{age},#{sex},#{tell},#{major},#{academic})")                     
	 Boolean insert(TbStudent student) throws Exception;

	@Update("update student set  id=#{id}, name=#{name}, password=#{password}, age=#{age}, sex=#{sex}, tell=#{tell}, major=#{major}, academic=#{academic} where id=#{id}")                     
	 Boolean update(TbStudent student) throws Exception;

}