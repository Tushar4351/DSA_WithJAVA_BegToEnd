package DSA_Problems;

import java.util.Scanner;

public class StrongNumber {
	public static void checkStrongNumber(int N) {
	    int originalNum = N;
	    int sum = 0;
	    while (N > 0) {
	        int digit = N % 10;
	        int fact = 1;
	        for (int i = 1; i <= digit; i++) {
	            fact *= i;
	        }
	        sum += fact;
	        N /= 10;
	    }
	    if (sum == originalNum) {
	        System.out.println(originalNum + " is a Strong Number.");
	    } else {
	        System.out.println(originalNum + " is not a Strong Number.");
	    }
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Two Numbers: ");
		int n=sc.nextInt();
		checkStrongNumber(n);

	}

}
