package com.gz.icms.pojo;

public class TbClass {
    
    
    private Integer id;
    private String name;
    private String teacherid;
    private Integer courseid;
    
    public TbClass(){
    }
    public TbClass(Integer id, String name, String teacherid, Integer courseid) {
        super();this.id = id;
        this.name = name;
        this.teacherid = teacherid;
        this.courseid = courseid;
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
    public String getTeacherid() {
        return teacherid;
    }
    public void setTeacherid(String teacherid){
        this.teacherid = teacherid;
    }
    public Integer getCourseid() {
        return courseid;
    }
    public void setCourseid(Integer courseid){
        this.courseid = courseid;
    }
    @Override
    public String toString() {
        return"class [id=" + id+ ", name=" +name+ ", teacherid=" +teacherid+ ", courseid=" +courseid + "]";
    }
}
