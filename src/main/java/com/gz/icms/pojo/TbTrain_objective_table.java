import java.io.Serializable;
public class TbTrain_objective_table implements Serializable {
/*create by gz*/

	private int id;

	private String header;

	private int specialtyid;

	private text content;

	private String version;

	private String auditor;

	public TbTrain_objective_table() {}

	@Override
	public String toString(){
		return "TbTrain_objective_table [id=" + id + ",header=" + header + ",specialtyid=" + specialtyid + ",content=" + content + ",version=" + version + ",auditor=" + auditor + "]";
	}

	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader() {
		this.header=header;
	}
	public int getSpecialtyid() {
		return specialtyid;
	}
	public void setSpecialtyid() {
		this.specialtyid=specialtyid;
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
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor() {
		this.auditor=auditor;
	}
}