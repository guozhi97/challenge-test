package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbTrain_objective_table;

public class TbTrain_objective_tableDynaSqlProvider {
    
    // 动态查询
    public String selectTbTrain_objective_table(final TbTrain_objective_table tbtrain_objective_table){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "train_objective_table" );
                if(tbtrain_objective_table != null){
                    if(tbtrain_objective_table.getId() != null && !tbtrain_objective_table.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbtrain_objective_table.getHeader() != null && !tbtrain_objective_table.getHeader().equals("")){
                        WHERE(" header LIKE CONCAT ('%',#{header},'%') ");
                    }
                    if(tbtrain_objective_table.getSpecialtyid() != null && !tbtrain_objective_table.getSpecialtyid().equals("")){
                        WHERE(" specialtyid LIKE CONCAT ('%',#{specialtyid},'%') ");
                    }
                    if(tbtrain_objective_table.getContent() != null && !tbtrain_objective_table.getContent().equals("")){
                        WHERE(" content LIKE CONCAT ('%',#{content},'%') ");
                    }
                    if(tbtrain_objective_table.getVersion() != null && !tbtrain_objective_table.getVersion().equals("")){
                        WHERE(" version LIKE CONCAT ('%',#{version},'%') ");
                    }
                    if(tbtrain_objective_table.getAuditor() != null && !tbtrain_objective_table.getAuditor().equals("")){
                        WHERE(" auditor LIKE CONCAT ('%',#{auditor},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbTrain_objective_table(final TbTrain_objective_table tbtrain_objective_table){
        
        return new SQL(){
            {
                INSERT_INTO( "train_objective_table" );
                if(tbtrain_objective_table.getId() != null && !tbtrain_objective_table.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbtrain_objective_table.getHeader() != null && !tbtrain_objective_table.getHeader().equals("")){
                    VALUES(" header", "#{header}");
                }
                if(tbtrain_objective_table.getSpecialtyid() != null && !tbtrain_objective_table.getSpecialtyid().equals("")){
                    VALUES(" specialtyid", "#{specialtyid}");
                }
                if(tbtrain_objective_table.getContent() != null && !tbtrain_objective_table.getContent().equals("")){
                    VALUES(" content", "#{content}");
                }
                if(tbtrain_objective_table.getVersion() != null && !tbtrain_objective_table.getVersion().equals("")){
                    VALUES(" version", "#{version}");
                }
                if(tbtrain_objective_table.getAuditor() != null && !tbtrain_objective_table.getAuditor().equals("")){
                    VALUES(" auditor", "#{auditor}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbTrain_objective_table(final TbTrain_objective_table tbtrain_objective_table){
        
        return new SQL(){
            {
                UPDATE( "train_objective_table" );
                if(tbtrain_objective_table.getId() != null && !tbtrain_objective_table.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbtrain_objective_table.getHeader() != null && !tbtrain_objective_table.getHeader().equals("")){
                    SET(" header= #{header}");
                }
                if(tbtrain_objective_table.getSpecialtyid() != null && !tbtrain_objective_table.getSpecialtyid().equals("")){
                    SET(" specialtyid= #{specialtyid}");
                }
                if(tbtrain_objective_table.getContent() != null && !tbtrain_objective_table.getContent().equals("")){
                    SET(" content= #{content}");
                }
                if(tbtrain_objective_table.getVersion() != null && !tbtrain_objective_table.getVersion().equals("")){
                    SET(" version= #{version}");
                }
                if(tbtrain_objective_table.getAuditor() != null && !tbtrain_objective_table.getAuditor().equals("")){
                    SET(" auditor= #{auditor}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
