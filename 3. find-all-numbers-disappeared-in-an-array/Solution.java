class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // List<Integer> list = new ArrayList<Integer>();
        // Set<Integer> set = new HashSet<Integer>();

        // for(int n: nums) {
        //     set.add(n);
        // }

        // for(int i=1; i<=nums.length; i++) {
        //     if(!set.contains(i)) {
        //         list.add(i);
        //     }
        // }
        // return list;

        List<Integer> list = new ArrayList<Integer>();
        boolean[] bool = new boolean[nums.length+1];

        for(int i=0; i<nums.length; i++) {
            bool[nums[i]] = true;
        }


        for(int i=1; i<=nums.length; i++) {
            if(!bool[i]) list.add(i);
        }

        return list;

    }
}