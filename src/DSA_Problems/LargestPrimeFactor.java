package DSA_Problems;
import java.util.Scanner;
import java.lang.Math;
public class LargestPrimeFactor {
	public static void findLargestPrimeFactor(int N) {
		int largestPrime = 1;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                largestPrime = Math.max(largestPrime, i);
                while (N % i == 0) {
                    N /= i;
                }
            }
        }
        if (N > 1) {
            largestPrime = Math.max(largestPrime, N);
        }
        System.out.println("Largest Prime Factor is :"+largestPrime);
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int N=sc.nextInt();
		findLargestPrimeFactor(N);

	}

}
