package org.program.domain;

public class RussianRuble extends Currency
{
	private double russianRuble;
	
	@Override
	public String currencyConverter()
	{
		this.russianRuble = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Russian_Ruble : "+this.russianRuble+" RUB";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Russian_Ruble : "+this.russianRuble+" RUB");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Russian_Ruble : "+this.getExchangeRates()+" RUB");
		System.out.println();
	}
}
