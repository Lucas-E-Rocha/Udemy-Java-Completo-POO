package exercicios15.Entities;

import exercicios15.Entities.Exceptions.BalanceException;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;

	public Account(int number, String holder, double balance, double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws BalanceException {
		if (balance >= amount) {
			if (amount <= withdrawLimit) {
				balance -= amount;
			} else
				throw new BalanceException("Withdraw error: The amount exceeds witdraw limit");
		} else
			throw new BalanceException("Withdraw error: Not enough balance");
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

}
