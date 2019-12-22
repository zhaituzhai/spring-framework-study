package org.mytest.transaction;

import org.mytest.transaction.config.MainConfig;
import org.mytest.transaction.service.PayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by smlz on 2019/6/17.
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        PayService payService = (PayService) context.getBean("payServiceImpl");
        payService.pay("123456789",10);

    }
}
