class Solution {
    public int characterReplacement(String s, int k) {
        // Window is valid if
        // (total char in window) - (count of most freq char) <= k

        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for(int right=0; right<s.length(); right++) {
            freq[s.charAt(right) - 'A']++;

            // Keep track of the most frequent character in the current window
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // If characters to replace (windowSize - maxFreq) > k, shrink window
            int windowSize = right-left+1;
            if(windowSize - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update global max length
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}