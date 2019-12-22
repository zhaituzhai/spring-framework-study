package org.mytest.ioc.parsebeandefinition;

import org.springframework.context.annotation.*;

/**
 * Created by smlz on 2019/7/15.
 */
@Configuration
@Import(value = {CompentC.class,TulingImportSelect.class,TulingImportBeanfinitionRegister.class})
@ComponentScan(basePackages = {"org.mytest.ioc.parsebeandefinition"})
public class MainConfig {

	@Bean
	public CompentD compentD() {
		return new CompentD();
	}

	@Bean
	public CompentC compentC() {
		return new CompentC();
	}
}
