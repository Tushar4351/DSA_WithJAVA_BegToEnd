package DSA_Problems;

import java.util.Scanner;

public class GCD_LCM {
	public static int findGCD(int a, int b ) {
		while(a>0 && b>0) {
			if(a>b) {
				a=a%b;
			}else {
				b=b%a;
			}
		}if(a==0) {
			return b;
		}else {
			return a;
		}
		
	}
	public static int findLCM(int a, int b) {
		int lcm=(a*b)/findGCD(a,b);
		return lcm;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Two Numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("GCD of The Two Numbers is : "+findGCD(a,b));
		
		System.out.println("GCD of The Two Numbers is : " +findLCM(a,b));
		

	}

}
