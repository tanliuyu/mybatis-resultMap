package com.tly.spring.test;

import com.tly.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;
import java.beans.AppletInitializer;

public class HelloWorldTest {
    @Test
    public void TestHelloWorld(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloworld = (HelloWorld) ioc.getBean("helloworld");
        helloworld.syeHello();
    }



}
