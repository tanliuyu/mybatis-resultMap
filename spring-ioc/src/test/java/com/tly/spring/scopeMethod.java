package com.tly.spring;

import com.tly.spring.Bean.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class scopeMethod {
    @Test
    public void ScopeMethod(){
        ClassPathXmlApplicationContext ioc =new ClassPathXmlApplicationContext("spring-scope.xml");
        User user=ioc.getBean(User.class);
        System.out.println(user);
        ioc.close();

    }

}
