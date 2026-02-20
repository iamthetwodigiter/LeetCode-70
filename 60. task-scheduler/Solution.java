class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char c: tasks) freq[c-'A']++;

        Arrays.sort(freq);
        int fMax = freq[25];

        // Count how many tasks have the same max frequecy
        int nMax = 0;
        for(int f: freq) {
            if(f == fMax) nMax++;
        }

        int result = (fMax-1) * (n+1) + nMax;
        // If the formula gives a value smaller than the task count, 
        // it means there was enough variety to never be idle.
        return Math.max(result, tasks.length);
    }
}