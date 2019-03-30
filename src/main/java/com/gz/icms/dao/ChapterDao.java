package com.gz.icms.dao;

import java.util.List;

import com.gz.icms.pojo.TbChapter;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;                    
import org.apache.ibatis.annotations.Select;                    
import org.apache.ibatis.annotations.Update;                    
import org.springframework.stereotype.Repository;

@Repository("chapterDao")
public interface ChapterDao {
/*create by gz*/

	@Select("select * from chapter ")
	 List<TbChapter> selects() throws Exception;

	@Select("select * from chapter where id=#{id}")                      
	 TbChapter selectById(int id) throws Exception;

	@Delete("delete from chapter where id=#{id}")                      
	 Boolean delete(int id) throws Exception;

	@Insert("insert into chapter(id,classid,title,content,time) values(#{id},#{classid},#{title},#{content},#{time})")                     
	 Boolean insert(TbChapter chapter) throws Exception;

	@Update("update chapter set  id=#{id}, classid=#{classid}, title=#{title}, content=#{content}, time=#{time} where id=#{id}")                     
	 Boolean update(TbChapter chapter) throws Exception;

}