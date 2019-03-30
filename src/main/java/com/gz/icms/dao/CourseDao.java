package com.gz.icms.dao;

import com.gz.icms.pojo.TbCourse;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("courseDao")
public interface CourseDao {
/*create by gz*/

	@Select("select * from course ")
	 List<TbCourse> selects() throws Exception;

	@Select("select * from course where id=#{id}")                      
	 TbCourse selectById(int id) throws Exception;

	@Delete("delete from course where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into course(id,name,period,credit,type,header) values(#{id},#{name},#{period},#{credit},#{type},#{header})")                     
	 Boolean insert(TbCourse course) throws Exception;

	@Update("update course set  id=#{id}, name=#{name}, period=#{period}, credit=#{credit}, type=#{type}, header=#{header} where id=#{id}")                     
	 Boolean update(TbCourse course) throws Exception;

}