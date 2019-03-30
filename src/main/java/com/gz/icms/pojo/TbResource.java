import java.io.Serializable;
public class TbResource implements Serializable {
/*create by gz*/

	private int id;

	private int chapterid;

	private String description;

	private String path;

	public TbResource() {}

	@Override
	public String toString(){
		return "TbResource [id=" + id + ",chapterid=" + chapterid + ",description=" + description + ",path=" + path + "]";
	}

	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public int getChapterid() {
		return chapterid;
	}
	public void setChapterid() {
		this.chapterid=chapterid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription() {
		this.description=description;
	}
	public String getPath() {
		return path;
	}
	public void setPath() {
		this.path=path;
	}
}