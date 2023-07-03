package in.ineuron;
import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the First number :");
		int num1=sc.nextInt();
		
		System.out.print("Enter the second number :");
		int num2=sc.nextInt();
		
		System.out.print("Enter the third number :");
		int num3=sc.nextInt();
		
		int largest=num1;
		
		if(num2>largest) {
			largest=num2;
		}if(num3>largest) {
			largest=num3;
		}
		System.out.println("Largest Number is : "+largest);

	}

}
