package com.tly.spring;

import com.alibaba.druid.pool.DruidDataSource;
import com.tly.spring.Bean.Clazz;
import com.tly.spring.Bean.Students;
import com.tly.spring.Bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

public class SpringTestIOC {

    @Test
    public void SpringXml(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-ioc.xml");
        Students students = ioc.getBean("studentOne", Students.class);
        System.out.println(students);

    }
    @Test
    public void SpringClazz(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-ioc.xml");
        Students students = ioc.getBean("studentFour", Students.class);
        System.out.println(students);

    }@Test
    public void SpringClazztwo(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-ioc.xml");
        Clazz clazz = ioc.getBean("clazzTwo", Clazz.class);
        System.out.println(clazz);

    }
    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource druidDataSource = ac.getBean(DruidDataSource.class);
        Connection connection = druidDataSource.getConnection();
        System.out.println(connection);
    }
    @Test
    public void testBeanScope() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring- scope.xml");
        User user1 = ac.getBean(User.class);
        User user2 = ac.getBean(User.class);
        System.out.println(user1==user2);
    }
}
