package com.gz.icms.pojo;

import java.io.Serializable;

public class TbResource implements Serializable {
    
    
    private Integer id;
    private Integer chapterid;
    private String description;
    private String path;
    
    public TbResource(){
    }
    public TbResource(Integer id, Integer chapterid, String description, String path) {
        super();this.id = id;
        this.chapterid = chapterid;
        this.description = description;
        this.path = path;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path){
        this.path = path;
    }
    @Override
    public String toString() {
        return"resource [id=" + id+ ", chapterid=" +chapterid+ ", description=" +description+ ", path=" +path + "]";
    }
}
