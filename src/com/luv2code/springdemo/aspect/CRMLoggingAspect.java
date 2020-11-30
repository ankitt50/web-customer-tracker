package com.luv2code.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {

	
	@Pointcut("execution(* com.luv2code.springdemo.controller.*.*(..))")
	private void forControllerPackage() {}
	
	@Pointcut("execution(* com.luv2code.springdemo.service.*.*(..))")
	private void forServicePackage() {}
	
	@Pointcut("execution(* com.luv2code.springdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Pointcut("forDaoPackage() || forServicePackage() || forControllerPackage()")
	private void forAppFlow() {}
	
	
	@Before("forAppFlow()")
	public void before(JoinPoint theJP) {
		System.out.println("@Before : calling method is : " + theJP.getSignature().toShortString());
	}
	
	@AfterReturning(pointcut="forAppFlow()", returning="result")
	public void before(JoinPoint theJP, Object result) {
		System.out.println("@AfterReturning : calling method is : " + theJP.getSignature().toShortString());
		System.out.println("The returned value for this method is : " + result);
	}
	
}
