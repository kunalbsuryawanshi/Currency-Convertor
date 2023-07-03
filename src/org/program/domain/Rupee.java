package org.program.domain;

public class Rupee extends Currency
{
	private double rupee;
	
	@Override
	public String currencyConverter()
	{
		this.rupee = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+this.getCurrencyName()+" to Indian_Rupee : "+this.rupee+" INR";
	}
	
	@Override
	public void display()
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+this.getCurrencyName()+" to Indian_Rupee : "+this.rupee+" INR");
		System.out.println("ExchangeRate : 1 "+this.getCurrencyName()+" to Indian_Rupee : "+this.getExchangeRates()+" INR");
		System.out.println();
	}
	
}
