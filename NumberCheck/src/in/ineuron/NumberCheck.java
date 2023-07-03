package in.ineuron;
import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number ::");
		int number=sc.nextInt();
		
		if(number>0) {
			System.out.println("The Number is positive");
		}
		else if(number<0) {
			System.out.println("The Number is negative");
		}
		else {
			System.out.println("The Number is Zero");
		}
	}

}
