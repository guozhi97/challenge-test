package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbAcademy;

public class TbAcademyDynaSqlProvider {
    
    // 动态查询
    public String selectTbAcademy(final TbAcademy tbacademy){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "academy" );
                if(tbacademy != null){
                    if(tbacademy.getId() != null && !tbacademy.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbacademy.getName() != null && !tbacademy.getName().equals("")){
                        WHERE(" name LIKE CONCAT ('%',#{name},'%') ");
                    }
                    if(tbacademy.getSchool() != null && !tbacademy.getSchool().equals("")){
                        WHERE(" school LIKE CONCAT ('%',#{school},'%') ");
                    }
                    if(tbacademy.getAuditor() != null && !tbacademy.getAuditor().equals("")){
                        WHERE(" auditor LIKE CONCAT ('%',#{auditor},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbAcademy(final TbAcademy tbacademy){
        
        return new SQL(){
            {
                INSERT_INTO( "academy" );
                if(tbacademy.getId() != null && !tbacademy.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbacademy.getName() != null && !tbacademy.getName().equals("")){
                    VALUES(" name", "#{name}");
                }
                if(tbacademy.getSchool() != null && !tbacademy.getSchool().equals("")){
                    VALUES(" school", "#{school}");
                }
                if(tbacademy.getAuditor() != null && !tbacademy.getAuditor().equals("")){
                    VALUES(" auditor", "#{auditor}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbAcademy(final TbAcademy tbacademy){
        
        return new SQL(){
            {
                UPDATE( "academy" );
                if(tbacademy.getId() != null && !tbacademy.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbacademy.getName() != null && !tbacademy.getName().equals("")){
                    SET(" name= #{name}");
                }
                if(tbacademy.getSchool() != null && !tbacademy.getSchool().equals("")){
                    SET(" school= #{school}");
                }
                if(tbacademy.getAuditor() != null && !tbacademy.getAuditor().equals("")){
                    SET(" auditor= #{auditor}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
