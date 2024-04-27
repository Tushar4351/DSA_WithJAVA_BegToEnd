package DSA_Problems;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
        	System.out.println("prefix:" + prefix);
        	System.out.println(strs[i]);
        	System.out.println(strs[i].indexOf(prefix));
            while (strs[i].indexOf(prefix) != 0) {
            	System.out.println("prefix size:" + prefix.length());
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
	public static void main(String[] args) {
		 String[] strs1 = {"flower", "flow", "flight"};
	        System.out.println("Example 1 Input: [\"flower\", \"flow\", \"flight\"]");
	        System.out.println("Output: " + longestCommonPrefix(strs1)); // Output: "fl"

	}

}
