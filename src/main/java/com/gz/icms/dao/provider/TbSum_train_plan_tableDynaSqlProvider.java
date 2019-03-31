package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbSum_train_plan_table;

public class TbSum_train_plan_tableDynaSqlProvider {
    
    // 动态查询
    public String selectTbSum_train_plan_table(final TbSum_train_plan_table tbsum_train_plan_table){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "sum_train_plan_table" );
                if(tbsum_train_plan_table != null){
                    if(tbsum_train_plan_table.getId() != null && !tbsum_train_plan_table.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbsum_train_plan_table.getHeader() != null && !tbsum_train_plan_table.getHeader().equals("")){
                        WHERE(" header LIKE CONCAT ('%',#{header},'%') ");
                    }
                    if(tbsum_train_plan_table.getAuditor() != null && !tbsum_train_plan_table.getAuditor().equals("")){
                        WHERE(" auditor LIKE CONCAT ('%',#{auditor},'%') ");
                    }
                    if(tbsum_train_plan_table.getTrainobjectiveid() != null && !tbsum_train_plan_table.getTrainobjectiveid().equals("")){
                        WHERE(" trainobjectiveid LIKE CONCAT ('%',#{trainobjectiveid},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbSum_train_plan_table(final TbSum_train_plan_table tbsum_train_plan_table){
        
        return new SQL(){
            {
                INSERT_INTO( "sum_train_plan_table" );
                if(tbsum_train_plan_table.getId() != null && !tbsum_train_plan_table.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbsum_train_plan_table.getHeader() != null && !tbsum_train_plan_table.getHeader().equals("")){
                    VALUES(" header", "#{header}");
                }
                if(tbsum_train_plan_table.getAuditor() != null && !tbsum_train_plan_table.getAuditor().equals("")){
                    VALUES(" auditor", "#{auditor}");
                }
                if(tbsum_train_plan_table.getTrainobjectiveid() != null && !tbsum_train_plan_table.getTrainobjectiveid().equals("")){
                    VALUES(" trainobjectiveid", "#{trainobjectiveid}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbSum_train_plan_table(final TbSum_train_plan_table tbsum_train_plan_table){
        
        return new SQL(){
            {
                UPDATE( "sum_train_plan_table" );
                if(tbsum_train_plan_table.getId() != null && !tbsum_train_plan_table.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbsum_train_plan_table.getHeader() != null && !tbsum_train_plan_table.getHeader().equals("")){
                    SET(" header= #{header}");
                }
                if(tbsum_train_plan_table.getAuditor() != null && !tbsum_train_plan_table.getAuditor().equals("")){
                    SET(" auditor= #{auditor}");
                }
                if(tbsum_train_plan_table.getTrainobjectiveid() != null && !tbsum_train_plan_table.getTrainobjectiveid().equals("")){
                    SET(" trainobjectiveid= #{trainobjectiveid}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
