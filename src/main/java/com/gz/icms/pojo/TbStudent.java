package com.gz.icms.pojo;

import java.io.Serializable;

public class TbStudent implements Serializable {
    
    
    private String id;
    private String name;
    private String password;
    private Integer age;
    private String sex;
    private String tell;
    private String major;
    private String academic;
    
    public TbStudent(){
    }
    public TbStudent(String id, String name, String password, Integer age, String sex, String tell, String major, String academic) {
        super();this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.tell = tell;
        this.major = major;
        this.academic = academic;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getTell() {
        return tell;
    }
    public void setTell(String tell){
        this.tell = tell;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getAcademic() {
        return academic;
    }
    public void setAcademic(String academic){
        this.academic = academic;
    }
    @Override
    public String toString() {
        return"student [id=" + id+ ", name=" +name+ ", password=" +password+ ", age=" +age+ ", sex=" +sex+ ", tell=" +tell+ ", major=" +major+ ", academic=" +academic + "]";
    }
}
