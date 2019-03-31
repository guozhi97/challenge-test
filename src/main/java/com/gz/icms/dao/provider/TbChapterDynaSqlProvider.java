package com.gz.icms.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.gz.icms.pojo.TbChapter;

public class TbChapterDynaSqlProvider {
    
    // 动态查询
    public String selectTbChapter(final TbChapter tbchapter){
        
        String sql =  new SQL(){
            {
                SELECT("*");
                FROM( "chapter" );
                if(tbchapter != null){
                    if(tbchapter.getId() != null && !tbchapter.getId().equals("")){
                        WHERE(" id LIKE CONCAT ('%',#{id},'%') ");
                    }
                    if(tbchapter.getClassid() != null && !tbchapter.getClassid().equals("")){
                        WHERE(" classid LIKE CONCAT ('%',#{classid},'%') ");
                    }
                    if(tbchapter.getTitle() != null && !tbchapter.getTitle().equals("")){
                        WHERE(" title LIKE CONCAT ('%',#{title},'%') ");
                    }
                    if(tbchapter.getContent() != null && !tbchapter.getContent().equals("")){
                        WHERE(" content LIKE CONCAT ('%',#{content},'%') ");
                    }
                }
            }
        }.toString();
        
        return sql;
    }
    
    // 动态插入
    public String insertTbChapter(final TbChapter tbchapter){
        
        return new SQL(){
            {
                INSERT_INTO( "chapter" );
                if(tbchapter.getId() != null && !tbchapter.getId().equals("")){
                    VALUES(" id", "#{id}");
                }
                if(tbchapter.getClassid() != null && !tbchapter.getClassid().equals("")){
                    VALUES(" classid", "#{classid}");
                }
                if(tbchapter.getTitle() != null && !tbchapter.getTitle().equals("")){
                    VALUES(" title", "#{title}");
                }
                if(tbchapter.getContent() != null && !tbchapter.getContent().equals("")){
                    VALUES(" content", "#{content}");
                }
            }
        }.toString();
    }
    
    // 动态更新
    public String updateTbChapter(final TbChapter tbchapter){
        
        return new SQL(){
            {
                UPDATE( "chapter" );
                if(tbchapter.getId() != null && !tbchapter.getId().equals("")){
                    SET(" id= #{id}");
                }
                if(tbchapter.getClassid() != null && !tbchapter.getClassid().equals("")){
                    SET(" classid= #{classid}");
                }
                if(tbchapter.getTitle() != null && !tbchapter.getTitle().equals("")){
                    SET(" title= #{title}");
                }
                if(tbchapter.getContent() != null && !tbchapter.getContent().equals("")){
                    SET(" content= #{content}");
                }
                WHERE(" id = #{id} ");
            }
        }.toString();
    }
    
}
