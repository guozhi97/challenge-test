package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbPerfession_certify_table;

public class TbPerfession_certify_tableDynaSqlProvider {
    
    // 动态查询
    public String selectTbPerfession_certify_table(final TbPerfession_certify_table tbperfession_certify_table){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "perfession_certify_table" );
                if(tbperfession_certify_table != null){
                    if(tbperfession_certify_table.getId() != null && !tbperfession_certify_table.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbperfession_certify_table.getContent() != null && !tbperfession_certify_table.getContent().equals("")){
                        WHERE(" content LIKE CONCAT ('%',#{content},'%') ");
                    }
                    if(tbperfession_certify_table.getVersion() != null && !tbperfession_certify_table.getVersion().equals("")){
                        WHERE(" version LIKE CONCAT ('%',#{version},'%') ");
                    }
                    if(tbperfession_certify_table.getSpecialtyname() != null && !tbperfession_certify_table.getSpecialtyname().equals("")){
                        WHERE(" specialtyname LIKE CONCAT ('%',#{specialtyname},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbPerfession_certify_table(final TbPerfession_certify_table tbperfession_certify_table){
        
        return new SQL(){
            {
                INSERT_INTO( "perfession_certify_table" );
                if(tbperfession_certify_table.getId() != null && !tbperfession_certify_table.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbperfession_certify_table.getContent() != null && !tbperfession_certify_table.getContent().equals("")){
                    VALUES(" content", "#{content}");
                }
                if(tbperfession_certify_table.getVersion() != null && !tbperfession_certify_table.getVersion().equals("")){
                    VALUES(" version", "#{version}");
                }
                if(tbperfession_certify_table.getSpecialtyname() != null && !tbperfession_certify_table.getSpecialtyname().equals("")){
                    VALUES(" specialtyname", "#{specialtyname}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbPerfession_certify_table(final TbPerfession_certify_table tbperfession_certify_table){
        
        return new SQL(){
            {
                UPDATE( "perfession_certify_table" );
                if(tbperfession_certify_table.getId() != null && !tbperfession_certify_table.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbperfession_certify_table.getContent() != null && !tbperfession_certify_table.getContent().equals("")){
                    SET(" content= #{content}");
                }
                if(tbperfession_certify_table.getVersion() != null && !tbperfession_certify_table.getVersion().equals("")){
                    SET(" version= #{version}");
                }
                if(tbperfession_certify_table.getSpecialtyname() != null && !tbperfession_certify_table.getSpecialtyname().equals("")){
                    SET(" specialtyname= #{specialtyname}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
