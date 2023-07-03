package org.program.domain;

public class BritishPound extends Currency
{
	double pound;
	
	@Override
	public String currencyConverter()
	{
		this.pound = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to British_Pound : "+this.pound+" GBP";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to British_Pound : "+this.pound+" GBP");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to British_Pound : "+this.getExchangeRates()+" GBP");
		System.out.println();
	}
}
