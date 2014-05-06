package com.example.myproject;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.inject.Named;

@Named("atm")
public class AutomatedTellerMachineImpl implements AutomatedTellerMachine {
	//This will call TransportFactory @Produce ATMTransport
	@Inject
	private ATMTransport transport;
	
	public void deposit(BigDecimal bd) {
		System.err.println("AutomatedTellerMachineImpl.deposit.amount: " + bd);
		System.err.println("AutomatedTellerMachineImpl.transport.communicatedWithBank");
		System.err.println("AutomatedTellerMachineImpl.@Default on whatever class implements ATMTransport will be called");
		transport.communicateWithBank("AutomatedTellerMachineImpl.deposit.dataPackage");
	}

	public void withdraw(BigDecimal bd) {
		System.err.println("AutomatedTellerMachineImpl.withdraw.amount: " + bd);
		transport.communicateWithBank("AutomatedTellerMachineImpl.withdraw.dataPackage");
	}

}
