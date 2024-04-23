package DSA_Problems;

import java.util.Scanner;

public class RemoveVowels {
	public static String removeVowels(String S) {
	        return S.replaceAll("(?i)[aeiou]", "");//(?i) flag for case-insensitive matching or use [aeiouAEIOU]"
	    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the Sentence : ");
		String name=sc.nextLine();
		System.out.println("Enetr the Sentence : " +removeVowels(name));

	}

}
