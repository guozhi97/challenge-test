package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbSpecialty;

public class TbSpecialtyDynaSqlProvider {
    
    // 动态查询
    public String selectTbSpecialty(final TbSpecialty tbspecialty){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "specialty" );
                if(tbspecialty != null){
                    if(tbspecialty.getId() != null && !tbspecialty.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbspecialty.getHeader() != null && !tbspecialty.getHeader().equals("")){
                        WHERE(" header LIKE CONCAT ('%',#{header},'%') ");
                    }
                    if(tbspecialty.getName() != null && !tbspecialty.getName().equals("")){
                        WHERE(" name LIKE CONCAT ('%',#{name},'%') ");
                    }
                    if(tbspecialty.getExplain() != null && !tbspecialty.getExplain().equals("")){
                        WHERE(" explain LIKE CONCAT ('%',#{explain},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbSpecialty(final TbSpecialty tbspecialty){
        
        return new SQL(){
            {
                INSERT_INTO( "specialty" );
                if(tbspecialty.getId() != null && !tbspecialty.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbspecialty.getHeader() != null && !tbspecialty.getHeader().equals("")){
                    VALUES(" header", "#{header}");
                }
                if(tbspecialty.getName() != null && !tbspecialty.getName().equals("")){
                    VALUES(" name", "#{name}");
                }
                if(tbspecialty.getExplain() != null && !tbspecialty.getExplain().equals("")){
                    VALUES(" explain", "#{explain}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbSpecialty(final TbSpecialty tbspecialty){
        
        return new SQL(){
            {
                UPDATE( "specialty" );
                if(tbspecialty.getId() != null && !tbspecialty.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbspecialty.getHeader() != null && !tbspecialty.getHeader().equals("")){
                    SET(" header= #{header}");
                }
                if(tbspecialty.getName() != null && !tbspecialty.getName().equals("")){
                    SET(" name= #{name}");
                }
                if(tbspecialty.getExplain() != null && !tbspecialty.getExplain().equals("")){
                    SET(" explain= #{explain}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
