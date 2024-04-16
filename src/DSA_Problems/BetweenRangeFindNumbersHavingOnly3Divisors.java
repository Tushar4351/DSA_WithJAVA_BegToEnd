package DSA_Problems;

import java.util.Arrays;
import java.util.Scanner;
//worst Case
public class BetweenRangeFindNumbersHavingOnly3Divisors {
//	public static void findNumbersHavingOnly3Divisors(int a,int b) {
//
//		
//		int count2=0;
//		for(int i=a;i<=b;i++) {
//		//	System.out.println("i value of "+ i);
//			int count1=0;
//			for(int j=1;j<=Math.sqrt(i);j++) {
//				 if (i % j == 0) { 
//	                  count1++;
//	                   
//	               //   System.out.println("first: "+ count);
//	                  if (i / j != j) {
//	                	  count1++;
//	                     // System.out.print(j+" " + i/j + " " );
//	                	 // System.out.println("first: "+ count1);
//	                  }
//	                  }
//				 
//	                  
//	              }
//			//System.out.println("first: "+ count1);
//			if(count1==3) {
//				count2++;
//			}
//		}
//		
//		System.out.println("first: "+ count2++);
//		
//		
//		
//		
//		
//		
//		
//		
//	}
	
	//best case
	public static int findNumbersHavingOnly3Divisors(Long L,Long R) {
		  int count = 0;
	        // Calculate primes up to sqrt(R)
	        boolean[] primes = new boolean[(int)Math.sqrt(R) + 1];
	        Arrays.fill(primes, true);
	        primes[0] = primes[1] = false;
	        
	        for (int i = 2; i * i <= R; i++) {
	            if (primes[i]) {
	                // Mark multiples of i as non-prime
	                for (int j = i * i; j <= Math.sqrt(R); j += i) {
	                    primes[j] = false;
	                }
	            }
	        }
	        
	        // Count perfect squares of primes in the range [L, R]
	        for (int i = 2; i * i <= R; i++) {
	            if (primes[i]) {
	                long square = (long)i * i;
	                // Count perfect squares between L and R
	                if (square >= L && square <= R) {
	                    count++;
	                }
	            }
	        }
	        
	        return count;
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Range: ");
		long a=sc.nextInt();
		System.out.println("Enter the Second Range: ");
		long b=sc.nextInt();
		System.out.println("Answer "+ findNumbersHavingOnly3Divisors(a,b));

	}

}
