package hello_world;

import java.util.Scanner;

public class RotateArrayAnyPosition {
static void rotateArrayFromAnyPosition(int a[],int N,int K) {
	int temp[]=new int[K];
	int i;
	for(i=0;i<K;i++) {
		temp[i]=a[i];
		
	}
	for(i=K;i<N;i++) {
		a[i-K]=a[i];
		
	}
//	for(i=0;i<K;i++) {
		a[i-K]=temp[i];
		
//	}
	
	 for (i = 0; i < N; i++) {
         System.out.print(a[i-K] + " ");
     }
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the size of array: ");
		int N=sc.nextInt();
		 System.out.print("Enter the Position: ");
			int K=sc.nextInt();
		int[] a=new int[N];
		
		 System.out.println("Enter the array Elements");
		for(int i=0;i<N;i++) {
			
			a[i]=sc.nextInt();
		}
		rotateArrayFromAnyPosition(a,N,K);

	}

}
