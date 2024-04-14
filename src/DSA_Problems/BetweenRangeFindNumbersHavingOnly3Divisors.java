package DSA_Problems;

import java.util.Scanner;

public class BetweenRangeFindNumbersHavingOnly3Divisors {
	public static void findNumbersHavingOnly3Divisors(int a,int b) {
		
		int count2=0;
		for(int i=a;i<=b;i++) {
		//	System.out.println("i value of "+ i);
			int count1=0;
			for(int j=1;j<=Math.sqrt(i);j++) {
				 if (i % j == 0) { 
	                  count1++;
	                   
	               //   System.out.println("first: "+ count);
	                  if (i / j != j) {
	                	  count1++;
	                     // System.out.print(j+" " + i/j + " " );
	                	 // System.out.println("first: "+ count1);
	                  }
	                  }
				 
	                  
	              }
			//System.out.println("first: "+ count1);
			if(count1==3) {
				count2++;
			}
		}
		
		System.out.println("first: "+ count2++);
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Range: ");
		int a=sc.nextInt();
		System.out.println("Enter the Second Range: ");
		int b=sc.nextInt();
		findNumbersHavingOnly3Divisors(a,b);

	}

}
