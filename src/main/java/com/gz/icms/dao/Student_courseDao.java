package com.gz.icms.dao;

import com.gz.icms.pojo.TbStudent_course;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("student_courseDao")
public interface Student_courseDao {
/*create by gz*/

	@Select("select * from student_course ")
	 List<TbStudent_course> selects() throws Exception;

	@Select("select * from student_course where id=#{id}")                      
	 TbStudent_course selectById(int id) throws Exception;

	@Delete("delete from student_course where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into student_course(id,studentid,classid) values(#{id},#{studentid},#{classid})")                     
	 Boolean insert(TbStudent_course student_course) throws Exception;

	@Update("update student_course set  id=#{id}, studentid=#{studentid}, classid=#{classid} where id=#{id}")                     
	 Boolean update(TbStudent_course student_course) throws Exception;

}