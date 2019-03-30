package com.gz.icms.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbTask_records implements Serializable {
/*create by gz*/

	private int id;

	private int taskid;

	private String studentid;

	private Date finishedtime;

	public TbTask_records() {}

	@Override
	public String toString(){
		return "TbTask_records [id=" + id + ",taskid=" + taskid + ",studentid=" + studentid + ",finishedtime=" + finishedtime + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public Date getFinishedtime() {
		return finishedtime;
	}

	public void setFinishedtime(Date finishedtime) {
		this.finishedtime = finishedtime;
	}
}