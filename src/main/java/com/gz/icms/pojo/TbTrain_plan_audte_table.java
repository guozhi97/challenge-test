package com.gz.icms.pojo;

import java.io.Serializable;

public class TbTrain_plan_audte_table implements Serializable {
    
    
    private Integer id;
    private String auditor;
    private Integer trainplanid;
    private String outcome;
    
    public TbTrain_plan_audte_table(){
    }
    public TbTrain_plan_audte_table(Integer id, String auditor, Integer trainplanid, String outcome) {
        super();this.id = id;
        this.auditor = auditor;
        this.trainplanid = trainplanid;
        this.outcome = outcome;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getAuditor() {
        return auditor;
    }
    public void setAuditor(String auditor){
        this.auditor = auditor;
    }
    public Integer getTrainplanid() {
        return trainplanid;
    }
    public void setTrainplanid(Integer trainplanid){
        this.trainplanid = trainplanid;
    }
    public String getOutcome() {
        return outcome;
    }
    public void setOutcome(String outcome){
        this.outcome = outcome;
    }
    @Override
    public String toString() {
        return"train_plan_audte_table [id=" + id+ ", auditor=" +auditor+ ", trainplanid=" +trainplanid+ ", outcome=" +outcome + "]";
    }
}
