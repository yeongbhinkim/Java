package com.work;



public class Account  {
	private String ano;
	private String owner;
	private int balance;
	
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		
	}


	protected String getAno() {
		return ano;
	}



	protected void setAno(String ano) {
		this.ano = ano;
	}



	protected String getOwner() {
		return owner;
	}



	protected void setOwner(String owner) {
		this.owner = owner;
	}



	protected int getBalance() {
		return balance;
	}


	protected void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int anount) {
		this.balance+=anount;
	}

	

	
	
	public int withdraw(int anount) throws Exception{
		if(this.balance<anount) {
			throw new Exception("잔액이 모자랍니다.");
		}else {
			this.balance-=anount;
			return anount;
		}
	}
}
