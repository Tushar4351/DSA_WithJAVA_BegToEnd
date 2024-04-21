package DSA_Problems;

import java.util.Scanner;

public class EquilibriumIndex {
    public static int pivotIndex(int[] nums) {
        int n=nums.length;

        //Brute Approach TC->o(n*2) SC->o(1)
      //  int i, j;
      // int leftsum, rightsum;
     
      // for (i = 0; i < n; i++) {

      //     /* get left sum */
      //     leftsum = 0;
      //     for (j = 0; j < i; j++)
      //         leftsum += nums[j];

      //     /* get right sum */
      //     rightsum = 0;
      //     for (j = i + 1; j < n; j++)
      //         rightsum += nums[j];

      //     /* if leftsum and rightsum are same,
      //       then we are done */
      //     if (leftsum == rightsum)
      //         return i;
      // }

      
      //return -1;
      
       //optimal Approach TC->o(n) SC->o(1)
        int sum = 0; 
      int leftsum = 0; 

      /* Find sum of the whole array */
      for (int i = 0; i < n; i++)
          sum += nums[i];

      for (int i = 0; i < n; i++) {
          sum -= nums[i]; // sum is now right sum for index
                         // i

         if (leftsum == sum)
               return i;

          leftsum += nums[i];
      }

      
      return -1;
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Length of array : ");
		int N = sc.nextInt();
		int[] nums=new int[N];
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<N;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("Equilibrium index of This array: "+pivotIndex(nums));
		
		
	}

}
