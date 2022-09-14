package com.tly.spring;

import com.tly.spring.Controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
    @Test
    public void testAutoWireByXML(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-contorall.xml");
        UserController userController = ac.getBean(UserController.class);
        userController.saveUser();
    }
}
