package com.gz.icms.pojo;

public class TbTask_records {
    
    
    private Integer id;
    private Integer taskid;
    private String studentid;
    
    public TbTask_records(){
    }
    public TbTask_records(Integer id, Integer taskid, String studentid) {
        super();this.id = id;
        this.taskid = taskid;
        this.studentid = studentid;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getTaskid() {
        return taskid;
    }
    public void setTaskid(Integer taskid){
        this.taskid = taskid;
    }
    public String getStudentid() {
        return studentid;
    }
    public void setStudentid(String studentid){
        this.studentid = studentid;
    }
    @Override
    public String toString() {
        return"task_records [id=" + id+ ", taskid=" +taskid+ ", studentid=" +studentid + "]";
    }
}
