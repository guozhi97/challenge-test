package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbSignature;

public class TbSignatureDynaSqlProvider {
    
    // 动态查询
    public String selectTbSignature(final TbSignature tbsignature){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "signature" );
                if(tbsignature != null){
                    if(tbsignature.getId() != null && !tbsignature.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbsignature.getStudentid() != null && !tbsignature.getStudentid().equals("")){
                        WHERE(" studentid LIKE CONCAT ('%',#{studentid},'%') ");
                    }
                    if(tbsignature.getChapterid() != null && !tbsignature.getChapterid().equals("")){
                        WHERE(" chapterid LIKE CONCAT ('%',#{chapterid},'%') ");
                    }
                    if(tbsignature.getPeriod() != null && !tbsignature.getPeriod().equals("")){
                        WHERE(" period LIKE CONCAT ('%',#{period},'%') ");
                    }
                    if(tbsignature.getState() != null && !tbsignature.getState().equals("")){
                        WHERE(" state LIKE CONCAT ('%',#{state},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbSignature(final TbSignature tbsignature){
        
        return new SQL(){
            {
                INSERT_INTO( "signature" );
                if(tbsignature.getId() != null && !tbsignature.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbsignature.getStudentid() != null && !tbsignature.getStudentid().equals("")){
                    VALUES(" studentid", "#{studentid}");
                }
                if(tbsignature.getChapterid() != null && !tbsignature.getChapterid().equals("")){
                    VALUES(" chapterid", "#{chapterid}");
                }
                if(tbsignature.getPeriod() != null && !tbsignature.getPeriod().equals("")){
                    VALUES(" period", "#{period}");
                }
                if(tbsignature.getState() != null && !tbsignature.getState().equals("")){
                    VALUES(" state", "#{state}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbSignature(final TbSignature tbsignature){
        
        return new SQL(){
            {
                UPDATE( "signature" );
                if(tbsignature.getId() != null && !tbsignature.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbsignature.getStudentid() != null && !tbsignature.getStudentid().equals("")){
                    SET(" studentid= #{studentid}");
                }
                if(tbsignature.getChapterid() != null && !tbsignature.getChapterid().equals("")){
                    SET(" chapterid= #{chapterid}");
                }
                if(tbsignature.getPeriod() != null && !tbsignature.getPeriod().equals("")){
                    SET(" period= #{period}");
                }
                if(tbsignature.getState() != null && !tbsignature.getState().equals("")){
                    SET(" state= #{state}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
