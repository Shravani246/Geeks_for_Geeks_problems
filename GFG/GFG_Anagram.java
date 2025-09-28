class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // Step 1: If lengths differ, cannot be anagrams
        if (s1.length() != s2.length()) return false;
        
        int[] count = new int[26]; // 26 lowercase letters

        // Step 2: Count characters
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++; // increment for s1
            count[s2.charAt(i) - 'a']--; // decrement for s2
        }

        // Step 3: Check if all counts are zero
        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}

