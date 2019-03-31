package com.gz.icms.pojo;

import java.io.Serializable;

public class TbTrain_objective_table implements Serializable {
    
    
    private Integer id;
    private String header;
    private Integer specialtyid;
    private String content;
    private String version;
    private String auditor;
    
    public TbTrain_objective_table(){
    }
    public TbTrain_objective_table(Integer id, String header, Integer specialtyid, String content, String version, String auditor) {
        super();this.id = id;
        this.header = header;
        this.specialtyid = specialtyid;
        this.content = content;
        this.version = version;
        this.auditor = auditor;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getHeader() {
        return header;
    }
    public void setHeader(String header){
        this.header = header;
    }
    public Integer getSpecialtyid() {
        return specialtyid;
    }
    public void setSpecialtyid(Integer specialtyid){
        this.specialtyid = specialtyid;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version){
        this.version = version;
    }
    public String getAuditor() {
        return auditor;
    }
    public void setAuditor(String auditor){
        this.auditor = auditor;
    }
    @Override
    public String toString() {
        return"train_objective_table [id=" + id+ ", header=" +header+ ", specialtyid=" +specialtyid+ ", content=" +content+ ", version=" +version+ ", auditor=" +auditor + "]";
    }
}
