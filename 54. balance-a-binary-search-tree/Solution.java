/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // 1. Get the sorted array
    // 2. Build the BST from the sorted array
    private void inOrder(TreeNode root, List<Integer> list) {
        if(root == null) return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
    
    private TreeNode buildBST(List<Integer> list, int start, int end) {
        if(start > end) return null;

        int mid = start + (end-start) / 2;
        TreeNode node = new TreeNode(list.get(mid));

        node.left = buildBST(list, start, mid-1);
        node.right = buildBST(list, mid+1, end);
        return node;
    }

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sortedList = new ArrayList<>();
        inOrder(root, sortedList);
        return buildBST(sortedList, 0, sortedList.size()-1);
    }
}