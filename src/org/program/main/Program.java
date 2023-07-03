package org.program.main;

import java.util.ArrayList;
import org.program.util.CurrencyTest;
import org.program.util.CurrencyList;

public class Program
{
	public static void main(String[] args)
	{	
		CurrencyList list = new CurrencyList();         //Instantiation
		list.setList(new ArrayList<>());
		CurrencyTest test = new CurrencyTest();         //Instantiation
		int choice1;
		int choice2;
		while((choice1 = CurrencyTest.menuList()) != 0)
		{
			if(choice1 >= 0 && choice1 <= 20)
			{
				test.acceptAmount();
				
				while((choice2 = CurrencyTest.subMenuList()) != 0)
				{
					if(choice2 >= 0 && choice2 <= 21)
					{
						switch(choice2)
						{
							case 1:test.toRupee(choice1);
								break;
							case 2:test.toUSDollar(choice1);
								break;
							case 3:test.toEuro(choice1);
								break;
							case 4:test.toBritishPound(choice1);
								break;
							case 5:test.toKuwaitiDinar(choice1);
								break;
							case 6:test.toAustralianDollar(choice1);
								break;
							case 7:test.toSwissFreanc(choice1);
								break;
							case 8:test.toGibraltorPound(choice1);
								break;
							case 9:test.toBahrainiDinar(choice1);
								break;
							case 10:test.toOmaniRial(choice1);
								break;
							case 11:test.toSingaporeDollar(choice1);
								break;
							case 12:test.toBangladeshiTaka(choice1);
								break;
							case 13:test.toChineseYuan(choice1);
								break;
							case 14:test.toHongKongDollar(choice1);
								break;
							case 15:test.toTurkishLira(choice1);
								break;
							case 16:test.toIndonesianRupiah(choice1);
								break;
							case 17:test.toJapaneseYen(choice1);
								break;
							case 18:test.toMexicanPeso(choice1);
								break;
							case 19:test.toNewZealandDollar(choice1);
								break;
							case 20:test.toRussianRuble(choice1);
								break;
							case 21:list.showRecord();
								break;
							case 22:test.changeExchangeRates(choice1,choice2);
								break;
						}
						list.addRecents(test.recent);
					}
					else 
					{
						System.out.println();
						System.out.println("Invalid choice !!");
						System.out.println("Enter choice between 1-21");
						System.out.println();
					}
				}
			}
			else 
			{
				System.out.println();
				System.out.println("Invalid choice !!");
				System.out.println("Enter choice between 1-20");
				System.out.println();
			}
		}
	}
}
