package com.bsm.sbeans;
import org.springframework.stereotype.Component;
@Component("bDart")
public class BlueDart implements ICourier{
	
	public BlueDart() {
		super();
		System.out.println("BlueDart ::0-param constructor");		
	}
	@Override
	public String deliver(int oid) {
		return "BlueDart courier is ready to deliver"+oid+"order number products";
	}
}
