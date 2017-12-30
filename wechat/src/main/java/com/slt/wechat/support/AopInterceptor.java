package com.slt.wechat.support;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopInterceptor {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Pointcut("execution(* com.muou.common.controller.*.*(..))")
	public void classPointCut(){};
	
	@Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public void annotationPointCut(){};
	
	@Around("annotationPointCut()")
	public Object interceptor(ProceedingJoinPoint pjp) throws Throwable{
		logger.info("瞎搞 aop配置====");
		Object obj = pjp.proceed();
		return obj;
	}
}
