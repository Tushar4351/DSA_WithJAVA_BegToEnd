package DSA_Problems;

import java.util.Scanner;

public class SumOfNumbersInString {
	public static long findSum(String str)
	{
	    long sum = 0;
	    int num = 0; // Variable to store the current number being parsed
	    
	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if (Character.isDigit(ch)) {
	            // If the current character is a digit, add it to the current number
	            num = num * 10 + Character.getNumericValue(ch);
	        } else {
	            // If the current character is not a digit, add the current number to the sum
	            sum += num;
	            // Reset the current number to 0 for the next iteration
	            num = 0;
	        }
	    }
	    
	    // Add the last number (if any) to the sum
	    sum += num;
	    
	    return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the Sentence : ");
		String name=sc.nextLine();
		System.out.println("Enetr the Sentence : " +findSum(name));

	}

	

}
