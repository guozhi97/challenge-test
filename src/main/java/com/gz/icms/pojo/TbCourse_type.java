package com.gz.icms.pojo;

import java.io.Serializable;

public class TbCourse_type implements Serializable {
    
    
    private Integer id;
    private String typename;
    
    public TbCourse_type(){
    }
    public TbCourse_type(Integer id, String typename) {
        super();this.id = id;
        this.typename = typename;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getTypename() {
        return typename;
    }
    public void setTypename(String typename){
        this.typename = typename;
    }
    @Override
    public String toString() {
        return"course_type [id=" + id+ ", typename=" +typename + "]";
    }
}
