package org.program.util;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.program.domain.AustralianDoller;
import org.program.domain.BahrainiDinar;
import org.program.domain.BangladeshiTaka;
import org.program.domain.BritishPound;
import org.program.domain.ChineseYuan;
import org.program.domain.Currency;
import org.program.domain.Euro;
import org.program.domain.GibraltorPound;
import org.program.domain.HongKongDollar;
import org.program.domain.IndonesianRupiah;
import org.program.domain.JapaneseYen;
import org.program.domain.KuwaitiDinar;
import org.program.domain.MexicanPeso;
import org.program.domain.NewZealandDollar;
import org.program.domain.OmaniRial;
import org.program.domain.Rupee;
import org.program.domain.RussianRuble;
import org.program.domain.SingaporeDollar;
import org.program.domain.SwissFranc;
import org.program.domain.TurkishLira;
import org.program.domain.USDollar;

public class CurrencyTest 
{
	private Currency currency;        //Referance Declaration
	private double amount;
	public String recent;
	private static Scanner sc = new Scanner(System.in);
	private double exchangeRates;
	public void changeExchangeRates(int choice1, int choice2) 
	{
		if(choice1 == 1 && choice2 == 2)
		{
			System.out.print("Enter exchangeRates : ");
			this.exchangeRates = sc.nextDouble();
		}
		
	}
	public void acceptAmount()
	{
		try {
			System.out.println();
			System.out.print("Enter amount : ");
			this.amount = sc.nextDouble();
			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println("Enter numeric value !!");
			System.exit(0);
		}
	}
	public void toRupee(int choice)
	{
		this.currency = new Rupee();                //Upcasting
		if(choice == 1)
		{
			this.exchangeRates = 1;
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(this.exchangeRates);			
		}
		else if(choice == 2)
		{
			this.exchangeRates = 81.85;
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 3)
		{
			this.exchangeRates = 90.87;
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 4)
		{
			this.exchangeRates = 101.68;
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 5)
		{
			this.exchangeRates = 269.02;
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 6)
		{
			this.exchangeRates = 54.89;
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 7)
		{
			this.exchangeRates = 91.67;
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 8)
		{
			this.exchangeRates = 101.68;
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 9)
		{
			this.exchangeRates = 218.21;
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 10)
		{
			this.exchangeRates = 214.62;
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 11)
		{
			this.exchangeRates = 61.405;
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 12)
		{
			this.exchangeRates = 0.770;
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 13)
		{
			this.exchangeRates = 1;
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 14)
		{
			this.exchangeRates = 10.443;
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 15)
		{
			this.exchangeRates = 4.229;
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 16)
		{
			this.exchangeRates = 0.0055;
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 17)
		{
			this.exchangeRates = 0.61;
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 18)
		{
			this.exchangeRates = 4.56;
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 19)
		{
			this.exchangeRates = 50.37;
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		else if(choice == 20)
		{
			this.exchangeRates = 1.01;
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(this.exchangeRates); 
		}
		this.currency.setAmount(this.amount);       
		recent = this.currency.currencyConverter();  //Dynamic Method Dispatch
		this.currency.display();                     //Dynamic Method Dispatch
	}
	public void toUSDollar(int choice)
	{
		this.currency = new USDollar();              //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.012);
		}
		else if(choice == 2)
		{
			this.currency.setExchangeRates(1);
			this.currency.setCurrencyName("US_Dollar");
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(1.11);
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(1.24);
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(3.92);
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(0.67);
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(1.12);
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(1.24);
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(2.67);
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(2.62);
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(0.749);
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.009);
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(0.145);
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(0.127);
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.052);
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.000067);
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.0075);
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(0.056);
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(0.61);
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.012);
		}
		this.currency.setAmount(this.amount);     
		recent = this.currency.currencyConverter();  //Dynamic Method Dispatch
		this.currency.display();                     //Dynamic Method Dispatch
	}
	
	public void toEuro(int choice)
	{
		this.currency = new Euro();                  //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.011);
		}
		else if(choice == 2)
		{
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(0.90);
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(1);
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(1.12);
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(2.97);
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(0.60);
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(1.01);
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(1.12);
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(2.41);
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(2.36);
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(0.686);
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.009);
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(0.133);
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(0.117);
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.047);
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.000060);
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.0067);
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(0.050);
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(0.55);
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.011);
		}
		this.currency.setAmount(this.amount);        
		recent = this.currency.currencyConverter();   //Dynamic Method Dispatch
		this.currency.display();                      //Dynamic Method Dispatch
	}
	public void toBritishPound(int choice)
	{
		this.currency = new BritishPound();            //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.0098);
		}
		else if(choice == 2)
		{
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(0.80);
			
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(0.89);
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(1);
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(2.65);
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(0.54);
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(0.90);
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(1);
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(2.15);
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(2.11);
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(0.606);
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.008);
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(0.118);
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(0.103);
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.042);
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.000054);
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.0060);
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(0.045);
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(0.49);
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.0099);
		}
		this.currency.setAmount(this.amount);        
		recent = this.currency.currencyConverter();   //Dynamic Method Dispatch
		this.currency.display();                      //Dynamic Method Dispatch
	}
	public void toKuwaitiDinar(int choice)
	{
		this.currency = new KuwaitiDinar();           //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.0037);
		}
		else if(choice == 2)
		{
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(0.31);
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(0.34);
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(0.38);
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(1);
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(0.21);
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(0.34);
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(0.38);
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(0.82);
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(0.80);
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(0.229);
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.003);
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(0.045);
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(0.039);
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.016);
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.000021);
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.0023);
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(0.017);
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(0.19);
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.0038);
		}
		this.currency.setAmount(this.amount);         
		recent = this.currency.currencyConverter();    //Dynamic Method Dispatch
		this.currency.display();                       //Dynamic Method Dispatch
	}
	public void toAustralianDollar(int choice)
	{
		this.currency = new AustralianDoller();        //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.018);
		}
		else if(choice == 2)
		{
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(1.49);
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(1.65);
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(1.85);
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(4.90);
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(1);
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(1.67);	
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(1.85);
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(3.97);
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(3.91);
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(1.119);
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.014);
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(0.217);
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(0.190);
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.077);
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.00010);
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.011);
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(0.083);
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(0.92);
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.021);
		}
		this.currency.setAmount(this.amount);       
		recent = this.currency.currencyConverter();  //Dynamic Method Dispatch
		this.currency.display();                     //Dynamic Method Dispatch
	} 
	public void toSwissFreanc(int choice)
	{
		this.currency = new SwissFranc();            //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.011);
		}
		else if(choice == 2)
		{
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(0.89);
			
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(0.99);
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(1.11);
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(2.93);
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(0.60);
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(1);
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(1.11);
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(2.38);
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(2.34);
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(0.674);
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.008);
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(0.131);
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(0.115);
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.046);
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.000060);
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.0067);
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(0.050);
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(0.55);
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.011);
		}
		this.currency.setAmount(this.amount);        
		recent = this.currency.currencyConverter();   //Dynamic Method Dispatch
		this.currency.display();                      //Dynamic Method Dispatch
	}
	public void toGibraltorPound(int choice)
	{
		this.currency = new GibraltorPound();         //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.0098);
		}
		else if(choice == 2)
		{
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(0.80);
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(0.87);
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(0.98);
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(2.61);
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(0.53);
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(0.89);	
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(1);
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(2.12);
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(2.15);
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(0.604);
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.008); 
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(0.117);
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(0.103); 
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.042); 
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.000053); 
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.0059); 
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(0.044); 
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(0.49); 
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.0098); 
		}
		this.currency.setAmount(this.amount);         
		recent = this.currency.currencyConverter();   //Dynamic Method Dispatch
		this.currency.display();                      //Dynamic Method Dispatch
	} 
	public void toBahrainiDinar(int choice)
	{
		this.currency = new BahrainiDinar();          //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.0046); 
		}
		else if(choice == 2)
		{
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(0.38);  
			
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(0.41); 
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(0.47); 
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(1.23); 
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(0.25); 
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(0.42); 		
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(0.47); 
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(1); 
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(0.98); 
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(0.282); 
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.004); 
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(0.055); 
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(0.048);  
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.019); 
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.000025); 
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.0028); 
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(0.021); 
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(0.23); 
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.0046); 
		}	
		this.currency.setAmount(this.amount);       
		recent = this.currency.currencyConverter();  //Dynamic Method Dispatch
		this.currency.display();                     //Dynamic Method Dispatch
	}
	public void toOmaniRial(int choice)
	{
		this.currency = new OmaniRial();              //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.0047); 
		}
		else if(choice == 2)
		{			
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(0.38); 
			
		}
		else if(choice == 3)
		{		
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(0.43);  
		}
		else if(choice == 4)
		{		
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(0.48); 
		}
		else if(choice == 5)
		{			
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(1.27); 
		}
		else if(choice == 6)
		{			
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(0.26); 
		}
		else if(choice == 7)
		{			
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(0.43); 
		}
		else if(choice == 8)
		{			
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(0.48); 
		}
		else if(choice == 9)
		{			
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(1.03); 	
		}
		else if(choice == 10)
		{			
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(1); 
		}
		else if(choice == 11)
		{			
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(0.288);  
		}
		else if(choice == 12)
		{			
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.004); 
		}
		else if(choice == 13)
		{			
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(0.056); 
		}
		else if(choice == 14)
		{			
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(0.049); 
		}
		else if(choice == 15)
		{			
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.020); 
		}
		else if(choice == 16)
		{			
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.000026); 
		}
		else if(choice == 17)
		{			
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.0029); 
		}
		else if(choice == 18)
		{			
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(0.021); 
		}
		else if(choice == 19)
		{			
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(0.24); 
		}
		else if(choice == 20)
		{		
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.0047); 
		}
		this.currency.setAmount(this.amount);         
		recent = this.currency.currencyConverter();    //Dynamic Method Dispatch
		this.currency.display();                       //Dynamic Method Dispatch
	}
	public void toSingaporeDollar(int choice)
	{
		this.currency = new SingaporeDollar();         //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.016);  
		}
		else if(choice == 2)
		{			
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(1.335);  
		}
		else if(choice == 3)
		{			
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(1.457);  
		}
		else if(choice == 4)
		{			
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(1.649); 
		}
		else if(choice == 5)
		{			
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(4.360); 
		}
		else if(choice == 6)
		{			
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(0.893); 
		}
		else if(choice == 7)
		{			
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(1.484); 
		}
		else if(choice == 8)
		{		
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(1.657); 
		}
		else if(choice == 9)
		{		
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(3.541); 	
		}
		else if(choice == 10)
		{			
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(3.468); 
		}
		else if(choice == 11)
		{			
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(1); 
		}
		else if(choice == 12)
		{			
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.013); 
		}
		else if(choice == 13)
		{			
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(0.194); 
		}
		else if(choice == 14)
		{			
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(0.170); 
		}
		else if(choice == 15)
		{			
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.069); 
		}
		else if(choice == 16)
		{			
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.000090); 
		}
		else if(choice == 17)
		{			
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.010); 
		}
		else if(choice == 18)
		{			
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(0.074); 
		}
		else if(choice == 19)
		{			
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(0.82); 
		}
		else if(choice == 20)
		{			
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.016); 
		}
		this.currency.setAmount(this.amount);        
		recent = this.currency.currencyConverter();   //Dynamic Method Dispatch
		this.currency.display();                      //Dynamic Method Dispatch
	}
	public void toBangladeshiTaka(int choice)
	{
		this.currency = new BangladeshiTaka();        //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(1.299);  
		}
		else if(choice == 2)
		{			
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(106.500); 
			
		}
		else if(choice == 3)
		{			
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(116.254); 
		}
		else if(choice == 4)
		{			
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(131.589); 
		}
		else if(choice == 5)
		{			
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(347.812); 
		}
		else if(choice == 6)
		{			
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(71.266); 
		}
		else if(choice == 7)
		{			
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(118.407); 	
		}
		else if(choice == 8)
		{			
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(132.167); 
		}
		else if(choice == 9)
		{			
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(282.531); 	
		}
		else if(choice == 10)
		{			
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(276.695); 
		}
		else if(choice == 11)
		{			
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(79.781); 
		}
		else if(choice == 12)
		{			
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(1); 
		}
		else if(choice == 13)
		{			
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(15.484);  
		}
		else if(choice == 14)
		{			
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(13.568); 
		}
		else if(choice == 15)
		{			
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(5.495); 
		}
		else if(choice == 16)
		{			
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.0071); 
		}
		else if(choice == 17)
		{			
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.79); 
		}
		else if(choice == 18)
		{			
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(5.90); 
		}
		else if(choice == 19)
		{			
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(65.15); 
		}
		else if(choice == 20)
		{			
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(1.30); 
		}
		this.currency.setAmount(this.amount);              
		recent = this.currency.currencyConverter();    //Dynamic Method Dispatch
		this.currency.display();                       //Dynamic Method Dispatch
	}
	public void toChineseYuan(int choice)
	{
		this.currency = new ChineseYuan();             //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.084);  
		}
		else if(choice == 2)
		{			
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(6.878);  
		}
		else if(choice == 3)
		{		
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(7.508); 
		}
		else if(choice == 4)
		{			
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(8.498); 
		}
		else if(choice == 5)
		{			
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(22.463); 
		}
		else if(choice == 6)
		{			
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(4.603); 
		}
		else if(choice == 7)
		{			
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(7.647); 		
		}
		else if(choice == 8)
		{			
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(8.536); 
		}
		else if(choice == 9)
		{			
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(18.247); 
		}
		else if(choice == 10)
		{			
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(17.870); 
		}
		else if(choice == 11)
		{			
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(5.152); 
		}
		else if(choice == 12)
		{			
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.065); 
		}
		else if(choice == 13)
		{			
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(1); 
		}
		else if(choice == 14)
		{			
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(0.876); 
		}
		else if(choice == 15)
		{			
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.355); 
		}
		else if(choice == 16)
		{			
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.00046); 
		}
		else if(choice == 17)
		{			
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.051); 
		}
		else if(choice == 18)
		{			
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(0.38); 
		}
		else if(choice == 19)
		{			
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(4.82); 
		}
		else if(choice == 20)
		{			
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.085); 
		}
		this.currency.setAmount(this.amount);
		recent = this.currency.currencyConverter();    //Dynamic Method Dispatch       
		this.currency.display();                       //Dynamic Method Dispatch
	}
	public void toHongKongDollar(int choice)
	{
		this.currency = new HongKongDollar();         //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.096); 
		}
		else if(choice == 2)
		{			
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(7.849); 
		}
		else if(choice == 3)
		{		
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(8.568); 
		}
		else if(choice == 4)
		{			
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(9.698); 
		}
		else if(choice == 5)
		{			
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(25.635); 
		}
		else if(choice == 6)
		{			
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(5.252); 
		}
		else if(choice == 7)
		{			
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(8.727); 			
		}
		else if(choice == 8)
		{			
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(9.741); 
		}
		else if(choice == 9)
		{			
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(20.823); 
		}
		else if(choice == 10)
		{			
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(20.393); 
		}
		else if(choice == 11)
		{			
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(5.880); 
		}
		else if(choice == 12)
		{			
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.074); 
		}
		else if(choice == 13)
		{			
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(1.141); 
		}
		else if(choice == 14)
		{			
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(1); 
		}
		else if(choice == 15)
		{			
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.405); 
		}
		else if(choice == 16)
		{			
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.00053); 
		}
		else if(choice == 17)
		{			
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.059); 
		}
		else if(choice == 18)
		{			
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(0.44); 
		}
		else if(choice == 19)
		{			
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(4.82); 
		}
		else if(choice == 20)
		{			
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.096);  
		}
		this.currency.setAmount(this.amount);
		recent = this.currency.currencyConverter();     //Dynamic Method Dispatch
		this.currency.display();                        //Dynamic Method Dispatch
	}
	public void toTurkishLira(int choice)
	{
		this.currency = new TurkishLira();              //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.236); 
		}
		else if(choice == 2)
		{
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(19.381); 
			
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(21.156); 
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(23.947); 
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(63.296); 
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(12.969); 
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(21.548); 			
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(24.052); 
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(51.416); 	
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(50.354); 	
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(14.519); 
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.182);  
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(2.818); 
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(2.469); 
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(1); 
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.0013); 
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.14); 
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(1.08); 
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(11.91); 
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.24);
		}
		this.currency.setAmount(this.amount);
		recent = this.currency.currencyConverter();    //Dynamic Method Dispatch    
		this.currency.display();                       //Dynamic Method Dispatch
	}
	public void toIndonesianRupiah(int choice)
	{
		this.currency = new IndonesianRupiah();        //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(182.06);  
		}
		else if(choice == 2)
		{
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(14936.00); 
			
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(16573.73); 
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(18572.73); 
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(48742.52); 
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(9995.17); 
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(16726.32); 		
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(18584.08); 
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(39633.32); 
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(38794.90); 
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(11187.18); 
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(140.80); 
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(2166.65); 
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(1902.69); 
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(769.83); 
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(1); 
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(111.33); 
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(830.41); 
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(9170.70); 
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(183.38); 
		}
		this.currency.setAmount(this.amount);
		recent = this.currency.currencyConverter();   //Dynamic Method Dispatch
		this.currency.display();                      //Dynamic Method Dispatch
	}
	
	public void toJapaneseYen(int choice)
	{
		this.currency = new JapaneseYen();            //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(1.65); 
		}
		else if(choice == 2)
		{
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(134.17); 
			
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(148.89); 
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(166.83); 
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(437.84); 
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(89.78); 
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(150.25); 		
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(166.92); 
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(356.01); 
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(348.48); 
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(100.49); 
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(1.26); 
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(19.46); 
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(17.09); 
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(6.92); 
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.0090); 
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(1);
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(7.46); 
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(82.36); 
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(1.65); 
		}
		this.currency.setAmount(this.amount);
		recent = this.currency.currencyConverter();   //Dynamic Method Dispatch
		this.currency.display();                      //Dynamic Method Dispatch
	}
	
	public void toMexicanPeso(int choice)
	{
		this.currency = new MexicanPeso();            //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.22); 
		}
		else if(choice == 2)
		{
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(17.99); 
			
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(19.78); 
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(22.37); 
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(58.70); 
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(12.04); 
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(20.14); 		
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(22.38); 
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(47.73); 
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(46.72); 
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(13.47); 
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.17); 
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(2.61);
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(2.29); 
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.93); 
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.0012); 
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.13); 
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(1); 
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(11.04); 
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.22); 
		}
		this.currency.setAmount(this.amount);
		recent = this.currency.currencyConverter();   //Dynamic Method Dispatch
		this.currency.display();                      //Dynamic Method Dispatch
	} 
	
	public void toNewZealandDollar(int choice)
	{
		this.currency = new NewZealandDollar();       //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.020);  
		}
		else if(choice == 2)
		{
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(1.63);  
			
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(1.81);  
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(2.03);  
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(5.32); 
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(1.09); 
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(1.82);  		
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(2.02); 
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(4.32);  
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(4.23); 
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(1.22); 
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.015); 
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(0.24); 
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(0.21); 
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(0.084); 
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.00011); 
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.012); 
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(0.091); 
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(1); 
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(0.020); 
		}
		this.currency.setAmount(this.amount);
		recent = this.currency.currencyConverter();  //Dynamic Method Dispatch
		this.currency.display();                     //Dynamic Method Dispatch
	}
	
	public void toRussianRuble(int choice)
	{
		this.currency = new RussianRuble();          //Upcasting
		if(choice == 1)
		{
			this.currency.setCurrencyName("Indian_Rupee");
			this.currency.setExchangeRates(0.99);  
		}
		else if(choice == 2)
		{
			this.currency.setCurrencyName("US_Dollar");
			this.currency.setExchangeRates(81.45); 
		}
		else if(choice == 3)
		{
			this.currency.setCurrencyName("Euro");
			this.currency.setExchangeRates(90.38); 
		}
		else if(choice == 4)
		{
			this.currency.setCurrencyName("British_Pound");
			this.currency.setExchangeRates(101.28); 
		}
		else if(choice == 5)
		{
			this.currency.setCurrencyName("Kuwaiti_Dinar");
			this.currency.setExchangeRates(265.81); 
		}
		else if(choice == 6)
		{
			this.currency.setCurrencyName("Australian_Dollar");
			this.currency.setExchangeRates(54.51); 
		}
		else if(choice == 7)
		{
			this.currency.setCurrencyName("Swiss_Franc");
			this.currency.setExchangeRates(91.21); 	
		}
		else if(choice == 8)
		{
			this.currency.setCurrencyName("Gibraltor_Pound");
			this.currency.setExchangeRates(101.36); 
		}
		else if(choice == 9)
		{
			this.currency.setCurrencyName("Bahraini_Dinar");
			this.currency.setExchangeRates(216.13); 
		}
		else if(choice == 10)
		{
			this.currency.setCurrencyName("Omani_Rial");
			this.currency.setExchangeRates(211.56); 
		}
		else if(choice == 11)
		{
			this.currency.setCurrencyName("Singapore_Dollar");
			this.currency.setExchangeRates(61.01); 
		}
		else if(choice == 12)
		{
			this.currency.setCurrencyName("Bangladeshi_Taka");
			this.currency.setExchangeRates(0.77); 
		}
		else if(choice == 13)
		{
			this.currency.setCurrencyName("Chinese_Yuan");
			this.currency.setExchangeRates(11.82); 
		}
		else if(choice == 14)
		{
			this.currency.setCurrencyName("HongKong_Dollar");
			this.currency.setExchangeRates(10.38); 
		}
		else if(choice == 15)
		{
			this.currency.setCurrencyName("Turkish_Lira");
			this.currency.setExchangeRates(4.20); 
		}
		else if(choice == 16)
		{
			this.currency.setCurrencyName("Indonesian_Rupiah");
			this.currency.setExchangeRates(0.0055); 
		}
		else if(choice == 17)
		{
			this.currency.setCurrencyName("Japanese_Yen");
			this.currency.setExchangeRates(0.61); 
		}
		else if(choice == 18)
		{
			this.currency.setCurrencyName("Mexican_Peso");
			this.currency.setExchangeRates(4.53); 
		}
		else if(choice == 19)
		{
			this.currency.setCurrencyName("New_Zealand_Dollar");
			this.currency.setExchangeRates(50.01); 
		}
		else if(choice == 20)
		{
			this.currency.setCurrencyName("Russian_Ruble");
			this.currency.setExchangeRates(1); 
		}
		this.currency.setAmount(this.amount);           
		recent = this.currency.currencyConverter();  //Dynamic Method Dispatch
		this.currency.display();                     //Dynamic Method Dispatch
	}
	
	public static int menuList()
	{
		
		System.out.println("----------------------------------------------");
		System.out.println(" 0. Exit");
		System.out.println(" 1. Rupee  ");
		System.out.println(" 2. US_Dollar  ");
		System.out.println(" 3. Euro  ");
		System.out.println(" 4. British_Pound  ");
		System.out.println(" 5. Kuwaiti_Dinar  ");
		System.out.println(" 6. Australian_Dollar  ");
		System.out.println(" 7. Swiss_Fanc  ");
		System.out.println(" 8. Gibraltor_Pound  ");
		System.out.println(" 9. Bahraini_Dinar  ");
		System.out.println("10. Omani_Rial  ");
		System.out.println("11. Singapore_Dollar ");
		System.out.println("12. Bangladeshi_Taka ");
		System.out.println("13. chinese_Yuan ");
		System.out.println("14. HongKong_Dollar ");
		System.out.println("15. Turkish_Lira ");
		System.out.println("16. Indonesian_Rupiah");
		System.out.println("17. Japanese_Yen");
		System.out.println("18. Mexican_Peso");
		System.out.println("19. New_Zealand_Dollar");
		System.out.println("20. Russian_Ruble");
		System.out.println("----------------------------------------------");

		System.out.print("Choose Currency : ");
		try {
			return sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Enter numeric value !!");
		}
		return 0;
	}
	
	public static int subMenuList()
	{
		System.out.println("----------------------------------------------");
		System.out.println(" 0. Exit");
		System.out.println(" 1. Rupee  ");
		System.out.println(" 2. US_Dollar  ");
		System.out.println(" 3. Euro  ");
		System.out.println(" 4. British_Pound  ");
		System.out.println(" 5. Kuwaiti_Dinar  ");
		System.out.println(" 6. Australian_Dollar  ");
		System.out.println(" 7. Swiss_Fanc  ");
		System.out.println(" 8. Gibraltor_Pound  ");
		System.out.println(" 9. Bahraini_Dinar  ");
		System.out.println("10. Omani_Rial  ");
		System.out.println("11. Singapore_Dollar ");
		System.out.println("12. Bangladeshi_Taka ");
		System.out.println("13. Chinese_Yuan ");
		System.out.println("14. HongKong_Dollar ");
		System.out.println("15. Turkish_Lira ");
		System.out.println("16. Indonesian_Rupiah");
		System.out.println("17. Japanese_Yen");
		System.out.println("18. Mexican_Peso");
		System.out.println("19. New_Zealand_Dollar");
		System.out.println("20. Russian_Ruble");
		System.out.println("21. Recent searches");
		System.out.println("----------------------------------------------");
		System.out.print("Convert To ...... ");
		try {
			return sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Enter numeric value !!");
			System.exit(0);
		}
		return 0;
	}
	
}
