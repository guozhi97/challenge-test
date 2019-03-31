package com.gz.icms.pojo;

import java.io.Serializable;

public class TbCourse_task implements Serializable {
    
    
    private Integer id;
    private Integer chapterid;
    private String content;
    
    public TbCourse_task(){
    }
    public TbCourse_task(Integer id, Integer chapterid, String content) {
        super();this.id = id;
        this.chapterid = chapterid;
        this.content = content;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getChapterid() {
        return chapterid;
    }
    public void setChapterid(Integer chapterid){
        this.chapterid = chapterid;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }
    @Override
    public String toString() {
        return"course_task [id=" + id+ ", chapterid=" +chapterid+ ", content=" +content + "]";
    }
}
