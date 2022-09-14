package com.tly.spring;

import com.tly.spring.Controller.UserController;
import com.tly.spring.Dao.UserDao;
import com.tly.spring.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAutowireByAnnotation {

    @Test
    public void AutowireByAnnotation() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserController userController = ac.getBean(UserController.class);
//        System.out.println(userController);
        UserService userService = ac.getBean(UserService.class);
        System.out.println(userService);
        UserDao userDao = ac.getBean(UserDao.class);
        System.out.println(userDao); }
}
