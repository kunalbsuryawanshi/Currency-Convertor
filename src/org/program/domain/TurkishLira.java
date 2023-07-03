package org.program.domain;

public class TurkishLira extends Currency
{
	double turkishLira;
	
	@Override
	public String currencyConverter()
	{
		this.turkishLira = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Turkish_Lira : "+this.turkishLira+" TRY";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Turkish_Lira : "+this.turkishLira+" TRY");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Turkish_Lira : "+this.getExchangeRates()+" TRY");
		System.out.println();
	}
}
