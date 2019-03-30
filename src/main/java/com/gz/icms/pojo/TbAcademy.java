import java.io.Serializable;
public class TbAcademy implements Serializable {
/*create by gz*/

	private int id;

	private String name;

	private String school;

	private String auditor;

	public TbAcademy() {}

	@Override
	public String toString(){
		return "TbAcademy [id=" + id + ",name=" + name + ",school=" + school + ",auditor=" + auditor + "]";
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
	public String getSchool() {
		return school;
	}
	public void setSchool() {
		this.school=school;
	}
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor() {
		this.auditor=auditor;
	}
}