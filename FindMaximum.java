package basicprograms;

import java.util.Scanner;

public class FindMaximum {
	public static void main(String[] arg) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three number");
		num1=sc.nextInt();  //200
		num2=sc.nextInt();  //50
		num3=sc.nextInt();  //20
		
		if(num1>num2) //200>50
		{
			if(num1>num3)  //internal 200>20
			{
				System.out.println(num1+ " is greater");
			}
			else
			{
				System.out.println(num3+ " is greater");
			}
		}  //external if
		else   //external else
		{
			if(num2>num3)
			{
				System.out.println(num2+ " is greater");
			}
			else
			{
				System.out.println(num3+ " is greater");
			}
		}
	}
 
}
