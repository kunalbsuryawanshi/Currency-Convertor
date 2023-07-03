package org.program.domain;


public class USDollar extends Currency
{
	private double usd;
	
	@Override
	public String currencyConverter() 
	{
		this.usd = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to US_Dollar : "+this.usd+" USD";
	}
	
	@Override
	public void display()
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to US_Dollar : "+this.usd+" USD");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to US_Dollar : "+this.getExchangeRates()+" USD");
		System.out.println();
	}
}
