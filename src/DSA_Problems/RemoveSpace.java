package DSA_Problems;

import java.util.Scanner;

public class RemoveSpace {
	public static String modify(String S)
	    {
	      return  S.replace(" ", "");
	    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the Sentence : ");
		String name=sc.nextLine();
		System.out.println("Enetr the Sentence : " +modify(name));

	}
	

}
