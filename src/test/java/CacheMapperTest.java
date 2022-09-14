import com.tly.result.mapper.CacheMapper;
import com.tly.result.pojo.Emp;
import com.tly.result.utlis.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CacheMapperTest {
    @Test
    public void getEmpIdTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp = mapper.getEmpId(1);
        System.out.println(emp);
    }
}
