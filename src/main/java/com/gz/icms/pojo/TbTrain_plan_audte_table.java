package com.gz.icms.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbTrain_plan_audte_table implements Serializable {
/*create by gz*/

	private int id;

	private String auditor;

	private int trainplanid;

	private String outcome;

	private Date time;

	public TbTrain_plan_audte_table() {}

	@Override
	public String toString(){
		return "TbTrain_plan_audte_table [id=" + id + ",auditor=" + auditor + ",trainplanid=" + trainplanid + ",outcome=" + outcome + ",time=" + time + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public int getTrainplanid() {
		return trainplanid;
	}

	public void setTrainplanid(int trainplanid) {
		this.trainplanid = trainplanid;
	}

	public String getOutcome() {
		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}