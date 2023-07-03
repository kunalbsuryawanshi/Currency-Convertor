package org.program.domain;

public class ChineseYuan extends Currency
{
	double chineseYuan;
	
	@Override
	public String currencyConverter()
	{
		this.chineseYuan = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Chinese_Yuan : "+this.chineseYuan+" CNY";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Chinese_Yuan : "+this.chineseYuan+" CNY");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Chinese_Yuan : "+this.getExchangeRates()+" CNY");
		System.out.println();
	}
}
