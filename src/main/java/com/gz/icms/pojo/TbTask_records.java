import java.io.Serializable;
public class TbTask_records implements Serializable {
/*create by gz*/

	private int id;

	private int taskid;

	private String studentid;

	private datetime finishedtime;

	public TbTask_records() {}

	@Override
	public String toString(){
		return "TbTask_records [id=" + id + ",taskid=" + taskid + ",studentid=" + studentid + ",finishedtime=" + finishedtime + "]";
	}

	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid() {
		this.taskid=taskid;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid() {
		this.studentid=studentid;
	}
	public datetime getFinishedtime() {
		return finishedtime;
	}
	public void setFinishedtime() {
		this.finishedtime=finishedtime;
	}
}