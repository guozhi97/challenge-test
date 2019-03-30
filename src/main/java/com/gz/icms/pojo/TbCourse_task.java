package com.gz.icms.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbCourse_task implements Serializable {
/*create by gz*/

	private int id;

	private int chapterid;

	private String content;

	private Date time;

	public TbCourse_task() {}

	@Override
	public String toString(){
		return "TbCourse_task [id=" + id + ",chapterid=" + chapterid + ",content=" + content + ",time=" + time + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getChapterid() {
		return chapterid;
	}

	public void setChapterid(int chapterid) {
		this.chapterid = chapterid;
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