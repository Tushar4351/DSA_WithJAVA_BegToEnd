package DSA_Problems;
import java.util.Scanner;
public class OddAndEven {
	public static String findOddAndEven(String S) {
		
		  // Array to store the frequency of characters
        int[] frequency = new int[26]; // Assuming only lowercase English characters
        
        char[] characters = S.toCharArray(); // Convert the string S to a character array
        int length = characters.length; // Get the length of the character array

        for (int i = 0; i < length; i++) { // Loop through each character in the array
        char c = characters[i]; // Get the current character at index i
    
        // Calculate the position of the character in the English alphabet
        int position = c - 'a';
    
         // Increment the frequency count for the character's position in the array
        frequency[position]++;
       }
        
        // Initialize variables to count X and Y
        int X = 0; // Count of distinct characters with positive even frequency at even positions
        int Y = 0; // Count of distinct characters with positive odd frequency at odd positions
        
        // Iterate through the characters and calculate X and Y
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                char c = (char) ('a' + i);
                int position = i + 1; // Position of the character in the English alphabet
                
                if (position % 2 == 0 && frequency[i] % 2 == 0) {
                    X++;
                } else if (position % 2 != 0 && frequency[i] % 2 != 0) {
                    Y++;
                }
            }
        }
        
        // Calculate the summation of X and Y
        int summation = X + Y;
        
        // Determine if the summation is even or odd
        if (summation % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sting");
		String S=sc.nextLine();
		System.out.println(findOddAndEven(S));

	}

}
