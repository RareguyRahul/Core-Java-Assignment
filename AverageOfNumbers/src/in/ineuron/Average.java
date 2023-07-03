package in.ineuron;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	  System.out.println("Enter the count of numbers : ");
	  Scanner sc=new Scanner(System.in);
      
	  int count=sc.nextInt();
	  
	  int sum=0;
	  int number;
	  int i=0;
	  
	  System.out.println("Enter "+count+" Numbers");
	  do {
		  number=sc.nextInt();
		  sum+=number;
		  i++;
	  }while(i<count);
		   double avarage=(double)sum/number;
		   System.out.println("Avarage :"+avarage);
	       sc.close();
	}

}
