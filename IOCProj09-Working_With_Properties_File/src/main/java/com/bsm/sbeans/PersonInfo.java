package com.bsm.sbeans;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("plnfo")
@PropertySource(value = "com/bsm/commons/Info.properties")
public class PersonInfo {
@Value("${per.id}")
private Integer pid;
@Value("${per.name}")
private String pname;
@Value("${per.addrs}")
private String addrs;
@Value("79965423")
private Long mobileNo;
@Override
public String toString() {
	return "PersonInfo [pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + ", mobileNo=" + mobileNo + "]";
}
}
