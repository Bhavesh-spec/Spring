package com.nt.client;

import java.util.Locale;
import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.config.AppConfig;
public class Spring_l18nTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter language code::");
	String lang = sc.next();
	System.out.println("Enter country code::");
	String country = sc.next();
	Locale local = new Locale(lang, country);
	String msg1  = ctx.getMessage("welcome.msg",new Object[] {"bsm"}, local);
	String msg2  = ctx.getMessage("goodbye.msg",new Object[] {}, local);
	String msg3  = ctx.getMessage("application.title",new Object[] {}, local);
	String msg4  = ctx.getMessage("wish.message",new Object[] {}, local);
	System.out.println(msg1+"......."+msg2+"........"+msg3+"........."+msg4);
	sc.close();
ctx.close();
}
}
