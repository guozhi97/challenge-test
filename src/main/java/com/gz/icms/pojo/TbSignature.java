package com.gz.icms.pojo;

public class TbSignature {
    
    
    private Integer id;
    private String studentid;
    private Integer chapterid;
    private Integer period;
    private Integer state;
    
    public TbSignature(){
    }
    public TbSignature(Integer id, String studentid, Integer chapterid, Integer period, Integer state) {
        super();this.id = id;
        this.studentid = studentid;
        this.chapterid = chapterid;
        this.period = period;
        this.state = state;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getStudentid() {
        return studentid;
    }
    public void setStudentid(String studentid){
        this.studentid = studentid;
    }
    public Integer getChapterid() {
        return chapterid;
    }
    public void setChapterid(Integer chapterid){
        this.chapterid = chapterid;
    }
    public Integer getPeriod() {
        return period;
    }
    public void setPeriod(Integer period){
        this.period = period;
    }
    public Integer getState() {
        return state;
    }
    public void setState(Integer state){
        this.state = state;
    }
    @Override
    public String toString() {
        return"signature [id=" + id+ ", studentid=" +studentid+ ", chapterid=" +chapterid+ ", period=" +period+ ", state=" +state + "]";
    }
}
