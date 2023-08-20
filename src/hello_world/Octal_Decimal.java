package hello_world;
import java.util.*;
public class Octal_Decimal {
       static int octalToDecimal(int n) {
    	   int sum=0,base=1;
    	   
    	   while(n>0) {
    		   
    		   int r=n%10;
    		   sum=sum+(r*base);
    		   base=base*8;
    		   n=n/10;
    		   
    	   }
    	   
    	   
    	   
    	   return sum;
       }
	public static void main(String[] args) {
		System.out.println("Enter the Octal Number = ");
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		System.out.println("The decimal number is = "+octalToDecimal(n));
		

	}

}
