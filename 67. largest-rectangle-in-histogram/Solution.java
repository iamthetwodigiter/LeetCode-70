class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for(int i=0; i<=n; i++) {
            // Use 0 as sentinel value for the index i == n
            int currentHeight = (i == n) ? 0 : heights[i];

            // If current height is smaller than the top of the stack the bar at stack.peek() can no longer extend to the right
            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int h = heights[stack.pop()];
                //Width is the distance between the new left boundary and current i
                int w = stack.isEmpty() ? i : i- stack.peek() - 1;
                maxArea = Math.max(maxArea, h*w);
            }
            stack.push(i);
        }
        return maxArea;
    }
}