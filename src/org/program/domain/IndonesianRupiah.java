package org.program.domain;

public class IndonesianRupiah extends Currency
{
	private double indonesianRupiah;
	
	@Override
	public String currencyConverter()
	{
		this.indonesianRupiah = this.getExchangeRates() * this.amount;
		return "Conversion   : "+this.amount+" "+getCurrencyName()+" to Indonesian_Rupiah : "+this.indonesianRupiah+" IDR";
	}
	
	@Override
	public void display() 
	{
		System.out.println();
		System.out.println("Conversion   : "+this.amount+" "+getCurrencyName()+" to Indonesian_Rupiah : "+this.indonesianRupiah+" IDR");
		System.out.println("ExchangeRate : 1 "+getCurrencyName()+" to Indonesian_Rupiah : "+this.getExchangeRates()+" IDR");
		System.out.println();
	}
}
