import com.tly.aop.spring.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    @Test
    public void AopByAnnotation(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-aop-annotation.xml");
        Calculator calculator =ioc.getBean(Calculator.class);
        calculator.add(10,2);
    }
}
