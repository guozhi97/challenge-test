import java.io.Serializable;
public class TbTrain_plan_audte_table implements Serializable {
/*create by gz*/

	private int id;

	private String auditor;

	private int trainplanid;

	private String outcome;

	private date time;

	public TbTrain_plan_audte_table() {}

	@Override
	public String toString(){
		return "TbTrain_plan_audte_table [id=" + id + ",auditor=" + auditor + ",trainplanid=" + trainplanid + ",outcome=" + outcome + ",time=" + time + "]";
	}

	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor() {
		this.auditor=auditor;
	}
	public int getTrainplanid() {
		return trainplanid;
	}
	public void setTrainplanid() {
		this.trainplanid=trainplanid;
	}
	public String getOutcome() {
		return outcome;
	}
	public void setOutcome() {
		this.outcome=outcome;
	}
	public date getTime() {
		return time;
	}
	public void setTime() {
		this.time=time;
	}
}