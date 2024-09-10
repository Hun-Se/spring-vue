package lx.edu_eleventh.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {
	
	@Before("execution(* lx.edu_eleventh.controller.Addrbook*.*(..))")
//	@Before("bean(*)")
	public void beforeLog(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		System.out.println("beforeLog, method name=" + methodName);
	}
}
