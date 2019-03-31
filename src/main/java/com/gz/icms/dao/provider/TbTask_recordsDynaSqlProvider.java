package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbTask_records;

public class TbTask_recordsDynaSqlProvider {
    
    // 动态查询
    public String selectTbTask_records(final TbTask_records tbtask_records){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "task_records" );
                if(tbtask_records != null){
                    if(tbtask_records.getId() != null && !tbtask_records.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbtask_records.getTaskid() != null && !tbtask_records.getTaskid().equals("")){
                        WHERE(" taskid LIKE CONCAT ('%',#{taskid},'%') ");
                    }
                    if(tbtask_records.getStudentid() != null && !tbtask_records.getStudentid().equals("")){
                        WHERE(" studentid LIKE CONCAT ('%',#{studentid},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbTask_records(final TbTask_records tbtask_records){
        
        return new SQL(){
            {
                INSERT_INTO( "task_records" );
                if(tbtask_records.getId() != null && !tbtask_records.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbtask_records.getTaskid() != null && !tbtask_records.getTaskid().equals("")){
                    VALUES(" taskid", "#{taskid}");
                }
                if(tbtask_records.getStudentid() != null && !tbtask_records.getStudentid().equals("")){
                    VALUES(" studentid", "#{studentid}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbTask_records(final TbTask_records tbtask_records){
        
        return new SQL(){
            {
                UPDATE( "task_records" );
                if(tbtask_records.getId() != null && !tbtask_records.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbtask_records.getTaskid() != null && !tbtask_records.getTaskid().equals("")){
                    SET(" taskid= #{taskid}");
                }
                if(tbtask_records.getStudentid() != null && !tbtask_records.getStudentid().equals("")){
                    SET(" studentid= #{studentid}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
