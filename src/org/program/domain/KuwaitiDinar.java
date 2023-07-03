package org.program.domain;

public class KuwaitiDinar extends Currency
{
	double kuwaitiDinar;
	
	@Override
	public String currencyConverter()
	{
		this.kuwaitiDinar = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Kuwaiti_Dinar : "+this.kuwaitiDinar+" KWD";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Kuwaiti_Dinar : "+this.kuwaitiDinar+" KWD");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Kuwaiti_Dinar : "+this.getExchangeRates()+" KWD");
		System.out.println();
	}
}
