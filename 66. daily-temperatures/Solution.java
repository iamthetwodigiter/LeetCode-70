class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++) {
            // While stack is not empty and current temp is warmer than the top
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                result[index] = i-index; // Distance to the warmer day
            }
            // Push current index to find its warmer day later
            stack.push(i);
        }
        return result;
    }
}