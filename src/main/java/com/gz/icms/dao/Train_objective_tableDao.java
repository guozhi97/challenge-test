package com.gz.icms.dao;

import com.gz.icms.pojo.TbTrain_objective_table;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("train_objective_tableDao")
public interface Train_objective_tableDao {
/*create by gz*/

	@Select("select * from train_objective_table ")
	 List<TbTrain_objective_table> selects() throws Exception;

	@Select("select * from train_objective_table where id=#{id}")                      
	 TbTrain_objective_table selectById(int id) throws Exception;

	@Delete("delete from train_objective_table where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into train_objective_table(id,header,specialtyid,content,version,auditor) values(#{id},#{header},#{specialtyid},#{content},#{version},#{auditor})")                     
	 Boolean insert(TbTrain_objective_table train_objective_table) throws Exception;

	@Update("update train_objective_table set  id=#{id}, header=#{header}, specialtyid=#{specialtyid}, content=#{content}, version=#{version}, auditor=#{auditor} where id=#{id}")                     
	 Boolean update(TbTrain_objective_table train_objective_table) throws Exception;

}