package org.mytest;

import org.junit.Test;
import org.mytest.aop.Car;
import org.mytest.aop.MyTestBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {
    @Test
    public void testSimpleLoas() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean bean = (MyTestBean) beanFactory.getBean("myTestBean");
        System.out.println(bean);
    }
    @Test
    public void testSimpleCar() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        Car bean = (Car) beanFactory.getBean("car");
        System.out.println("" + bean.getBrand() + " " + bean.getMaxSpeed() + " " + bean.getPrice());
    }

	@Test
	public void testSimpleContext() {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		MyTestBean bean = (MyTestBean) beanFactory.getBean("myTestBean");
		System.out.println(bean.getTestStr());
	}

	@Test
	public void testAspectJTest(){
		ApplicationContext bf = new ClassPathXmlApplicationContext("beanAspect.xml");
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		bean.test();
	}

	@Test
	public void testAnnoTest(){
    	BeanFactory beanFactory = new AnnotationConfigApplicationContext(MyTestBean.class);
    	beanFactory.getBean("test");
	}
}
