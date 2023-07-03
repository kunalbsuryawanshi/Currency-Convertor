package org.program.util;

import java.util.List;

public class CurrencyList 
{
	List<String> currencyList = null;                //Referance Declaration
	
	public void setList(List<String> currencyList)   //Upcasting
	{
		this.currencyList = currencyList;            
	}
	
	public void addRecents(String recent)
	{
		if(recent != null)
		this.currencyList.add(recent);
	}
	
	public void showRecord() 
	{
		if(this.currencyList.isEmpty())              //Dynamic Method Dispatch
		{
			System.out.println();
			System.out.println("No recent Searches !!");
			System.out.println();
		}
		else
		{
			System.out.println();
			System.out.println("----------------------------------------------");
			System.out.println("Recently Searched ......");
			this.currencyList.forEach(System.out::println);
			System.out.println("----------------------------------------------");
			System.out.println();
		}
		
		
	}
	
	
}
