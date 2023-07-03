package org.program.domain;

public class GibraltorPound extends Currency
{
	double gibraltorPound;
	
	@Override
	public String currencyConverter()
	{
		this.gibraltorPound = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Gibraltor_Pound : "+this.gibraltorPound+" GIP";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Gibraltor_Pound : "+this.gibraltorPound+" GIP");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Gibraltor_Pound : "+this.getExchangeRates()+" GIP");
		System.out.println();
	}
}
