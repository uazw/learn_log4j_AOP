package org.stu.uaZ.Aspectj;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Date;

/**
 * Created by HeartJq on 2014/11/18.
 */
@Aspect
public class Time {

    public Logger logger = Logger.getLogger(Time.class);

    @Pointcut(value = "execution(* *(..)) && @annotation(org.stu.uaZ.annocation.UseTime)")
    public void point() {};

    @Around(value = "point()")
    public void timeThis(ProceedingJoinPoint pjp) throws Throwable {
        Long st = new Date().getTime();
        pjp.proceed();
        long et = new Date().getTime();
        logger.info(pjp.getSignature().getName()+ "\t" + String.valueOf(et - st));
    }
}
