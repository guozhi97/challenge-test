package com.gz.icms.pojo;

public class TbAdministrator {
    
    
    private Integer id;
    private String name;
    private String password;
    private String email;
    private String tell;
    
    public TbAdministrator(){
    }
    public TbAdministrator(Integer id, String name, String password, String email, String tell) {
        super();this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.tell = tell;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getTell() {
        return tell;
    }
    public void setTell(String tell){
        this.tell = tell;
    }
    @Override
    public String toString() {
        return"administrator [id=" + id+ ", name=" +name+ ", password=" +password+ ", email=" +email+ ", tell=" +tell + "]";
    }
}
