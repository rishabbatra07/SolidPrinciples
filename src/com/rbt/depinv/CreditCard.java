package com.rbt.depinv;

public class CreditCard implements BankCard{
	public void completeTransaction(long amount){
        System.out.println("payment using Credit card");
    }
}
