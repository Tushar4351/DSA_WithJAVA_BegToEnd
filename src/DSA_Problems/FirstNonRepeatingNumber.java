package DSA_Problems;
import java.util.Scanner;
public class FirstNonRepeatingNumber {
	public static int findFirstNonRepeatingNumber(int arr[],int n) {
		
	        //worst case TC-> O(nums.length) For Positive Integers
	        for (int i = 0; i < n; i++) {
	            int count = 0;
	            for (int j = 0; j < n; j++) {
	                if (i != j && arr[j] == arr[i]) {
	                    count++;
	                }
	            }
	            if (count == 0) {
	                return arr[i];
	            }
	        }
	        
	        // If no non-repeating integer is found, return 0
	        return 0;

	     
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
		
		System.out.println("First NonRepeating Number : "+findFirstNonRepeatingNumber(arr,N));

	}

}
