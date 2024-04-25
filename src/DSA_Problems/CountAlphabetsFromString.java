package DSA_Problems;

import java.util.Scanner;

public class CountAlphabetsFromString {
	public static void Count(String S)
    
    {
        int n=S.length();
        int count=0;
        for(int i=0;i<n ;i++){
            char ch=S.charAt(i);
            if ( (ch >= 'a' && ch <= 'z') ||  
                (ch >= 'A' && ch <= 'Z') ){
                    count++;
                }
        }
        System.out.println("Enetr the Sentence : "+count);
    }

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the Sentence : ");
		String name=sc.nextLine();
		Count(name);

	}

}
