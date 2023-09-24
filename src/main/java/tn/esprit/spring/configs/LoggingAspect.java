package tn.esprit.spring.configs;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Pointcut("execution (* tn.esprit.spring.services.*.*(..))")
    public void methodCall() {}

    @Before("methodCall()")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @After("methodCall() ")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Out of method " + name + " : ");
    }
    @AfterReturning("methodCall()")
    public void logMethodExitReturn(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("AfterReturning of method " + name + " : ");
    }

    @AfterThrowing(pointcut="methodCall()", throwing="nameEx")
    public void logMethodExitThrowing(JoinPoint joinPoint, Throwable nameEx) {
        String name = joinPoint.getSignature().getName();
        log.info("AfterThrowing of method " + name + " : ");
        log.error(nameEx.getMessage());
    }
}
