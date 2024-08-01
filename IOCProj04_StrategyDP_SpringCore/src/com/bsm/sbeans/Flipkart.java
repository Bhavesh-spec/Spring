package com.bsm.sbeans;
import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {
	@Autowired
	@Qualifier("dtdc")
private ICourier courier;
public Flipkart() {
	super();
	System.out.println("Flipkart.0 parmFlipkart()");
}
public String shopping(String items[],double prices[]) {
	System.out.println("Flipkart.shopping()");
	double billAmt=0.0;
	for(double p:prices) {
		billAmt=billAmt+p;
	}
	int oid= new Random().nextInt(100000);
	String msg = courier.deliver(oid);
	return Arrays.toString(items)+"are shoppedd having bill amount::"+billAmt+"--->"+msg;
}
}
