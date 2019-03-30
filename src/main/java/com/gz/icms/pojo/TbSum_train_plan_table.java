import java.io.Serializable;
public class TbSum_train_plan_table implements Serializable {
/*create by gz*/

	private int id;

	private String header;

	private String auditor;

	private int trainobjectiveid;

	private date maketime;

	public TbSum_train_plan_table() {}

	@Override
	public String toString(){
		return "TbSum_train_plan_table [id=" + id + ",header=" + header + ",auditor=" + auditor + ",trainobjectiveid=" + trainobjectiveid + ",maketime=" + maketime + "]";
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
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor() {
		this.auditor=auditor;
	}
	public int getTrainobjectiveid() {
		return trainobjectiveid;
	}
	public void setTrainobjectiveid() {
		this.trainobjectiveid=trainobjectiveid;
	}
	public date getMaketime() {
		return maketime;
	}
	public void setMaketime() {
		this.maketime=maketime;
	}
}