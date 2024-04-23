package DSA_Problems;

import java.util.Scanner;

public class CountAlphabetsFromString {
	public static void Count(String S)
    {
        int n=S.length();
        for(int i=0;i<n ;i++){
            char ch=S.charAt(i);
            System.out.println(ch);
        }
    }

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the Sentence : ");
		String name=sc.nextLine();
		Count(name);

	}

}
