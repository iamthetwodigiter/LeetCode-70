class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int longest = 0;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                // Expand left
                int left = i - 1;
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }
                // Expand right
                int right = i + 1;
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }
                // Calculate current mountain length
                int currentMountain = right - left + 1;
                longest = Math.max(longest, currentMountain);
                i = right;
            }
        }
        return longest;
    }
}