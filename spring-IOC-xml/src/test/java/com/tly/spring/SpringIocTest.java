package com.tly.spring;

import com.tly.spring.Bean.Students;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest {
    @Test
    public void SpringIOCXml() {
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-ioc.xml");
        com.tly.spring.Bean.Students studentOne = ioc.getBean("studentOne", Students.class);
        System.out.println(studentOne);
    }
}
