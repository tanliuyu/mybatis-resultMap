package com.tly.spring.Processor;

import com.tly.spring.Bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBean {
    @Test
    public void testUserFactoryBean(){ //获取IOC容器
         ApplicationContext ac = new ClassPathXmlApplicationContext("spring-UserFactoryBean.xml");
         User user = (User) ac.getBean("user");
         System.out.println(user); }

}
