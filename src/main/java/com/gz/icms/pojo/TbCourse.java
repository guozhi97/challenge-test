package com.gz.icms.pojo;

import java.io.Serializable;

public class TbCourse implements Serializable {
    
    
    private Integer id;
    private String name;
    private Integer period;
    private Integer credit;
    private Integer type;
    private String header;
    
    public TbCourse(){
    }
    public TbCourse(Integer id, String name, Integer period, Integer credit, Integer type, String header) {
        super();this.id = id;
        this.name = name;
        this.period = period;
        this.credit = credit;
        this.type = type;
        this.header = header;
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
    public Integer getPeriod() {
        return period;
    }
    public void setPeriod(Integer period){
        this.period = period;
    }
    public Integer getCredit() {
        return credit;
    }
    public void setCredit(Integer credit){
        this.credit = credit;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type){
        this.type = type;
    }
    public String getHeader() {
        return header;
    }
    public void setHeader(String header){
        this.header = header;
    }
    @Override
    public String toString() {
        return"course [id=" + id+ ", name=" +name+ ", period=" +period+ ", credit=" +credit+ ", type=" +type+ ", header=" +header + "]";
    }
}
