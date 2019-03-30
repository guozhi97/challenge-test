import java.io.Serializable;
public class TbClass implements Serializable {
/*create by gz*/

	private int id;

	private String name;

	private String teacherid;

	private int courseid;

	public TbClass() {}

	@Override
	public String toString(){
		return "TbClass [id=" + id + ",name=" + name + ",teacherid=" + teacherid + ",courseid=" + courseid + "]";
	}

	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
	}
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid() {
		this.teacherid=teacherid;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid() {
		this.courseid=courseid;
	}
}