package org.mytest.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
public class MainConfig {

	@Bean
	public Calculate calculate() {
		return new TulingCalculate();
	}

	@Bean
	public TulingLogAspect tulingLogAspect() {
		return new TulingLogAspect();
	}
}