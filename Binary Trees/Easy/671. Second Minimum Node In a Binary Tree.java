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

    // public void useSet(TreeNode root, HashSet<Integer> set){
    //     if(root == null){
    //         return;
    //     }

    //     useSet(root.left, set);
    //     set.add(root.val);
    //     useSet(root.right, set);
    // }

    public int findSecondMinimumValue(TreeNode root) {
        
        if(root == null){
            return -1;
        }

        if(root.left == null && root.right == null){
            return -1;
        }

        // HashSet<Integer> set = new HashSet<>();
        // int k = 0;

        // useSet(root, set);
        // int[] arr = new int[set.size()];

        // for(Integer i: set){
        //     arr[k] = i;
        //     k++;
        // }
        // Arrays.sort(arr);
        
        // if(arr.length == 1){
        //     return -1;
        // }

        // return arr[1];


        int left = root.left.val;
        int right = root.right.val;

        
        if(left == root.val){
            left = findSecondMinimumValue(root.left);
        }
        if(right == root.val){
            right = findSecondMinimumValue(root.right);
        }
        
        if(left != -1 && right != -1){
            return Math.min(left, right);
        }
        if(left == -1){
            return right;
        }
        else{
            return left;
        }
    }
}
