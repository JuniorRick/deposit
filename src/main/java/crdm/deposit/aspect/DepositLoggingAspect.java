package crdm.deposit.aspect;
//package com.crdm.deposit.aspect;
//
//import java.util.logging.Logger;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class DepositLoggingAspect {
//	private static Logger logger = Logger.getLogger(DepositLoggingAspect.class.getName());
//	
//	@Pointcut("execution(* crdm.deposit.controller.*.*(..))")
//	private void forControllerPackage() {
//		
//	}
//	
//	@Pointcut("execution(* crdm.deposit.service.*.*(..))")
//	private void forServicePackage() {
//		
//	}
//	
//	@Pointcut("execution(* crdm.deposit.dao.*.*(..))")
//	private void forDaoPackage() {
//		
//	}
//	
//	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
//	public void forAppFlow() {}
//	
//	@Before("forAppFlow()")
//	public void before(JoinPoint joinPoint) {
//		
//		String methodName = joinPoint.getSignature().toShortString();
//		logger.info(" ===> Before: " + methodName);
//		
//		Integer argsLength  = joinPoint.getArgs().length;
//		logger.info("===> arguments lenght: " + argsLength);
//	}
//	
//	@AfterReturning(pointcut="forAppFlow()", returning="result")
//	public void after(JoinPoint joinPoint, Object result) {
//		
//		String methodName = joinPoint.getSignature().toShortString();
//		logger.info(" ===> Before: " + methodName);
//		
//		logger.info("===> returned: " + result);
//	}
//}
