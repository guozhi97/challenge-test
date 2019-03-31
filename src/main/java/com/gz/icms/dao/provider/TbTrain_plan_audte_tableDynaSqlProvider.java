package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbTrain_plan_audte_table;

public class TbTrain_plan_audte_tableDynaSqlProvider {
    
    // 动态查询
    public String selectTbTrain_plan_audte_table(final TbTrain_plan_audte_table tbtrain_plan_audte_table){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "train_plan_audte_table" );
                if(tbtrain_plan_audte_table != null){
                    if(tbtrain_plan_audte_table.getId() != null && !tbtrain_plan_audte_table.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbtrain_plan_audte_table.getAuditor() != null && !tbtrain_plan_audte_table.getAuditor().equals("")){
                        WHERE(" auditor LIKE CONCAT ('%',#{auditor},'%') ");
                    }
                    if(tbtrain_plan_audte_table.getTrainplanid() != null && !tbtrain_plan_audte_table.getTrainplanid().equals("")){
                        WHERE(" trainplanid LIKE CONCAT ('%',#{trainplanid},'%') ");
                    }
                    if(tbtrain_plan_audte_table.getOutcome() != null && !tbtrain_plan_audte_table.getOutcome().equals("")){
                        WHERE(" outcome LIKE CONCAT ('%',#{outcome},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbTrain_plan_audte_table(final TbTrain_plan_audte_table tbtrain_plan_audte_table){
        
        return new SQL(){
            {
                INSERT_INTO( "train_plan_audte_table" );
                if(tbtrain_plan_audte_table.getId() != null && !tbtrain_plan_audte_table.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbtrain_plan_audte_table.getAuditor() != null && !tbtrain_plan_audte_table.getAuditor().equals("")){
                    VALUES(" auditor", "#{auditor}");
                }
                if(tbtrain_plan_audte_table.getTrainplanid() != null && !tbtrain_plan_audte_table.getTrainplanid().equals("")){
                    VALUES(" trainplanid", "#{trainplanid}");
                }
                if(tbtrain_plan_audte_table.getOutcome() != null && !tbtrain_plan_audte_table.getOutcome().equals("")){
                    VALUES(" outcome", "#{outcome}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbTrain_plan_audte_table(final TbTrain_plan_audte_table tbtrain_plan_audte_table){
        
        return new SQL(){
            {
                UPDATE( "train_plan_audte_table" );
                if(tbtrain_plan_audte_table.getId() != null && !tbtrain_plan_audte_table.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbtrain_plan_audte_table.getAuditor() != null && !tbtrain_plan_audte_table.getAuditor().equals("")){
                    SET(" auditor= #{auditor}");
                }
                if(tbtrain_plan_audte_table.getTrainplanid() != null && !tbtrain_plan_audte_table.getTrainplanid().equals("")){
                    SET(" trainplanid= #{trainplanid}");
                }
                if(tbtrain_plan_audte_table.getOutcome() != null && !tbtrain_plan_audte_table.getOutcome().equals("")){
                    SET(" outcome= #{outcome}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
