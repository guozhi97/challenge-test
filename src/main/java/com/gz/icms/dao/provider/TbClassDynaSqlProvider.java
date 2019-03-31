package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbClass;

public class TbClassDynaSqlProvider {
    
    // 动态查询
    public String selectTbClass(final TbClass tbclass){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "class" );
                if(tbclass != null){
                    if(tbclass.getId() != null && !tbclass.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbclass.getName() != null && !tbclass.getName().equals("")){
                        WHERE(" name LIKE CONCAT ('%',#{name},'%') ");
                    }
                    if(tbclass.getTeacherid() != null && !tbclass.getTeacherid().equals("")){
                        WHERE(" teacherid LIKE CONCAT ('%',#{teacherid},'%') ");
                    }
                    if(tbclass.getCourseid() != null && !tbclass.getCourseid().equals("")){
                        WHERE(" courseid LIKE CONCAT ('%',#{courseid},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbClass(final TbClass tbclass){
        
        return new SQL(){
            {
                INSERT_INTO( "class" );
                if(tbclass.getId() != null && !tbclass.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbclass.getName() != null && !tbclass.getName().equals("")){
                    VALUES(" name", "#{name}");
                }
                if(tbclass.getTeacherid() != null && !tbclass.getTeacherid().equals("")){
                    VALUES(" teacherid", "#{teacherid}");
                }
                if(tbclass.getCourseid() != null && !tbclass.getCourseid().equals("")){
                    VALUES(" courseid", "#{courseid}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbClass(final TbClass tbclass){
        
        return new SQL(){
            {
                UPDATE( "class" );
                if(tbclass.getId() != null && !tbclass.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbclass.getName() != null && !tbclass.getName().equals("")){
                    SET(" name= #{name}");
                }
                if(tbclass.getTeacherid() != null && !tbclass.getTeacherid().equals("")){
                    SET(" teacherid= #{teacherid}");
                }
                if(tbclass.getCourseid() != null && !tbclass.getCourseid().equals("")){
                    SET(" courseid= #{courseid}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
