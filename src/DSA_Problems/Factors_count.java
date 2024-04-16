package DSA_Problems;
import java.util.Scanner;
import java.lang.Math;
public class Factors_count {
	
	public static void checkTheDivisorsOfNumber(int N) {
		
		 int count=0;
	      for(int i=1;i<=Math.sqrt(N);i++){
	    	//  System.out.println("For loop : "+ i);
	          if (N % i == 0) {
	                  count++;
	                  System.out.print(i);
	                // System.out.println("first: "+ count);
	                  if (N / i != i) {
	                      count++;
	                      System.out.print(i+" " + N/i + " " );
	                    //  System.out.println("Second: "+ count);
	                  }
	              }

	          }
	      System.out.println("Number of divisors: "+ count);
	}
	
	
	
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	
	System.out.println("Enter the Number : ");
	int N = sc.nextInt();
	checkTheDivisorsOfNumber(N);
	
}
}
