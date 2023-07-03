package org.program.domain;

public class Euro extends Currency
{
	double euro;
	
	@Override
	public String currencyConverter()
	{
		this.euro = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Euro : "+this.euro+" EUR";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Euro : "+this.euro+" EUR");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Euro : "+this.getExchangeRates()+" EUR");
		System.out.println();
	}
}
