package com.bsm.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bsm.config.AppConfig;
import com.bsm.sbeans.PersonInfo;

public class PropertiesFileTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	PersonInfo bean = ctx.getBean("plnfo",PersonInfo.class);
	System.out.println(bean);
ctx.close();	
}
}
