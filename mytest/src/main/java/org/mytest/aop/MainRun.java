package org.mytest.aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainRun {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		Calculate calculate = (Calculate) ctx.getBean("calculate");


		//int retVal = calculate.mod(2,4);
		calculate.div(6, 2);
	}

}
