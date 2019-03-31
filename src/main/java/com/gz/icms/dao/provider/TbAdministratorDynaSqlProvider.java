package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbAdministrator;

public class TbAdministratorDynaSqlProvider {
    
    // 动态查询
    public String selectTbAdministrator(final TbAdministrator tbadministrator){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "administrator" );
                if(tbadministrator != null){
                    if(tbadministrator.getId() != null && !tbadministrator.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbadministrator.getName() != null && !tbadministrator.getName().equals("")){
                        WHERE(" name LIKE CONCAT ('%',#{name},'%') ");
                    }
                    if(tbadministrator.getPassword() != null && !tbadministrator.getPassword().equals("")){
                        WHERE(" password LIKE CONCAT ('%',#{password},'%') ");
                    }
                    if(tbadministrator.getEmail() != null && !tbadministrator.getEmail().equals("")){
                        WHERE(" email LIKE CONCAT ('%',#{email},'%') ");
                    }
                    if(tbadministrator.getTell() != null && !tbadministrator.getTell().equals("")){
                        WHERE(" tell LIKE CONCAT ('%',#{tell},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbAdministrator(final TbAdministrator tbadministrator){
        
        return new SQL(){
            {
                INSERT_INTO( "administrator" );
                if(tbadministrator.getId() != null && !tbadministrator.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbadministrator.getName() != null && !tbadministrator.getName().equals("")){
                    VALUES(" name", "#{name}");
                }
                if(tbadministrator.getPassword() != null && !tbadministrator.getPassword().equals("")){
                    VALUES(" password", "#{password}");
                }
                if(tbadministrator.getEmail() != null && !tbadministrator.getEmail().equals("")){
                    VALUES(" email", "#{email}");
                }
                if(tbadministrator.getTell() != null && !tbadministrator.getTell().equals("")){
                    VALUES(" tell", "#{tell}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbAdministrator(final TbAdministrator tbadministrator){
        
        return new SQL(){
            {
                UPDATE( "administrator" );
                if(tbadministrator.getId() != null && !tbadministrator.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbadministrator.getName() != null && !tbadministrator.getName().equals("")){
                    SET(" name= #{name}");
                }
                if(tbadministrator.getPassword() != null && !tbadministrator.getPassword().equals("")){
                    SET(" password= #{password}");
                }
                if(tbadministrator.getEmail() != null && !tbadministrator.getEmail().equals("")){
                    SET(" email= #{email}");
                }
                if(tbadministrator.getTell() != null && !tbadministrator.getTell().equals("")){
                    SET(" tell= #{tell}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
