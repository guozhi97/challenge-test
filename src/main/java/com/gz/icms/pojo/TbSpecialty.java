import java.io.Serializable;
public class TbSpecialty implements Serializable {
/*create by gz*/

	private int id;

	private String header;

	private String name;

	private String explain;

	public TbSpecialty() {}

	@Override
	public String toString(){
		return "TbSpecialty [id=" + id + ",header=" + header + ",name=" + name + ",explain=" + explain + "]";
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
	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain() {
		this.explain=explain;
	}
}