package com.bsm.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements ICourier{
	public DTDC() {
		super();
	}
	@Override
	public String deliver(int old) {
		return "DTDC courier is ready to deliver "+old+"order number products";
	}
}
