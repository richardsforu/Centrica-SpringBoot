package com;

public class Customer extends Bank {
	
	@Override
	public void openAccount() {
		this.custName="Praveen";
		System.out.println("--- "+custName+" is Opened Bank Account");
	}


	public void custInfo() {
		System.out.println("--- customer class custInfo method");
	}

}
