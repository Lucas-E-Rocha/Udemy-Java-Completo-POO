package exercicios7.entities;

public class ContaBancaria {
	private final int accountNumber;
	private String accountHolder;
	private double accountbalance;

	public ContaBancaria(int idConta,String nomeTitular,double depositoInicial) {
		this.accountNumber = idConta;
		this.accountHolder = nomeTitular;
		deposit(depositoInicial);
	}
	
	public ContaBancaria(int idConta,String nomeTitular) {
		this.accountNumber = idConta;
		this.accountHolder = nomeTitular;
		accountbalance = 0;
	}
	
	public void withdraw(double value) {
		accountbalance -= value+5;
	}
	
	public void deposit(double value) {
		accountbalance += value;
	}
	
	public String toString() {
		return "Account "+accountNumber+", Holder: "+accountHolder+", Balance: $ "+String.format("%.2f", accountbalance);
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return accountbalance;
	}
	
}
