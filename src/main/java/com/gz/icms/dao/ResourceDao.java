package com.gz.icms.dao;

import com.gz.icms.pojo.TbResource;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("resourceDao")
public interface ResourceDao {
/*create by gz*/

	@Select("select * from resource ")
	 List<TbResource> selects() throws Exception;

	@Select("select * from resource where id=#{id}")                      
	 TbResource selectById(int id) throws Exception;

	@Delete("delete from resource where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into resource(id,chapterid,description,path) values(#{id},#{chapterid},#{description},#{path})")                     
	 Boolean insert(TbResource resource) throws Exception;

	@Update("update resource set  id=#{id}, chapterid=#{chapterid}, description=#{description}, path=#{path} where id=#{id}")                     
	 Boolean update(TbResource resource) throws Exception;

}