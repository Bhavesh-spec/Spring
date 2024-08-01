package com.bsm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.bsm.comps.BlueDart;
import com.bsm.comps.DTDC;
import com.bsm.comps.Flipkart;
import com.bsm.comps.ICourier;


@Configuration
@ComponentScan(basePackages = "com.bsm.comps")
@ImportResource("com/bsm/cfgs/applicationContext.xml")
public class AppConfig {
	   public static Flipkart getInstance(String courierType) {
		   ICourier courier =null;
		   if(courierType.equalsIgnoreCase("dtdc")) {
			   courier=new DTDC();
		   }else if(courierType.equalsIgnoreCase("blueDart")) {
			   courier=new BlueDart();
		   }else {
			   new IllegalArgumentException("Invalid type");
		   }
		   return  new Flipkart();
	   }
}
