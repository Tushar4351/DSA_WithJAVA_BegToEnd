package DSA_Problems;
import java.util.Scanner;
public class FirstNonRepeatingNumber {
	public static int findFirstNonRepeatingNumber(int arr[],int n) {
		
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }
            if (count == 1) {
                return i;
            }
        }
        return -1; // No non-repeating number found
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
