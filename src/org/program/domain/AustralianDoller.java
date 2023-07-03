package org.program.domain;

public class AustralianDoller extends Currency
{
	private double australianDoller;
	
	@Override
	public String currencyConverter()
	{
		this.australianDoller = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Australian_Doller : "+this.australianDoller+" AUD";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Australian_Doller : "+this.australianDoller+" AUD");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Australian_Doller : "+this.getExchangeRates()+" AUD");
		System.out.println();
		
	}
}
