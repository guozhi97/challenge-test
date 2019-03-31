package com.gz.icms.pojo;

public class TbChapter {
    
    
    private Integer id;
    private Integer classid;
    private String title;
    private String content;
    
    public TbChapter(){
    }
    public TbChapter(Integer id, Integer classid, String title, String content) {
        super();this.id = id;
        this.classid = classid;
        this.title = title;
        this.content = content;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getClassid() {
        return classid;
    }
    public void setClassid(Integer classid){
        this.classid = classid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }
    @Override
    public String toString() {
        return"chapter [id=" + id+ ", classid=" +classid+ ", title=" +title+ ", content=" +content + "]";
    }
}
