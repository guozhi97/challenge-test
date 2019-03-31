package com.gz.icms.pojo;

public class TbSum_train_plan_table {
    
    
    private Integer id;
    private String header;
    private String auditor;
    private Integer trainobjectiveid;
    
    public TbSum_train_plan_table(){
    }
    public TbSum_train_plan_table(Integer id, String header, String auditor, Integer trainobjectiveid) {
        super();this.id = id;
        this.header = header;
        this.auditor = auditor;
        this.trainobjectiveid = trainobjectiveid;
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
    public String getAuditor() {
        return auditor;
    }
    public void setAuditor(String auditor){
        this.auditor = auditor;
    }
    public Integer getTrainobjectiveid() {
        return trainobjectiveid;
    }
    public void setTrainobjectiveid(Integer trainobjectiveid){
        this.trainobjectiveid = trainobjectiveid;
    }
    @Override
    public String toString() {
        return"sum_train_plan_table [id=" + id+ ", header=" +header+ ", auditor=" +auditor+ ", trainobjectiveid=" +trainobjectiveid + "]";
    }
}
