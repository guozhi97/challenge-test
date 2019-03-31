package com.gz.icms.dao.provider;

import com.gz.icms.pojo.TbCourse;
import org.apache.ibatis.jdbc.SQL;

public class TbCourseDynaSqlProvider {
    
    // 动态查询
    public String selectTbCourse(final TbCourse tbcourse){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "course" );
                if(tbcourse != null){
                    if(tbcourse.getId() != null && !tbcourse.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbcourse.getName() != null && !tbcourse.getName().equals("")){
                        WHERE(" name LIKE CONCAT ('%',#{name},'%') ");
                    }
                    if(tbcourse.getPeriod() != null && !tbcourse.getPeriod().equals("")){
                        WHERE(" period LIKE CONCAT ('%',#{period},'%') ");
                    }
                    if(tbcourse.getCredit() != null && !tbcourse.getCredit().equals("")){
                        WHERE(" credit LIKE CONCAT ('%',#{credit},'%') ");
                    }
                    if(tbcourse.getType() != null && !tbcourse.getType().equals("")){
                        WHERE(" type LIKE CONCAT ('%',#{type},'%') ");
                    }
                    if(tbcourse.getHeader() != null && !tbcourse.getHeader().equals("")){
                        WHERE(" header LIKE CONCAT ('%',#{header},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbCourse(final TbCourse tbcourse){
        
        return new SQL(){
            {
                INSERT_INTO( "course" );
                if(tbcourse.getId() != null && !tbcourse.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbcourse.getName() != null && !tbcourse.getName().equals("")){
                    VALUES(" name", "#{name}");
                }
                if(tbcourse.getPeriod() != null && !tbcourse.getPeriod().equals("")){
                    VALUES(" period", "#{period}");
                }
                if(tbcourse.getCredit() != null && !tbcourse.getCredit().equals("")){
                    VALUES(" credit", "#{credit}");
                }
                if(tbcourse.getType() != null && !tbcourse.getType().equals("")){
                    VALUES(" type", "#{type}");
                }
                if(tbcourse.getHeader() != null && !tbcourse.getHeader().equals("")){
                    VALUES(" header", "#{header}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbCourse(final TbCourse tbcourse){
        
        return new SQL(){
            {
                UPDATE( "course" );
                if(tbcourse.getId() != null && !tbcourse.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbcourse.getName() != null && !tbcourse.getName().equals("")){
                    SET(" name= #{name}");
                }
                if(tbcourse.getPeriod() != null && !tbcourse.getPeriod().equals("")){
                    SET(" period= #{period}");
                }
                if(tbcourse.getCredit() != null && !tbcourse.getCredit().equals("")){
                    SET(" credit= #{credit}");
                }
                if(tbcourse.getType() != null && !tbcourse.getType().equals("")){
                    SET(" type= #{type}");
                }
                if(tbcourse.getHeader() != null && !tbcourse.getHeader().equals("")){
                    SET(" header= #{header}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
