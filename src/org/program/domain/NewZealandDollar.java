package org.program.domain;

public class NewZealandDollar extends Currency
{
	private double newZealandDollar;
	
	@Override
	public String currencyConverter()
	{
		this.newZealandDollar = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to New_Zealand_Dollar : "+this.newZealandDollar+" NZD";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to New_Zealand_Dollar : "+this.newZealandDollar+" NZD");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to New_Zealand_Dollar : "+this.getExchangeRates()+" NZD");
		System.out.println();
	}
}
