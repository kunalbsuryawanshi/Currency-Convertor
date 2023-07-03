package org.program.domain;

public class OmaniRial extends Currency
{
	double omaniRial;
	
	@Override
	public String currencyConverter()
	{
		this.omaniRial = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Omani_Rial : "+this.omaniRial+" OMR";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Omani_Rial : "+this.omaniRial+" OMR");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Omani_Rial : "+this.getExchangeRates()+" OMR");
		System.out.println();
	}
}
