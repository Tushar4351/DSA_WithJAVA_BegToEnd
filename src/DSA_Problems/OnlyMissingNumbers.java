package DSA_Problems;

public class OnlyMissingNumbers {
	public static int findOnlyMissingNumber(int[] nums) {
	        int n = nums.length; // size of the array

	        // Calculate S:
	        long S = 0;
	        for (int i = 0; i < n; i++) {
	            S += nums[i];
	        }

	        // Calculate expected sum:
	        long expectedSum = (long) n * (n + 1) / 2;

	        // If there's only one element and it's 0, then missing number is n.
	        if (n == 1 && nums[0] == 0) {
	            return n;
	        }

	        // Otherwise, return the difference between expected sum and actual sum.
	        return (int) (expectedSum - S);
	    }
	public static void main(String[] args) {
		int[] nums = {3, 1, 2, 5, 6, 7,0};
       
        System.out.println("The  missing number is:" + findOnlyMissingNumber(nums));
    }

}
