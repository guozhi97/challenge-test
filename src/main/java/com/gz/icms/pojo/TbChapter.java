import java.io.Serializable;
public class TbChapter implements Serializable {
/*create by gz*/

	private int id;

	private int classid;

	private String title;

	private text content;

	private datetime time;

	public TbChapter() {}

	@Override
	public String toString(){
		return "TbChapter [id=" + id + ",classid=" + classid + ",title=" + title + ",content=" + content + ",time=" + time + "]";
	}

	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid() {
		this.classid=classid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle() {
		this.title=title;
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