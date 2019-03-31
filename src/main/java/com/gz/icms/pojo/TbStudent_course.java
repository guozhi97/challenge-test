package com.gz.icms.pojo;

import java.io.Serializable;

public class TbStudent_course implements Serializable {
    
    
    private Integer id;
    private String studentid;
    private Integer classid;
    
    public TbStudent_course(){
    }
    public TbStudent_course(Integer id, String studentid, Integer classid) {
        super();this.id = id;
        this.studentid = studentid;
        this.classid = classid;
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
    public Integer getClassid() {
        return classid;
    }
    public void setClassid(Integer classid){
        this.classid = classid;
    }
    @Override
    public String toString() {
        return"student_course [id=" + id+ ", studentid=" +studentid+ ", classid=" +classid + "]";
    }
}
