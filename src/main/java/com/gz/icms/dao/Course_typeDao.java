package com.gz.icms.dao;

import com.gz.icms.pojo.TbCourse_type;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("course_typeDao")
public interface Course_typeDao {
/*create by gz*/

	@Select("select * from course_type ")
	 List<TbCourse_type> selects() throws Exception;

	@Select("select * from course_type where id=#{id}")                      
	 TbCourse_type selectById(int id) throws Exception;

	@Delete("delete from course_type where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into course_type(id,typename) values(#{id},#{typename})")                     
	 Boolean insert(TbCourse_type course_type) throws Exception;

	@Update("update course_type set  id=#{id}, typename=#{typename} where id=#{id}")                     
	 Boolean update(TbCourse_type course_type) throws Exception;

}