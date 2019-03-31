package com.gz.icms.pojo;

import java.io.Serializable;

public class TbTrain_objective_audte_table implements Serializable {
    
    
    private Integer id;
    private String auditor;
    private Integer trainobjectiveid;
    private String outcome;
    
    public TbTrain_objective_audte_table(){
    }
    public TbTrain_objective_audte_table(Integer id, String auditor, Integer trainobjectiveid, String outcome) {
        super();this.id = id;
        this.auditor = auditor;
        this.trainobjectiveid = trainobjectiveid;
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
    public Integer getTrainobjectiveid() {
        return trainobjectiveid;
    }
    public void setTrainobjectiveid(Integer trainobjectiveid){
        this.trainobjectiveid = trainobjectiveid;
    }
    public String getOutcome() {
        return outcome;
    }
    public void setOutcome(String outcome){
        this.outcome = outcome;
    }
    @Override
    public String toString() {
        return"train_objective_audte_table [id=" + id+ ", auditor=" +auditor+ ", trainobjectiveid=" +trainobjectiveid+ ", outcome=" +outcome + "]";
    }
}
