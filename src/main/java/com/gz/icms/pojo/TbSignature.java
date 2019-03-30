import java.io.Serializable;
public class TbSignature implements Serializable {
/*create by gz*/

	private int id;

	private String studentid;

	private int chapterid;

	private int period;

	private datetime time;

	private int state;

	public TbSignature() {}

	@Override
	public String toString(){
		return "TbSignature [id=" + id + ",studentid=" + studentid + ",chapterid=" + chapterid + ",period=" + period + ",time=" + time + ",state=" + state + "]";
	}

	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid() {
		this.studentid=studentid;
	}
	public int getChapterid() {
		return chapterid;
	}
	public void setChapterid() {
		this.chapterid=chapterid;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod() {
		this.period=period;
	}
	public datetime getTime() {
		return time;
	}
	public void setTime() {
		this.time=time;
	}
	public int getState() {
		return state;
	}
	public void setState() {
		this.state=state;
	}
}