package com.gz.icms.dao;

import com.gz.icms.pojo.TbTrain_plan_audte_table;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("train_plan_audte_tableDao")
public interface Train_plan_audte_tableDao {
/*create by gz*/

	@Select("select * from train_plan_audte_table ")
	 List<TbTrain_plan_audte_table> selects() throws Exception;

	@Select("select * from train_plan_audte_table where id=#{id}")                      
	 TbTrain_plan_audte_table selectById(int id) throws Exception;

	@Delete("delete from train_plan_audte_table where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into train_plan_audte_table(id,auditor,trainplanid,outcome,time) values(#{id},#{auditor},#{trainplanid},#{outcome},#{time})")                     
	 Boolean insert(TbTrain_plan_audte_table train_plan_audte_table) throws Exception;

	@Update("update train_plan_audte_table set  id=#{id}, auditor=#{auditor}, trainplanid=#{trainplanid}, outcome=#{outcome}, time=#{time} where id=#{id}")                     
	 Boolean update(TbTrain_plan_audte_table train_plan_audte_table) throws Exception;

}