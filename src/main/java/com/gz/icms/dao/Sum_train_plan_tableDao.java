package com.gz.icms.dao;

import com.gz.icms.pojo.TbSum_train_plan_table;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("sum_train_plan_tableDao")
public interface Sum_train_plan_tableDao {
/*create by gz*/

	@Select("select * from sum_train_plan_table ")
	 List<TbSum_train_plan_table> selects() throws Exception;

	@Select("select * from sum_train_plan_table where id=#{id}")                      
	 TbSum_train_plan_table selectById(int id) throws Exception;

	@Delete("delete from sum_train_plan_table where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into sum_train_plan_table(id,header,auditor,trainobjectiveid,maketime) values(#{id},#{header},#{auditor},#{trainobjectiveid},#{maketime})")                     
	 Boolean insert(TbSum_train_plan_table sum_train_plan_table) throws Exception;

	@Update("update sum_train_plan_table set  id=#{id}, header=#{header}, auditor=#{auditor}, trainobjectiveid=#{trainobjectiveid}, maketime=#{maketime} where id=#{id}")                     
	 Boolean update(TbSum_train_plan_table sum_train_plan_table) throws Exception;

}