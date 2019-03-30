import java.io.Serializable;
public class TbPerfession_certify_table implements Serializable {
/*create by gz*/

	private int id;

	private text content;

	private String version;

	private String specialtyname;

	public TbPerfession_certify_table() {}

	@Override
	public String toString(){
		return "TbPerfession_certify_table [id=" + id + ",content=" + content + ",version=" + version + ",specialtyname=" + specialtyname + "]";
	}

	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public text getContent() {
		return content;
	}
	public void setContent() {
		this.content=content;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion() {
		this.version=version;
	}
	public String getSpecialtyname() {
		return specialtyname;
	}
	public void setSpecialtyname() {
		this.specialtyname=specialtyname;
	}
}