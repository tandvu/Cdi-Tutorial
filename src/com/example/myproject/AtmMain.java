package com.example.myproject;

import java.math.BigDecimal;

import org.cdisource.beancontainer.BeanContainer;
import org.cdisource.beancontainer.BeanContainerManager;

public class AtmMain {
		
	static BeanContainer beanContainer =  BeanContainerManager.getInstance();
	
	public static void main(String[] args) {
		System.err.println("AtmMain.main.getBean('atm') which will call AutomatedTellerMachineImpl.");
		System.err.println("AtmMain.AutomatedTellerMachineImpl.@Inject is called");
		System.err.println("AtmMain.When @Inject is called, whichever class with @Default that implements ATMTransport is called");
		System.err.println("AtmMain.(Unless somewhere in the program: @Produces ATMTransport method that returns either standard or soap transport class)");
		
		AutomatedTellerMachine atm = (AutomatedTellerMachine) beanContainer
				.getBeanByName("atm");
		
		atm.deposit(new BigDecimal("1.00"));
	}

}
