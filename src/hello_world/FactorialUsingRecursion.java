package hello_world;

import java.util.Scanner;

public class FactorialUsingRecursion {
static int factorialRecursion(int i,int N) {
	int fact=0;
	if(i>N) {
		return 1;	
	}
		
	fact=i*factorialRecursion(i+1,N);
	return fact;
		
		
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the limitation");
			int N=sc.nextInt();
			int factorial=factorialRecursion(1,N);
			 System.out.println("Factorial is :"+factorial );

	}

}
