package DSA_Problems;
import java.util.Scanner;
import java.lang.Math;

public class Binary_Decimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);int i,sum=0,N=5;
		System.out.println("Enter the Binary Number: ");
		int[] num= new int[N];
		for(i=0;i<N;i++) {
			num[i]=sc.nextInt();
		}
		for(i=0;i<N;i++) {
			System.out.print(num[i]);
		}
		for(i=0;i<N;i++) {
			
			sum = sum + (num[N-1-i] * (int)Math.pow(2, i));
		}
		System.out.println("Enter the Decimal Number: " + sum);
	}

}
