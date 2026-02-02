class MergeSort {
    static int[] merge(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                merged[k] = a[i];
                i++;
            } else {
                merged[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            merged[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            merged[k] = b[j];
            j++;
            k++;
        }
        return merged;
    }

    static int[] sort(int[] arr) {
        if (arr.length <= 1)
            return arr;

        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left, right);
    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] * nums[i];
        }

        // Arrays.sort(arr);
        // return arr;
        return MergeSort.sort(arr);
    }
}