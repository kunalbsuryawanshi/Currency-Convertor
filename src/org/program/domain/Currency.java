package org.program.domain;


public class Currency 
{
	protected String currencyName;
	protected double exchangeRates;
	protected double amount;

	public String getCurrencyName() {
		return currencyName;
	}


	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}


	public double getExchangeRates() {
		return exchangeRates;
	}


	public void setExchangeRates(double exchangeRates) {
		this.exchangeRates = exchangeRates;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String currencyConverter()
	{
		return currencyName;
		
	}
	public void display()
	{
		
	}
	
}
