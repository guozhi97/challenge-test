package com.gz.icms.pojo;

import java.io.Serializable;

public class TbSpecialty implements Serializable {
    
    
    private Integer id;
    private String header;
    private String name;
    private String explain;
    
    public TbSpecialty(){
    }
    public TbSpecialty(Integer id, String header, String name, String explain) {
        super();this.id = id;
        this.header = header;
        this.name = name;
        this.explain = explain;
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
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getExplain() {
        return explain;
    }
    public void setExplain(String explain){
        this.explain = explain;
    }
    @Override
    public String toString() {
        return"specialty [id=" + id+ ", header=" +header+ ", name=" +name+ ", explain=" +explain + "]";
    }
}
