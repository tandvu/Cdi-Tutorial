package com.example.myproject;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;

@Alternative
public class StandardTransport implements ATMTransport {
	public StandardTransport()
	{
		System.err.println("StandardTransport.constructor");
	}

	public void communicateWithBank(String dataPacket) {
		System.err.println("StandardTransport.communicatedWithBank.dataPacket: " + dataPacket);
	}

}
