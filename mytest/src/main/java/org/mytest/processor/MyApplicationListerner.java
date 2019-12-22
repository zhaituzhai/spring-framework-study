package org.mytest.processor;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListerner implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("MyApplicationListerner 接收到了一个事件" + event);
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		ctx.publishEvent(new ApplicationEvent("手动发布了事件") {
			@Override
			public Object getSource() {
				return super.getSource();
			}
		});
		ctx.close();
	}
}
