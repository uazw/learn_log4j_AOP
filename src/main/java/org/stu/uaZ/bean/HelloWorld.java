package org.stu.uaZ.bean;

import org.stu.uaZ.annocation.UseTime;

/**
 * Created by HeartJq on 2014/11/17.
 */
public class HelloWorld {

    public static void main(String[] args) {
        new HelloWorld().hello();
    }

    @UseTime
    public void hello() {
        System.out.println("uaZ");
    }
}
