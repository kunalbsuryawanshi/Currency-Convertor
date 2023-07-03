package org.program.domain;

public class MexicanPeso extends Currency
{
	private double mexicanPeso;
	
	@Override
	public String currencyConverter()
	{
		this.mexicanPeso = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Mexican_Peso : "+this.mexicanPeso+" MXN";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Mexican_Peso : "+this.mexicanPeso+" MXN");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Mexican_Peso : "+this.getExchangeRates()+" MXN");
		System.out.println();
	}
}
