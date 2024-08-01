package com.bsm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bsm.sbeans.CheckingVotingElgibility;

@Configuration
@ComponentScan(basePackages = "com.bsm.sbeans")
public class AppConfig {
public CheckingVotingElgibility obj() {
return new 	CheckingVotingElgibility();
}
}
