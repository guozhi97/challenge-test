
import import java.util.List;                    
import org.apache.ibatis.annotations.Delete;                    
import org.apache.ibatis.annotations.Insert;                    
import org.apache.ibatis.annotations.Select;                    
import org.apache.ibatis.annotations.Update;                    
import org.springframework.stereotype.Repository;

@Repository("train_plan_detial_tableDao")
public interface Train_plan_detial_tableDao {
/*create by gz*/

	@Select("select * from train_plan_detial_table ")
	public List<TbTrain_plan_detial_table> selects() throws Exception;

	@Select("select * from train_plan_detial_table where id=#{id}")                      
	public TbTrain_plan_detial_table selectById(int id) throws Exception;

	@Delete("delete from train_plan_detial_table where id=#{id}")                      
	public Boolean delete(int id) throws Exception;

	@Insert("insert into train_plan_detial_table(id,coursename,credit,term,version,trainplanid) values(#{id},#{coursename},#{credit},#{term},#{version},#{trainplanid})")                     
	public Boolean insert(TbTrain_plan_detial_table train_plan_detial_table) throws Exception;

	@Update("update train_plan_detial_table set  id=#{id}, coursename=#{coursename}, credit=#{credit}, term=#{term}, version=#{version}, trainplanid=#{trainplanid} where id=#{id}")                     
	public Boolean update(TbTrain_plan_detial_table train_plan_detial_table) throws Exception;

}