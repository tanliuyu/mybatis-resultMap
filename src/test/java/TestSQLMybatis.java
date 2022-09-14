import com.tly.result.mapper.DeptMapper;
import com.tly.result.mapper.EmpMapper;
import com.tly.result.pojo.Dept;
import com.tly.result.pojo.Emp;
import com.tly.result.utlis.SqlSessionUtils;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSQLMybatis {
    @Test
    public void  getAllEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp=new Emp(null,"王瑜","",22,null);
        List<Emp> list = mapper.getAllEmp(emp);
        list.forEach(System.out::println);

    }
    @Test
    public void  getEmpAndDeptId(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptId(1);
        System.out.println(emp);
    }
    @Test
    public void  getEmpAndDeptByDeptId(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        List<Dept> dept = mapper.getEmpAndDeptByDeptId(2);
        System.out.println(dept);
    }


}
