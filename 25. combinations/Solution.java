class Solution {
    private void backtrack(List<List<Integer>> res, List<Integer> tempList, int start, int n, int k) {
        if(tempList.size() == k) {
            res.add(new ArrayList<>(tempList));
        }

        for(int i = start; i <= n; i++) {
            tempList.add(i);
            backtrack(res, tempList, i+1, n, k);
            tempList.remove(tempList.size()-1);
        }

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();

        backtrack(res, new ArrayList<>(), 1, n, k);
        return res;
    }
}