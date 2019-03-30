import java.io.Serializable;
public class TbCourse implements Serializable {
/*create by gz*/

	private int id;

	private String name;

	private int period;

	private int credit;

	private int type;

	private String header;

	public TbCourse() {}

	@Override
	public String toString(){
		return "TbCourse [id=" + id + ",name=" + name + ",period=" + period + ",credit=" + credit + ",type=" + type + ",header=" + header + "]";
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
	public int getPeriod() {
		return period;
	}
	public void setPeriod() {
		this.period=period;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit() {
		this.credit=credit;
	}
	public int getType() {
		return type;
	}
	public void setType() {
		this.type=type;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader() {
		this.header=header;
	}
}