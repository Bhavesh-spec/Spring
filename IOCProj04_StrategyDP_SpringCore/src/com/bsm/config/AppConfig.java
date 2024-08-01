package com.bsm.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bsm.sbeans.BlueDart;
import com.bsm.sbeans.DTDC;
import com.bsm.sbeans.Flipkart;
import com.bsm.sbeans.ICourier;
@Configuration
@ComponentScan(basePackages = "com.bsm.sbeans")
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
