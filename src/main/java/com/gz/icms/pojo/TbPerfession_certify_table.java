package com.gz.icms.pojo;

import java.io.Serializable;

public class TbPerfession_certify_table implements Serializable {
    
    
    private Integer id;
    private String content;
    private String version;
    private String specialtyname;
    
    public TbPerfession_certify_table(){
    }
    public TbPerfession_certify_table(Integer id, String content, String version, String specialtyname) {
        super();this.id = id;
        this.content = content;
        this.version = version;
        this.specialtyname = specialtyname;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
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
    public String getSpecialtyname() {
        return specialtyname;
    }
    public void setSpecialtyname(String specialtyname){
        this.specialtyname = specialtyname;
    }
    @Override
    public String toString() {
        return"perfession_certify_table [id=" + id+ ", content=" +content+ ", version=" +version+ ", specialtyname=" +specialtyname + "]";
    }
}
