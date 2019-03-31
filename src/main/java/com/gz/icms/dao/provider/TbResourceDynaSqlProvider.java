package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbResource;

public class TbResourceDynaSqlProvider {
    
    // 动态查询
    public String selectTbResource(final TbResource tbresource){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "resource" );
                if(tbresource != null){
                    if(tbresource.getId() != null && !tbresource.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbresource.getChapterid() != null && !tbresource.getChapterid().equals("")){
                        WHERE(" chapterid LIKE CONCAT ('%',#{chapterid},'%') ");
                    }
                    if(tbresource.getDescription() != null && !tbresource.getDescription().equals("")){
                        WHERE(" description LIKE CONCAT ('%',#{description},'%') ");
                    }
                    if(tbresource.getPath() != null && !tbresource.getPath().equals("")){
                        WHERE(" path LIKE CONCAT ('%',#{path},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbResource(final TbResource tbresource){
        
        return new SQL(){
            {
                INSERT_INTO( "resource" );
                if(tbresource.getId() != null && !tbresource.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbresource.getChapterid() != null && !tbresource.getChapterid().equals("")){
                    VALUES(" chapterid", "#{chapterid}");
                }
                if(tbresource.getDescription() != null && !tbresource.getDescription().equals("")){
                    VALUES(" description", "#{description}");
                }
                if(tbresource.getPath() != null && !tbresource.getPath().equals("")){
                    VALUES(" path", "#{path}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbResource(final TbResource tbresource){
        
        return new SQL(){
            {
                UPDATE( "resource" );
                if(tbresource.getId() != null && !tbresource.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbresource.getChapterid() != null && !tbresource.getChapterid().equals("")){
                    SET(" chapterid= #{chapterid}");
                }
                if(tbresource.getDescription() != null && !tbresource.getDescription().equals("")){
                    SET(" description= #{description}");
                }
                if(tbresource.getPath() != null && !tbresource.getPath().equals("")){
                    SET(" path= #{path}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
