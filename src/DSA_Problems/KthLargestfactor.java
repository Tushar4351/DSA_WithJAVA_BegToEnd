package DSA_Problems;
import java.util.Scanner;
import java.lang.Math;
public class KthLargestfactor {
	public static int findKthLargestfactor(int n,int k) {
		  // worst case TO->O(n)

//         for(int i=n;i>=1;i--){
//         if(n%i==0 && --k==0){
//         return i;
//         }
//
//         }
//         return -1;

        // best case TO->O(sqrt(n))
        for (int i = 1; i * i < n; i++) {
            if (n % i == 0 && --k == 0) {
                return i;
            }
        }
        for (int i = (int) Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0 && --k == 0) {
                return n / i;
            }

        }

        return -1;

		
		
		
		
	}
	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		System.out.println("Enter the kth: ");
		int k=sc.nextInt();
		System.out.println("answer: " + findKthLargestfactor(n,k));

	}

}
