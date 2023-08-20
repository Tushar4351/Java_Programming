package hello_world;
import java.util.*;


public class SecondLargest {
	
	static void SecondLargestNumber(int a[],int N){
		
		int largest=a[0],secondLargest=-1;
		for(int i=1;i<N;i++) {
			if(largest<a[i]) {
				secondLargest=largest;
				largest=a[i];
			}
			
		}
		System.out.println("Second Largest Number: "+secondLargest);
	}
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the size of array");
		 int N=sc.nextInt();
		int[] a= new int[N];
		System.out.println("Enter the array Elements");
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		
		SecondLargestNumber(a,N);
	}

}
