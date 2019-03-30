import java.io.Serializable;
public class TbStudent_course implements Serializable {
/*create by gz*/

	private int id;

	private String studentid;

	private int classid;

	public TbStudent_course() {}

	@Override
	public String toString(){
		return "TbStudent_course [id=" + id + ",studentid=" + studentid + ",classid=" + classid + "]";
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
	public int getClassid() {
		return classid;
	}
	public void setClassid() {
		this.classid=classid;
	}
}