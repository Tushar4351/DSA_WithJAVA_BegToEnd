package DSA_Problems;
import java.util.Scanner;
import java.lang.Math;

public class Prime_Numbers {
 public static void checkPrimeNumber(int N) {
	  int count=0;
      for(int i=1;i<=Math.sqrt(N);i++){
    	  System.out.println("For loop : "+ i);
          if (N % i == 0) {
                  count++;
                  System.out.println("first: "+ count);
                  if (N / i != i) {
                      count++;
                   //   System.out.print(i+" " + N/i + " " );
                     // System.out.println("Second: "+ count);
                  }
              }

          }
      if(count==2){
          System.out.println(1);
      }else{
          System.out.println(0);
      }
  }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int N=sc.nextInt();
		checkPrimeNumber(N);
		

	}

}
