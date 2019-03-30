package com.gz.icms.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbSignature implements Serializable {
/*create by gz*/

	private int id;

	private String studentid;

	private int chapterid;

	private int period;

	private Date time;

	private int state;

	public TbSignature() {}

	@Override
	public String toString(){
		return "TbSignature [id=" + id + ",studentid=" + studentid + ",chapterid=" + chapterid + ",period=" + period + ",time=" + time + ",state=" + state + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public int getChapterid() {
		return chapterid;
	}

	public void setChapterid(int chapterid) {
		this.chapterid = chapterid;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}