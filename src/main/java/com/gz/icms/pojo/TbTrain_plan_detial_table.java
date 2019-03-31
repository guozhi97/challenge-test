package com.gz.icms.pojo;

public class TbTrain_plan_detial_table {
    
    
    private Integer id;
    private String coursename;
    private String credit;
    private String term;
    private String version;
    private Integer trainplanid;
    
    public TbTrain_plan_detial_table(){
    }
    public TbTrain_plan_detial_table(Integer id, String coursename, String credit, String term, String version, Integer trainplanid) {
        super();this.id = id;
        this.coursename = coursename;
        this.credit = credit;
        this.term = term;
        this.version = version;
        this.trainplanid = trainplanid;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getCoursename() {
        return coursename;
    }
    public void setCoursename(String coursename){
        this.coursename = coursename;
    }
    public String getCredit() {
        return credit;
    }
    public void setCredit(String credit){
        this.credit = credit;
    }
    public String getTerm() {
        return term;
    }
    public void setTerm(String term){
        this.term = term;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version){
        this.version = version;
    }
    public Integer getTrainplanid() {
        return trainplanid;
    }
    public void setTrainplanid(Integer trainplanid){
        this.trainplanid = trainplanid;
    }
    @Override
    public String toString() {
        return"train_plan_detial_table [id=" + id+ ", coursename=" +coursename+ ", credit=" +credit+ ", term=" +term+ ", version=" +version+ ", trainplanid=" +trainplanid + "]";
    }
}
