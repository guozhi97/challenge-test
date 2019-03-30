package com.gz.icms.dao;

import com.gz.icms.pojo.TbTask_records;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("task_recordsDao")
public interface Task_recordsDao {
/*create by gz*/

	@Select("select * from task_records ")
	 List<TbTask_records> selects() throws Exception;

	@Select("select * from task_records where id=#{id}")                      
	 TbTask_records selectById(int id) throws Exception;

	@Delete("delete from task_records where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into task_records(id,taskid,studentid,finishedtime) values(#{id},#{taskid},#{studentid},#{finishedtime})")                     
	 Boolean insert(TbTask_records task_records) throws Exception;

	@Update("update task_records set  id=#{id}, taskid=#{taskid}, studentid=#{studentid}, finishedtime=#{finishedtime} where id=#{id}")                     
	 Boolean update(TbTask_records task_records) throws Exception;

}