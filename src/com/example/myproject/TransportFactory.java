package com.example.myproject;

import javax.enterprise.inject.Produces;

public class TransportFactory 
{
	@Produces
	ATMTransport createTransport(){
		System.err.println("TransportFactory.createTransport");
		return new StandardTransport();
	}
}
