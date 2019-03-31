package com.gz.icms.pojo;

public class TbAcademy {
    
    
    private Integer id;
    private String name;
    private String school;
    private String auditor;
    
    public TbAcademy(){
    }
    public TbAcademy(Integer id, String name, String school, String auditor) {
        super();this.id = id;
        this.name = name;
        this.school = school;
        this.auditor = auditor;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public String getAuditor() {
        return auditor;
    }
    public void setAuditor(String auditor){
        this.auditor = auditor;
    }
    @Override
    public String toString() {
        return"academy [id=" + id+ ", name=" +name+ ", school=" +school+ ", auditor=" +auditor + "]";
    }
}
