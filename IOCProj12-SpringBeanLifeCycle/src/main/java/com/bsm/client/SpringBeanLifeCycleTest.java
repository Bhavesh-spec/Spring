package com.bsm.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bsm.config.AppConfig;
import com.bsm.sbeans.CheckingVotingElgibility;

public class SpringBeanLifeCycleTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	CheckingVotingElgibility voter = ctx.getBean("voter",CheckingVotingElgibility.class);
	try {
		String result = voter.checkElgibility();
		System.out.println(result);
	} catch (Exception e) {
		e.printStackTrace();
	}
	ctx.close();
}
}
