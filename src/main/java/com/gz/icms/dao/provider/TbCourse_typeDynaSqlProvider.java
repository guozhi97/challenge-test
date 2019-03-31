package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbCourse_type;

public class TbCourse_typeDynaSqlProvider {
    
    // 动态查询
    public String selectTbCourse_type(final TbCourse_type tbcourse_type){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "course_type" );
                if(tbcourse_type != null){
                    if(tbcourse_type.getId() != null && !tbcourse_type.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbcourse_type.getTypename() != null && !tbcourse_type.getTypename().equals("")){
                        WHERE(" typename LIKE CONCAT ('%',#{typename},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbCourse_type(final TbCourse_type tbcourse_type){
        
        return new SQL(){
            {
                INSERT_INTO( "course_type" );
                if(tbcourse_type.getId() != null && !tbcourse_type.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbcourse_type.getTypename() != null && !tbcourse_type.getTypename().equals("")){
                    VALUES(" typename", "#{typename}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbCourse_type(final TbCourse_type tbcourse_type){
        
        return new SQL(){
            {
                UPDATE( "course_type" );
                if(tbcourse_type.getId() != null && !tbcourse_type.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbcourse_type.getTypename() != null && !tbcourse_type.getTypename().equals("")){
                    SET(" typename= #{typename}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
