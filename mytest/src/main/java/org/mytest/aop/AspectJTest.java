package org.mytest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Aspect
@EnableAspectJAutoProxy
public class AspectJTest {

	@Pointcut("execution(* *.test(..))")
	public void test() {

	}

	@Before("test()")
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@After("test()")
	public void afterTest() {
		System.out.println("afterTest");
	}

	@Around("test()")
	public Object arountTest(ProceedingJoinPoint p) {
		System.out.println("before1");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("after1");
		return o;
	}

	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("beanAspect.xml");
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		bean.test();
	}
}
