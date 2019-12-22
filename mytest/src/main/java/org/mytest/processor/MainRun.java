package org.mytest.processor;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainRun {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		MyTestBean bean = (MyTestBean) ctx.getBean("myTestBean");
		bean.test();

	}

}
