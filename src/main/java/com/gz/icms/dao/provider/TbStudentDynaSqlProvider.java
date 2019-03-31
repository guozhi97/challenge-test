package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbStudent;

public class TbStudentDynaSqlProvider {
    
    // 动态查询
    public String selectTbStudent(final TbStudent tbstudent){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "student" );
                if(tbstudent != null){
                    if(tbstudent.getId() != null && !tbstudent.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbstudent.getName() != null && !tbstudent.getName().equals("")){
                        WHERE(" name LIKE CONCAT ('%',#{name},'%') ");
                    }
                    if(tbstudent.getPassword() != null && !tbstudent.getPassword().equals("")){
                        WHERE(" password LIKE CONCAT ('%',#{password},'%') ");
                    }
                    if(tbstudent.getAge() != null && !tbstudent.getAge().equals("")){
                        WHERE(" age LIKE CONCAT ('%',#{age},'%') ");
                    }
                    if(tbstudent.getSex() != null && !tbstudent.getSex().equals("")){
                        WHERE(" sex LIKE CONCAT ('%',#{sex},'%') ");
                    }
                    if(tbstudent.getTell() != null && !tbstudent.getTell().equals("")){
                        WHERE(" tell LIKE CONCAT ('%',#{tell},'%') ");
                    }
                    if(tbstudent.getMajor() != null && !tbstudent.getMajor().equals("")){
                        WHERE(" major LIKE CONCAT ('%',#{major},'%') ");
                    }
                    if(tbstudent.getAcademic() != null && !tbstudent.getAcademic().equals("")){
                        WHERE(" academic LIKE CONCAT ('%',#{academic},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbStudent(final TbStudent tbstudent){
        
        return new SQL(){
            {
                INSERT_INTO( "student" );
                if(tbstudent.getId() != null && !tbstudent.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbstudent.getName() != null && !tbstudent.getName().equals("")){
                    VALUES(" name", "#{name}");
                }
                if(tbstudent.getPassword() != null && !tbstudent.getPassword().equals("")){
                    VALUES(" password", "#{password}");
                }
                if(tbstudent.getAge() != null && !tbstudent.getAge().equals("")){
                    VALUES(" age", "#{age}");
                }
                if(tbstudent.getSex() != null && !tbstudent.getSex().equals("")){
                    VALUES(" sex", "#{sex}");
                }
                if(tbstudent.getTell() != null && !tbstudent.getTell().equals("")){
                    VALUES(" tell", "#{tell}");
                }
                if(tbstudent.getMajor() != null && !tbstudent.getMajor().equals("")){
                    VALUES(" major", "#{major}");
                }
                if(tbstudent.getAcademic() != null && !tbstudent.getAcademic().equals("")){
                    VALUES(" academic", "#{academic}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbStudent(final TbStudent tbstudent){
        
        return new SQL(){
            {
                UPDATE( "student" );
                if(tbstudent.getId() != null && !tbstudent.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbstudent.getName() != null && !tbstudent.getName().equals("")){
                    SET(" name= #{name}");
                }
                if(tbstudent.getPassword() != null && !tbstudent.getPassword().equals("")){
                    SET(" password= #{password}");
                }
                if(tbstudent.getAge() != null && !tbstudent.getAge().equals("")){
                    SET(" age= #{age}");
                }
                if(tbstudent.getSex() != null && !tbstudent.getSex().equals("")){
                    SET(" sex= #{sex}");
                }
                if(tbstudent.getTell() != null && !tbstudent.getTell().equals("")){
                    SET(" tell= #{tell}");
                }
                if(tbstudent.getMajor() != null && !tbstudent.getMajor().equals("")){
                    SET(" major= #{major}");
                }
                if(tbstudent.getAcademic() != null && !tbstudent.getAcademic().equals("")){
                    SET(" academic= #{academic}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
