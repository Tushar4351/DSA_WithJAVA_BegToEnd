package DSA_Problems;
import java.util.Scanner;
public class Decimal_Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Decimal Number: ");
		int N= sc.nextInt();
		 int[] binaryNum = new int[32];

	        // counter for binary array
	        int i = 0,j;
	        while (N > 0) {
	            // storing remainder in binary array
	            binaryNum[i] = N % 2;
	            N = N / 2;
	            i++;

	}
	        for(j=0;j<i;j++) {
	        	System.out.print(binaryNum[i-1-j]);
	        }
	}
}
