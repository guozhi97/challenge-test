import java.io.Serializable;
public class TbStudent implements Serializable {
/*create by gz*/

	private String id;

	private String name;

	private String password;

	private int age;

	private String sex;

	private String tell;

	private String major;

	private String academic;

	public TbStudent() {}

	@Override
	public String toString(){
		return "TbStudent [id=" + id + ",name=" + name + ",password=" + password + ",age=" + age + ",sex=" + sex + ",tell=" + tell + ",major=" + major + ",academic=" + academic + "]";
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
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age=age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex() {
		this.sex=sex;
	}
	public String getTell() {
		return tell;
	}
	public void setTell() {
		this.tell=tell;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor() {
		this.major=major;
	}
	public String getAcademic() {
		return academic;
	}
	public void setAcademic() {
		this.academic=academic;
	}
}