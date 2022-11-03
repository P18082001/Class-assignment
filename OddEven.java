//Cheak the wheteher number is positive or negative!
package basicprograms;
import java.util.Scanner;
public class OddEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter a Number:");
		num=sc.nextInt();
		if(num%2==0)
		{
		   System.out.println(num+ " Number is even");	
		}
		else
		{
		    System.out.println(num+ " Number is odd");	
		}
	}
	
}
