package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbStudent_course;

public class TbStudent_courseDynaSqlProvider {
    
    // 动态查询
    public String selectTbStudent_course(final TbStudent_course tbstudent_course){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "student_course" );
                if(tbstudent_course != null){
                    if(tbstudent_course.getId() != null && !tbstudent_course.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbstudent_course.getStudentid() != null && !tbstudent_course.getStudentid().equals("")){
                        WHERE(" studentid LIKE CONCAT ('%',#{studentid},'%') ");
                    }
                    if(tbstudent_course.getClassid() != null && !tbstudent_course.getClassid().equals("")){
                        WHERE(" classid LIKE CONCAT ('%',#{classid},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbStudent_course(final TbStudent_course tbstudent_course){
        
        return new SQL(){
            {
                INSERT_INTO( "student_course" );
                if(tbstudent_course.getId() != null && !tbstudent_course.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbstudent_course.getStudentid() != null && !tbstudent_course.getStudentid().equals("")){
                    VALUES(" studentid", "#{studentid}");
                }
                if(tbstudent_course.getClassid() != null && !tbstudent_course.getClassid().equals("")){
                    VALUES(" classid", "#{classid}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbStudent_course(final TbStudent_course tbstudent_course){
        
        return new SQL(){
            {
                UPDATE( "student_course" );
                if(tbstudent_course.getId() != null && !tbstudent_course.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbstudent_course.getStudentid() != null && !tbstudent_course.getStudentid().equals("")){
                    SET(" studentid= #{studentid}");
                }
                if(tbstudent_course.getClassid() != null && !tbstudent_course.getClassid().equals("")){
                    SET(" classid= #{classid}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
