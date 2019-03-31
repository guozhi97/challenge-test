package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbTeacher;

public class TbTeacherDynaSqlProvider {
    
    // 动态查询
    public String selectTbTeacher(final TbTeacher tbteacher){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "teacher" );
                if(tbteacher != null){
                    if(tbteacher.getId() != null && !tbteacher.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbteacher.getName() != null && !tbteacher.getName().equals("")){
                        WHERE(" name LIKE CONCAT ('%',#{name},'%') ");
                    }
                    if(tbteacher.getPassword() != null && !tbteacher.getPassword().equals("")){
                        WHERE(" password LIKE CONCAT ('%',#{password},'%') ");
                    }
                    if(tbteacher.getEmail() != null && !tbteacher.getEmail().equals("")){
                        WHERE(" email LIKE CONCAT ('%',#{email},'%') ");
                    }
                    if(tbteacher.getAcademic() != null && !tbteacher.getAcademic().equals("")){
                        WHERE(" academic LIKE CONCAT ('%',#{academic},'%') ");
                    }
                    if(tbteacher.getTell() != null && !tbteacher.getTell().equals("")){
                        WHERE(" tell LIKE CONCAT ('%',#{tell},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbTeacher(final TbTeacher tbteacher){
        
        return new SQL(){
            {
                INSERT_INTO( "teacher" );
                if(tbteacher.getId() != null && !tbteacher.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbteacher.getName() != null && !tbteacher.getName().equals("")){
                    VALUES(" name", "#{name}");
                }
                if(tbteacher.getPassword() != null && !tbteacher.getPassword().equals("")){
                    VALUES(" password", "#{password}");
                }
                if(tbteacher.getEmail() != null && !tbteacher.getEmail().equals("")){
                    VALUES(" email", "#{email}");
                }
                if(tbteacher.getAcademic() != null && !tbteacher.getAcademic().equals("")){
                    VALUES(" academic", "#{academic}");
                }
                if(tbteacher.getTell() != null && !tbteacher.getTell().equals("")){
                    VALUES(" tell", "#{tell}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbTeacher(final TbTeacher tbteacher){
        
        return new SQL(){
            {
                UPDATE( "teacher" );
                if(tbteacher.getId() != null && !tbteacher.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbteacher.getName() != null && !tbteacher.getName().equals("")){
                    SET(" name= #{name}");
                }
                if(tbteacher.getPassword() != null && !tbteacher.getPassword().equals("")){
                    SET(" password= #{password}");
                }
                if(tbteacher.getEmail() != null && !tbteacher.getEmail().equals("")){
                    SET(" email= #{email}");
                }
                if(tbteacher.getAcademic() != null && !tbteacher.getAcademic().equals("")){
                    SET(" academic= #{academic}");
                }
                if(tbteacher.getTell() != null && !tbteacher.getTell().equals("")){
                    SET(" tell= #{tell}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
