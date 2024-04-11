package DSA_Problems;
import java.util.Scanner;
public class Replace0With5 {
 public static void replaceZeroWithFive(int N) {
	 int temp=0;
	 
	    while(N>0){
	        int r=N%10;
	        if(r==0) {
	        	r=5;
	        }
	        temp= temp*10+r;
	        N=N/10;
	    }
	    
	    System.out.println("Change Number : "+reverseOfNumber(temp));
	    
 }
 public static int reverseOfNumber(int N) {
	 int temp=0;
	 while(N>0){
	        int r=N%10;
	        temp= temp*10+r;
	        N=N/10;
	    }
	 return temp;
	 
 }
 
 
 
 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the Number : ");
		int N = sc.nextInt();
		replaceZeroWithFive(N);
	}

}
