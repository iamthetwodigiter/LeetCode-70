class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Max-Heap based on distance squared
        // We use (b, a) order in the comparator to make it a Max-Heap
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));

        for(int[] point: points) {
            maxHeap.add(point);
            if(maxHeap.size() > k) maxHeap.poll();
        }

        int[][] result = new int[k][2];
        while(k > 0) result[--k] = maxHeap.poll();
        return result;
    }
}