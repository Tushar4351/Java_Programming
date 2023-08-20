package hello_world;

import java.util.Scanner;

public class RemoveDuplicate {
static int removeDuplicateNumber(int a[],int N) {
	int i=0;
	for(int j=1;j<N;j++) {
		if(a[j]!=a[i]) {
			a[i+1]=a[j];
			i++;
		}
	}
	return (i+1);
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
		int count=removeDuplicateNumber(a,N);
		 System.out.println("Number of duplicate elements : "+count);
		
	}

}
