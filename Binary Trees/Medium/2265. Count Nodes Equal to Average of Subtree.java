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

    // public int findSum(TreeNode root){

    //     if(root == null){
    //         return 0;
    //     }
    //     return findSum(root.left) + root.val + findSum(root.right);
    // }

    // public int findNumber(TreeNode root){

    //     if(root == null){
    //         return 0;
    //     }
    //     return findNumber(root.left) + findNumber(root.right) + 1;        
    // }

    // public int findAverage(TreeNode root, int[] counter){

    //     if(root == null){
    //         return 0;
    //     }

    //     if((findSum(root.left) + findSum(root.right) + root.val)/(findNumber(root.left)+findNumber(root.right) + 1) == root.val){
    //         counter[0] += 1;
    //     }

    //     findAverage(root.left, counter);
    //     findAverage(root.right, counter);

    //     return counter[0];
    // }




    public Pair<Integer, Integer> findAverageFromPair(TreeNode root, int[] counter){

        if(root == null){
            return new Pair(0, 0);
        }

        Pair<Integer, Integer> left = findAverageFromPair(root.left, counter);
        Pair<Integer, Integer> right = findAverageFromPair(root.right, counter);

        int sum = left.getKey() + right.getKey() + root.val;
        int count = left.getValue() + right.getValue() + 1;

        if(sum/count == root.val){
            counter[0] += 1;
        }

        return new Pair(sum, count);
    }


    public int averageOfSubtree(TreeNode root) {
        
        int[] counter = new int[1];
        findAverageFromPair(root, counter);

        //findAverage(root, counter);

        return counter[0];
    }
}
