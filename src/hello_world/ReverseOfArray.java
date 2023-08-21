package hello_world;

import java.util.Scanner;

public class ReverseOfArray {
static void reverseArray(int a[],int N,int i) {
	if(i>=N/2) { 
		return;
	}
	int temp = a[i];
    a[i] = a[N - i - 1];
    a[N - i - 1] = temp;
	reverseArray(a,N,(i+1));

	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of array");
		int N=sc.nextInt();
		int[] a=new int[N];
		 System.out.println("Enter the array Elements");
		for(int i=0;i<N;i++) {
			
			a[i]=sc.nextInt();
		}
		reverseArray(a,N,0);
		  System.out.println("Reversed Array:");
	        for (int i = 0; i < N; i++) {
	            System.out.print(a[i] + " ");
	        }
	}

}
