package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbCourse_task;

public class TbCourse_taskDynaSqlProvider {
    
    // 动态查询
    public String selectTbCourse_task(final TbCourse_task tbcourse_task){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "course_task" );
                if(tbcourse_task != null){
                    if(tbcourse_task.getId() != null && !tbcourse_task.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbcourse_task.getChapterid() != null && !tbcourse_task.getChapterid().equals("")){
                        WHERE(" chapterid LIKE CONCAT ('%',#{chapterid},'%') ");
                    }
                    if(tbcourse_task.getContent() != null && !tbcourse_task.getContent().equals("")){
                        WHERE(" content LIKE CONCAT ('%',#{content},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbCourse_task(final TbCourse_task tbcourse_task){
        
        return new SQL(){
            {
                INSERT_INTO( "course_task" );
                if(tbcourse_task.getId() != null && !tbcourse_task.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbcourse_task.getChapterid() != null && !tbcourse_task.getChapterid().equals("")){
                    VALUES(" chapterid", "#{chapterid}");
                }
                if(tbcourse_task.getContent() != null && !tbcourse_task.getContent().equals("")){
                    VALUES(" content", "#{content}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbCourse_task(final TbCourse_task tbcourse_task){
        
        return new SQL(){
            {
                UPDATE( "course_task" );
                if(tbcourse_task.getId() != null && !tbcourse_task.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbcourse_task.getChapterid() != null && !tbcourse_task.getChapterid().equals("")){
                    SET(" chapterid= #{chapterid}");
                }
                if(tbcourse_task.getContent() != null && !tbcourse_task.getContent().equals("")){
                    SET(" content= #{content}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
