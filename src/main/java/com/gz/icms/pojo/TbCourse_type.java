import java.io.Serializable;
public class TbCourse_type implements Serializable {
/*create by gz*/

	private int id;

	private String typename;

	public TbCourse_type() {}

	@Override
	public String toString(){
		return "TbCourse_type [id=" + id + ",typename=" + typename + "]";
	}

	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename() {
		this.typename=typename;
	}
}