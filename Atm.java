package ATMMachineGenerator;


import java.util.*;

public class Atm {
	static int total=0;
	public static void main(String[] args)
	{
	 Scanner z=new Scanner(System.in);
	 System.out.println();
	 System.out.println("1]DEPOSIT            2]WITHDRAWAL");
	 System.out.println("3]CHECK BALANCE      4]EXIT");
	 System.out.println();
	 boolean end=true;
	 while(end)
	 {
       System.out.print("Enter the Number to choose the option:" );
       int a=z.nextInt();
	 switch(a)
	 {
	 case 1:
		 deposit();
		 break;
	 case 2:
		 withdrawl();
		 break;
	 case 3:
		 System.out.println("The Balance Amount is:"+check_balance());
		 break;
	 case 4:
		 end=false;
		 break;
	 }
	 }
     System.out.println("Thank You!!");
     
	}
	public static void deposit()
	{
		Scanner z=new Scanner(System.in);
		System.out.println("Enter the amount for deposit:");
		int de=z.nextInt();
		if(de<1000)
		{
			System.out.println("Sorry!!You need deposit more than 1000!!");
		}
		total+=de;
	}
	public static void withdrawl()
	{
		Scanner z=new Scanner(System.in);
		System.out.println("Enter the amount for withdrawl:");
		int de=z.nextInt();
		int ch=check_balance();
		if(ch>1000)
		{
			if(de>ch)
			  System.out.println("Your Withdrawl Amount Is Greater Than The Balance Amount!!");				 
			else
			{
			total-=de;
			if(total<1000)
			  System.out.println("It reaches the minimum limit!!");
			}
		}
		
	}
	public static int check_balance()
	{
		return total;
	}
}


