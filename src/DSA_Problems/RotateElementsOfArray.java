package DSA_Problems;

import java.util.Scanner;

public class RotateElementsOfArray {
	 //Function to rotate an array by d elements in counter-clockwise direction. 
	public static void rotateArr(int arr[], int d, int n) {
		   
	       d = d % n;
	       //Brute Approach TC->o(n) SC->o(n)
//	           	int[] temp=new int[d];
	    		
//	     		for(int i=0;i<d;i++) {
//	     			temp[i]=arr[i];
//	     		}
//	     		for(int i=d;i<n;i++) {
//	     			arr[i-d]=arr[i];
//	     		}
//	     		for(int i=n-d;i<n;i++) {
//	     			arr[i]=temp[i-(n-d)];
//	     		}

	      // Function to Rotate k elements to right Optimal Approach TC->o(n) SC->o(1)

	     // Reverse first k elements
	        Reverse(arr, 0, d - 1);
	        // Reverse last n-k elements
	        Reverse(arr, d , n - 1);
	        // Reverse whole array
	        Reverse(arr, 0, n - 1);
	      }
	      		  public static void Reverse(int[] arr, int start, int end) {
	        while (start <= end) {
	          int temp = arr[start];
	          arr[start] = arr[end];
	          arr[end] = temp;
	          start++;
	          end--;
	        }
    	
    }
	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the Length of array : ");
		int N = sc.nextInt();
		int[] arr=new int[N];
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Numbers that u want to rotate : ");
		int d = sc.nextInt();
		rotateArr(arr,d, N);
	}

}
