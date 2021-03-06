package com.Concurrent.bank;
/**
 * This class simulates a bank account 
 *
 */
public class Account {


	private  String hello;
        //添加了信息
	/**
	 * Balance of the bank account
	 */
	private double balance;

	/**
	 * Returns the balance of the account
	 * @return the balance of the account
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Establish the balance of the account
	 * @param balance the new balance of the account
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Add an import to the balance of the account
	 * @param amount the import to add to the balance of the account
	 */
	public  void addAmount(double amount) {
		String aa="00";
		synchronized (aa) {
			double tmp=balance;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tmp+=amount;
			balance=tmp;
		}
	
	}
	
	/**
	 * Subtract an import to the balance of the account
	 * @param amount the import to subtract to the balance of the account 
	 */
	public synchronized void subtractAmount(double amount) {
		double tmp=balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tmp-=amount;
		balance=tmp;
	}
	
}
