package com.gz.icms.dao;

import com.gz.icms.pojo.TbCourse_task;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("course_taskDao")
public interface Course_taskDao {
/*create by gz*/

	@Select("select * from course_task ")
	 List<TbCourse_task> selects() throws Exception;

	@Select("select * from course_task where id=#{id}")                      
	 TbCourse_task selectById(int id) throws Exception;

	@Delete("delete from course_task where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into course_task(id,chapterid,content,time) values(#{id},#{chapterid},#{content},#{time})")                     
	 Boolean insert(TbCourse_task course_task) throws Exception;

	@Update("update course_task set  id=#{id}, chapterid=#{chapterid}, content=#{content}, time=#{time} where id=#{id}")                     
	 Boolean update(TbCourse_task course_task) throws Exception;

}