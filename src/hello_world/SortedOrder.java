package hello_world;
import java.util.*;
public class SortedOrder {
 static boolean SortedOrderArray(int a[], int N) {
	 for(int i=1;i<N;i++) {
		 if(a[i]>=a[i-1]) {
			 
		 }
		 else{
			 return false;
		 }
	 }
	 return true;
	 
	 
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
		boolean check=SortedOrderArray(a,N);
		 System.out.println("Is the array is sorted? "+check);
		
	}

}
