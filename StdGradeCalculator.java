package studentgradecalculator;
import java.util.*;
public class calculator {

	public static void main(String[] args)
	{
	Scanner z=new Scanner(System.in);
	int a,b,c,d,e;
	System.out.println("Enter the mark for subject1:");
	a=z.nextInt();
	System.out.println("Enter the mark for subject2:");
	b=z.nextInt();
	System.out.println("Enter the mark for subject3:");
	c=z.nextInt();
	System.out.println("Enter the mark for subject4:");
	d=z.nextInt();
	System.out.println("Enter the mark for subject5:");
	e=z.nextInt();
	int s=a+b+c+d+e;
	int avg=s/5;
	System.out.println(avg);
	if(avg>=90)
	 System.out.print("Grade A");
	else if(avg>=80&&avg<90)
	  System.out.print("Grade B");
	else if(avg>=70&&avg<80)
		  System.out.print("Grade C");
	else if(avg>=60&&avg<70)
		  System.out.print("Grade D");
	else if(avg>=50&&avg<60)
		  System.out.print("Grade E");
	else
		System.out.print("Grade F");
	}
}


