
import import java.util.List;                    
import org.apache.ibatis.annotations.Delete;                    
import org.apache.ibatis.annotations.Insert;                    
import org.apache.ibatis.annotations.Select;                    
import org.apache.ibatis.annotations.Update;                    
import org.springframework.stereotype.Repository;

@Repository("administratorDao")
public interface AdministratorDao {
/*create by gz*/

	@Select("select * from administrator ")
	public List<TbAdministrator> selects() throws Exception;

	@Select("select * from administrator where null=#{null}")                      
	public TbAdministrator selectById(String null) throws Exception;

	@Delete("delete from administrator where null=#{null}")                      
	public Boolean delete(String null) throws Exception;

	@Insert("insert into administrator(id,name,password,email,tell) values(#{id},#{name},#{password},#{email},#{tell})")                     
	public Boolean insert(TbAdministrator administrator) throws Exception;

	@Update("update administrator set  id=#{id}, name=#{name}, password=#{password}, email=#{email}, tell=#{tell} where null=#{null}")                     
	public Boolean update(TbAdministrator administrator) throws Exception;

}