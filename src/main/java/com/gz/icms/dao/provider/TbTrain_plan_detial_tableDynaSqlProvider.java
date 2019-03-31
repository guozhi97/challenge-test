package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbTrain_plan_detial_table;

public class TbTrain_plan_detial_tableDynaSqlProvider {
    
    // 动态查询
    public String selectTbTrain_plan_detial_table(final TbTrain_plan_detial_table tbtrain_plan_detial_table){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "train_plan_detial_table" );
                if(tbtrain_plan_detial_table != null){
                    if(tbtrain_plan_detial_table.getId() != null && !tbtrain_plan_detial_table.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbtrain_plan_detial_table.getCoursename() != null && !tbtrain_plan_detial_table.getCoursename().equals("")){
                        WHERE(" coursename LIKE CONCAT ('%',#{coursename},'%') ");
                    }
                    if(tbtrain_plan_detial_table.getCredit() != null && !tbtrain_plan_detial_table.getCredit().equals("")){
                        WHERE(" credit LIKE CONCAT ('%',#{credit},'%') ");
                    }
                    if(tbtrain_plan_detial_table.getTerm() != null && !tbtrain_plan_detial_table.getTerm().equals("")){
                        WHERE(" term LIKE CONCAT ('%',#{term},'%') ");
                    }
                    if(tbtrain_plan_detial_table.getVersion() != null && !tbtrain_plan_detial_table.getVersion().equals("")){
                        WHERE(" version LIKE CONCAT ('%',#{version},'%') ");
                    }
                    if(tbtrain_plan_detial_table.getTrainplanid() != null && !tbtrain_plan_detial_table.getTrainplanid().equals("")){
                        WHERE(" trainplanid LIKE CONCAT ('%',#{trainplanid},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbTrain_plan_detial_table(final TbTrain_plan_detial_table tbtrain_plan_detial_table){
        
        return new SQL(){
            {
                INSERT_INTO( "train_plan_detial_table" );
                if(tbtrain_plan_detial_table.getId() != null && !tbtrain_plan_detial_table.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbtrain_plan_detial_table.getCoursename() != null && !tbtrain_plan_detial_table.getCoursename().equals("")){
                    VALUES(" coursename", "#{coursename}");
                }
                if(tbtrain_plan_detial_table.getCredit() != null && !tbtrain_plan_detial_table.getCredit().equals("")){
                    VALUES(" credit", "#{credit}");
                }
                if(tbtrain_plan_detial_table.getTerm() != null && !tbtrain_plan_detial_table.getTerm().equals("")){
                    VALUES(" term", "#{term}");
                }
                if(tbtrain_plan_detial_table.getVersion() != null && !tbtrain_plan_detial_table.getVersion().equals("")){
                    VALUES(" version", "#{version}");
                }
                if(tbtrain_plan_detial_table.getTrainplanid() != null && !tbtrain_plan_detial_table.getTrainplanid().equals("")){
                    VALUES(" trainplanid", "#{trainplanid}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbTrain_plan_detial_table(final TbTrain_plan_detial_table tbtrain_plan_detial_table){
        
        return new SQL(){
            {
                UPDATE( "train_plan_detial_table" );
                if(tbtrain_plan_detial_table.getId() != null && !tbtrain_plan_detial_table.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbtrain_plan_detial_table.getCoursename() != null && !tbtrain_plan_detial_table.getCoursename().equals("")){
                    SET(" coursename= #{coursename}");
                }
                if(tbtrain_plan_detial_table.getCredit() != null && !tbtrain_plan_detial_table.getCredit().equals("")){
                    SET(" credit= #{credit}");
                }
                if(tbtrain_plan_detial_table.getTerm() != null && !tbtrain_plan_detial_table.getTerm().equals("")){
                    SET(" term= #{term}");
                }
                if(tbtrain_plan_detial_table.getVersion() != null && !tbtrain_plan_detial_table.getVersion().equals("")){
                    SET(" version= #{version}");
                }
                if(tbtrain_plan_detial_table.getTrainplanid() != null && !tbtrain_plan_detial_table.getTrainplanid().equals("")){
                    SET(" trainplanid= #{trainplanid}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
