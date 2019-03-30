import java.io.Serializable;
public class TbCourse_task implements Serializable {
/*create by gz*/

	private int id;

	private int chapterid;

	private text content;

	private datetime time;

	public TbCourse_task() {}

	@Override
	public String toString(){
		return "TbCourse_task [id=" + id + ",chapterid=" + chapterid + ",content=" + content + ",time=" + time + "]";
	}

	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public int getChapterid() {
		return chapterid;
	}
	public void setChapterid() {
		this.chapterid=chapterid;
	}
	public text getContent() {
		return content;
	}
	public void setContent() {
		this.content=content;
	}
	public datetime getTime() {
		return time;
	}
	public void setTime() {
		this.time=time;
	}
}