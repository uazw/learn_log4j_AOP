package org.stu.uaZ.config;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.stu.uaZ.bean.HelloWorld;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AppConfigTest {

    private ApplicationContext applicationContext;
    @Before
    public void setUp() throws Exception {
        applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void hello() throws Exception {
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.hello();
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }
}