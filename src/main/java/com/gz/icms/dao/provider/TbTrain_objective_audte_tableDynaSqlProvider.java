package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbTrain_objective_audte_table;

public class TbTrain_objective_audte_tableDynaSqlProvider {
    
    // 动态查询
    public String selectTbTrain_objective_audte_table(final TbTrain_objective_audte_table tbtrain_objective_audte_table){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "train_objective_audte_table" );
                if(tbtrain_objective_audte_table != null){
                    if(tbtrain_objective_audte_table.getId() != null && !tbtrain_objective_audte_table.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbtrain_objective_audte_table.getAuditor() != null && !tbtrain_objective_audte_table.getAuditor().equals("")){
                        WHERE(" auditor LIKE CONCAT ('%',#{auditor},'%') ");
                    }
                    if(tbtrain_objective_audte_table.getTrainobjectiveid() != null && !tbtrain_objective_audte_table.getTrainobjectiveid().equals("")){
                        WHERE(" trainobjectiveid LIKE CONCAT ('%',#{trainobjectiveid},'%') ");
                    }
                    if(tbtrain_objective_audte_table.getOutcome() != null && !tbtrain_objective_audte_table.getOutcome().equals("")){
                        WHERE(" outcome LIKE CONCAT ('%',#{outcome},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbTrain_objective_audte_table(final TbTrain_objective_audte_table tbtrain_objective_audte_table){
        
        return new SQL(){
            {
                INSERT_INTO( "train_objective_audte_table" );
                if(tbtrain_objective_audte_table.getId() != null && !tbtrain_objective_audte_table.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbtrain_objective_audte_table.getAuditor() != null && !tbtrain_objective_audte_table.getAuditor().equals("")){
                    VALUES(" auditor", "#{auditor}");
                }
                if(tbtrain_objective_audte_table.getTrainobjectiveid() != null && !tbtrain_objective_audte_table.getTrainobjectiveid().equals("")){
                    VALUES(" trainobjectiveid", "#{trainobjectiveid}");
                }
                if(tbtrain_objective_audte_table.getOutcome() != null && !tbtrain_objective_audte_table.getOutcome().equals("")){
                    VALUES(" outcome", "#{outcome}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbTrain_objective_audte_table(final TbTrain_objective_audte_table tbtrain_objective_audte_table){
        
        return new SQL(){
            {
                UPDATE( "train_objective_audte_table" );
                if(tbtrain_objective_audte_table.getId() != null && !tbtrain_objective_audte_table.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbtrain_objective_audte_table.getAuditor() != null && !tbtrain_objective_audte_table.getAuditor().equals("")){
                    SET(" auditor= #{auditor}");
                }
                if(tbtrain_objective_audte_table.getTrainobjectiveid() != null && !tbtrain_objective_audte_table.getTrainobjectiveid().equals("")){
                    SET(" trainobjectiveid= #{trainobjectiveid}");
                }
                if(tbtrain_objective_audte_table.getOutcome() != null && !tbtrain_objective_audte_table.getOutcome().equals("")){
                    SET(" outcome= #{outcome}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
