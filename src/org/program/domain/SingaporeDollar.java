package org.program.domain;

public class SingaporeDollar extends Currency
{
	double singaporeDollar;
	
	@Override
	public String currencyConverter() 
	{
		this.singaporeDollar = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Singapore_Dollar : "+this.singaporeDollar+" SGD";
	}
	
	@Override
	public void display()
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Singapore_Dollar : "+this.singaporeDollar+" SGD");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Singapore_Dollar : "+this.getExchangeRates()+" SGD");
		System.out.println();
	}
}
