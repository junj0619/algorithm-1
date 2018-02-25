/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param root: The root of binary tree
     * @return: An integer
     */
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        
        return getMin(root);
    }
    
    private int getMin(TreeNode root){
        if (root == null){
            return Integer.MAX_VALUE;
        }
        
        if (root.left == null && root.right == null){
            return 1;
        }
        
        return Math.min(getMin(root.left), getMin(root.right)) + 1;
    }
}
