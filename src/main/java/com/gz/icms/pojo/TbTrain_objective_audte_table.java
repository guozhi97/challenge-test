import java.io.Serializable;
public class TbTrain_objective_audte_table implements Serializable {
/*create by gz*/

	private int id;

	private String auditor;

	private int trainobjectiveid;

	private String outcome;

	private date time;

	public TbTrain_objective_audte_table() {}

	@Override
	public String toString(){
		return "TbTrain_objective_audte_table [id=" + id + ",auditor=" + auditor + ",trainobjectiveid=" + trainobjectiveid + ",outcome=" + outcome + ",time=" + time + "]";
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
	public int getTrainobjectiveid() {
		return trainobjectiveid;
	}
	public void setTrainobjectiveid() {
		this.trainobjectiveid=trainobjectiveid;
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