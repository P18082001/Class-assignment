//Check the whether number is positive or negative!
package basicprograms;
import java.util.Scanner;
public class Positive_Negative {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a Number:");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println(num+ " number is positive! ");
		}
		else
		{
			System.out.println(num+ " number is negative! ");
		}
	}

}
