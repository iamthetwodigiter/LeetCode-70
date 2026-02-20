class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0; i<numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the adjacency list and fill in-degree array
        for(int[] pre: prerequisites) {
            int course = pre[0];
            int prerequisite = pre[1];
            adj.get(prerequisite).add(course);
            inDegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        // Add all courses with no prerequisites to the queue
        for(int i=0; i<numCourses; i++) {
            if(inDegree[i] == 0) queue.add(i);
        }

        int count = 0;
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            count++;

            // For each course that depends on the current course
            for(int neighbor: adj.get(curr)) {
                inDegree[neighbor]--;
                if(inDegree[neighbor] == 0) queue.add(neighbor);
            }
        }

        // If we processed all courses, there's no cycle
        return count == numCourses;
    }
}