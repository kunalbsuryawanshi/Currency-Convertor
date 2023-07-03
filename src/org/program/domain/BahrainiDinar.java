package org.program.domain;

public class BahrainiDinar extends Currency
{
	double bahrainiDinar;
	
	@Override
	public String currencyConverter()
	{
		this.bahrainiDinar = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Bahraini_Dinar : "+this.bahrainiDinar+" BHD";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Bahraini_Dinar : "+this.bahrainiDinar+" BHD");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Bahraini_Dinar : "+this.getExchangeRates()+" BHD");
		System.out.println();
		
	}
}
