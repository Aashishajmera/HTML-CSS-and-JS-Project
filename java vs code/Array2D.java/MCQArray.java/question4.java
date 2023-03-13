

import java.util.*;
public class question4{
	
	static int[] kthSmallestAndLargestElement(int arr1[], int k){
	     Arrays.sort(arr1);
	     int ans [] = { arr1[k-1] , arr1[arr1.length-k]};
	     return ans ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter " + n + " elements ");
		for(int i=0; i<n; i++){
		     arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value of k ");
		int k=sc.nextInt();
		
	  int ans[] = kthSmallestAndLargestElement(arr , k);

		System.out.println( k + " Smallest : " + ans[0]);
		System.out.println( k + " Largest : " + ans[1]);
		
	}
}