package org.program.domain;

public class JapaneseYen extends Currency
{
	private double japaneseYen;
	
	@Override
	public String currencyConverter()
	{
		this.japaneseYen = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Japanese_Yen : "+this.japaneseYen+" JPY";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Japanese_Yen : "+this.japaneseYen+" JPY");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Japanese_Yen : "+this.getExchangeRates()+" JPY");
		System.out.println();
	}
}
