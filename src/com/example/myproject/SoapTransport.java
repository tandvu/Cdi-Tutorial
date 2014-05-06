package com.example.myproject;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;

@Default
public class SoapTransport implements ATMTransport {
	public SoapTransport()
	{
		System.err.println("SoapTransport.constructor");
	}

	@Override
	public void communicateWithBank(String dataPacket) {
		System.err.println("SoapTransport.communicatedWithBank.dataPacket: " + dataPacket);
	}

}
