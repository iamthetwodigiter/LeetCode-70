class Solution {
    private void backtrack(int start, int[] candidates, int target, List<Integer> current, List<List<Integer>> result) {
        // Base Case 1: Target Reached
        if(target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Base Case 2: Target exceeded or no more candidates
        if(target < 0 || start == candidates.length) {
            return;
        }

        // Choice 1: Include candidates[start]
        current.add(candidates[start]);
        // Note: we stay at 'start' because we can reuse the same element
        backtrack(start, candidates, target-candidates[start], current, result);

        // Backtrack: Remove the element before trying the next choice
        current.remove(current.size()-1);

        // Choice 2: Skip candidates[start] and move to the next index
        backtrack(start+1, candidates, target, current, result);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }
}