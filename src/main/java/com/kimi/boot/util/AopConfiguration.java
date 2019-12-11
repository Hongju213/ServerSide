package com.kimi.boot.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopConfiguration {
    Logger logger =  LoggerFactory.getLogger(AopConfiguration.class);
    
    //BookService의 모든 메서드
    @Around("execution(public * com.kimi..*Impl.*(..))")
    public Object logging(ProceedingJoinPoint pjp) throws Throwable {
        
    	logger.info("start - " + pjp.getSignature().getDeclaringTypeName() + " / " + pjp.getSignature().getName());
        Object result = pjp.proceed();
        logger.info("finished - " + pjp.getSignature().getDeclaringTypeName() + " / " + pjp.getSignature().getName());
        System.out.println("AOP적용됨");
        return result;
    }
}