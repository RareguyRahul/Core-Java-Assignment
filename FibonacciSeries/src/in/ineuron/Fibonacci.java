package in.ineuron;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number::");
        
        int number=sc.nextInt();
        
        int firstTerm=0;
        int secondTerm=1;
        
        System.out.println("Fibonacci Series Up to :"+number+" ");
        
        for(int i=0;i<number;i++) {
        	System.out.println(firstTerm+" ");
        	
        	int nextTerm=firstTerm+secondTerm;
        	firstTerm=secondTerm;
        	secondTerm=nextTerm;
        }
        sc.close();
	}

}
