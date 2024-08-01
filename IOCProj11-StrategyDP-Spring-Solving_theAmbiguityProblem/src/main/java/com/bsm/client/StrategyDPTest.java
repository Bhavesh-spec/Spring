package com.bsm.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bsm.comps.Flipkart;
import com.bsm.config.AppConfig;


public class StrategyDPTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =new  AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart fpkt = ctx.getBean("fpkt",Flipkart.class);
		
		String resultMsg=fpkt.shopping(new String[] {"shirt","trouser"}, new double[] {90000.0,50000.0});
	    System.out.println(resultMsg);
	    ctx.close();
	}
}
