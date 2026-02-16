class Solution {
    public int climbStairs(int n) {
        // Only way to reach a step n is either from (n-1)th step or (n-2)th step, so this problem is but Fibonacci series

        if (n <= 2) return n;

        int[] dp = new int[n+1];
        dp[1] = 1; // [1]
        dp[2] = 2; // [1,1], [2]

        for(int i = 3; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}