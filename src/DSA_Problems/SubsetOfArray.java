package DSA_Problems;

public class SubsetOfArray {

    public static String isSubset(int a1[], int a2[], int n, int m) {
        for (int i = 0; i < m; i++) {
            boolean found = false; // Flag to indicate if the element is found in a1[]
            for (int j = 0; j < n; j++) {
                if (a2[i] == a1[j]) { // If the element of a2[] is found in a1[]
                    found = true; // Mark the element as found
                    break; // No need to continue searching in a1[], move to the next element of a2[]
                }
            }
            if (!found) { // If any element of a2[] is not found in a1[], return "NO"
                return "NO";
            }
        }
        // If all elements of a2[] are found in a1[], return "YES"
        return "YES";
    }

    public static void main(String[] args) {
        int a1[] = { 11, 1, 13, 21, 3, 7 };
        int a2[] = { 11, 3, 7, 1 };
        int m = a2.length;
        int n = a1.length;

        System.out.println("Is it a subset of array?: " + isSubset(a1, a2, n, m));
    }
}

