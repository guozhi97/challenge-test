import java.io.Serializable;
public class TbTeacher implements Serializable {
/*create by gz*/

	private String id;

	private String name;

	private String password;

	private String email;

	private String academic;

	private String tell;

	public TbTeacher() {}

	@Override
	public String toString(){
		return "TbTeacher [id=" + id + ",name=" + name + ",password=" + password + ",email=" + email + ",academic=" + academic + ",tell=" + tell + "]";
	}

	public String getId() {
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
	public String getPassword() {
		return password;
	}
	public void setPassword() {
		this.password=password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail() {
		this.email=email;
	}
	public String getAcademic() {
		return academic;
	}
	public void setAcademic() {
		this.academic=academic;
	}
	public String getTell() {
		return tell;
	}
	public void setTell() {
		this.tell=tell;
	}
}