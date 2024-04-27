package DSA_Problems;

import java.util.Scanner;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
	        int n = s.length();
	        int count = 0;
	        if (n == 0) return 0;
	        for (int i = n - 1; i >= 0; i--) {
	            char ch = s.charAt(i);
	            if (ch != ' ') {
	                count++;
	            } else if (count > 0) {
	                break;
	            }
	        }
	        return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Length Of Last Word : "+lengthOfLastWord(s));

	}

}
