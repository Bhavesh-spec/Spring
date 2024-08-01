package com.bsm.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
@Component("voter")
@PropertySource("com/bsm/commons/Info.properties")
public class CheckingVotingElgibility {
	
@Value("${voter.id}")
private Integer id;

@Value("${voter.name}")
private String name;

@Value("${voter.age}")
private Integer age;

private Date verfiedOn;
public CheckingVotingElgibility() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("CheckingVotingElgibility.CheckingVotingElgibility()");
}
@PostConstruct
public void myInit() {
	System.out.println("CheckingVotingElgibility.myInit()");
	verfiedOn = new Date();
	if(name==null||age<=0) {
		throw new IllegalArgumentException("set corrent values to name,age properties");
	}
}
public String checkElgibility() {
	System.out.println("CheckingVotingElgibility.checkElgibility()");
	if(age<18) {
		return "Mr/Miss/"+name+" u r  age is "+ age+" & u r not elgible for voting -----> verfied on ::"+verfiedOn;
	}else {
		return "Mr/Miss/"+name+" u r age is "+age+" & u r elgible for voting -----> verfied on ::"+verfiedOn;
	}
}
@PreDestroy
public void myDestroy() {
	System.out.println("CheckingVotingElgibility.myDestroy()");
	name=null;
	age=null;
	verfiedOn=null;
	id=null;
}
}
