package DSA_Problems;

import java.util.Scanner;

public class RotateElementsOfArray {
	 //Function to rotate an array by d elements in counter-clockwise direction. 
	public static void rotateArr(int arr[], int d, int n) {
		   
			    d = d % n;
			   
		int[] temp=new int[d];
		//Brute Approach TC->o(n) SC->o(n)
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
		}
		System.out.println(" change array: ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(int i=n-d;i<n;i++) {
			arr[i]=temp[i-(n-d)];
		}
		
		System.out.println("Rotated array: ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
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
