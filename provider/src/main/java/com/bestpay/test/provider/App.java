package com.bestpay.test.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by perdonare on 2015/12/1.
 */
public class App {


    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-provider.xml"});
        context.start();
        System.out.println("start dubbo service successfully");
        System.out.println("press any key to interrupt! ");
        System.in.read();
    }
}
