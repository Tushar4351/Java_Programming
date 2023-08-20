package hello_world;

import java.util.Scanner;

public class Decimal_Octal {
	static void decimalToOctal(int n) {
        int a[]=new int[100];
		int i=0,j;
		while(n>0) {
			a[i]=n%8;
			n=n/8;
			i++;
			
			
		}
		for(j=i-1;j>=0;j--) 
		System.out.println("The Octal number is = "+a[j]);
		
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the Decimal Number = ");
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		decimalToOctal(n);
		

	}

}
