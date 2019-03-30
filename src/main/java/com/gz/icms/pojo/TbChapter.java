package com.gz.icms.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbChapter implements Serializable {
/*create by gz*/

	private int id;

	private int classid;

	private String title;

	private String content;

	private Date time;

	public TbChapter() {}

	@Override
	public String toString(){
		return "TbChapter [id=" + id + ",classid=" + classid + ",title=" + title + ",content=" + content + ",time=" + time + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}