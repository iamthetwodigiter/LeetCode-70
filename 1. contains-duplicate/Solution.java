class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n: nums) {
            if(set.contains(n)) return true;
            set.add(n);
        }
        return false;

        // for(int n: nums) {
        //     set.add(n);
        // }

        // return set.size() != nums.length;
    }
}