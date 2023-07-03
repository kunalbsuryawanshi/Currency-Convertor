package org.program.domain;

public class BangladeshiTaka extends Currency
{
	double bangladeshiTaka;
	
	@Override
	public String currencyConverter() 
	{
		this.bangladeshiTaka = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Bangladeshi_Taka : "+this.bangladeshiTaka+" BDT";
	}
	
	@Override
	public void display()
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Bangladeshi_Taka : "+this.bangladeshiTaka+" BDT");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Bangladeshi_Taka : "+this.getExchangeRates()+" BDT");
		System.out.println();
	}
}
