package DSA_Problems;
import java.util.Scanner;
// that number should be divisible by sum  of digits  
public class HarshadOrNivenNumber {
	public static void findHarshadOrNivenNumber(int N) {

		int sum=0,givenNumber=N;
		while(N>0) {
			int r= N % 10;
			sum=sum+r;
			N=N/10;
		}
		System.out.println("sum is :"+sum);
		if(givenNumber%sum==0) {
			System.out.println("It Is a Harshad Or NivenNumber");
		}else {
			System.out.println("It Is Not a Harshad Or NivenNumber");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		findHarshadOrNivenNumber(n);
	}

}
