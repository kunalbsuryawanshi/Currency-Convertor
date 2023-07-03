package org.program.domain;

public class SwissFranc extends Currency
{
	double swissFranc;
	
	@Override
	public String currencyConverter()
	{
		this.swissFranc = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Swiss_Franc : "+this.swissFranc+" CHF";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Swiss_Franc : "+this.swissFranc+" CHF");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Swiss_Franc : "+this.getExchangeRates()+" CHF");
		System.out.println();
	}}
