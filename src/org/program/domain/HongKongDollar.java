package org.program.domain;

public class HongKongDollar extends Currency 
{
	double hongKongDollar;
	
	@Override
	public String currencyConverter()
	{
		this.hongKongDollar = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to HongKong_Dollar : "+this.hongKongDollar+" HKD";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to HongKong_Dollar : "+this.hongKongDollar+" HKD");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to HongKong_Dollar : "+this.getExchangeRates()+" HKD");
		System.out.println();
	}
}
