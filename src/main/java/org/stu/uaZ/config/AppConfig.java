package org.stu.uaZ.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.stu.uaZ.Aspectj.Time;
import org.stu.uaZ.bean.HelloWorld;

/**
 * Created by HeartJq on 2014/11/18.
 */
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {
        "org.stu.uaZ.Controller.*",
        "org.stu.uaZ.Aspectj.*"
})
@Configuration
public class AppConfig {
    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
    @Bean
    public Time time() {
        return new Time();
    }
}
