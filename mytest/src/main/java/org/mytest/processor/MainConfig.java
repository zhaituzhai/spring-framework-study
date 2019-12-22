package org.mytest.processor;

import org.mytest.aop.Calculate;
import org.mytest.aop.TulingCalculate;
import org.mytest.aop.TulingLogAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.mytest.processor"})
public class MainConfig {

}