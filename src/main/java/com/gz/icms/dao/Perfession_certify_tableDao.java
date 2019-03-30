package com.gz.icms.dao;

import com.gz.icms.pojo.TbPerfession_certify_table;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("perfession_certify_tableDao")
public interface Perfession_certify_tableDao {
/*create by gz*/

	@Select("select * from perfession_certify_table ")
	 List<TbPerfession_certify_table> selects() throws Exception;

	@Select("select * from perfession_certify_table where id=#{id}")                      
	 TbPerfession_certify_table selectById(int id) throws Exception;

	@Delete("delete from perfession_certify_table where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into perfession_certify_table(id,content,version,specialtyname) values(#{id},#{content},#{version},#{specialtyname})")                     
	 Boolean insert(TbPerfession_certify_table perfession_certify_table) throws Exception;

	@Update("update perfession_certify_table set  id=#{id}, content=#{content}, version=#{version}, specialtyname=#{specialtyname} where id=#{id}")                     
	 Boolean update(TbPerfession_certify_table perfession_certify_table) throws Exception;

}