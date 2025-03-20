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

    private void backtracking(TreeNode root, List<List<Integer>> ans, 
    List<Integer> temp, int target){

        if(root == null){
            return;
        }

        temp.add(root.val);

        if(root.left == null && root.right == null){
            if(target == root.val){
                ans.add(new ArrayList<>(temp));
            }
            temp.remove(temp.size() - 1);
            return;
        }

        backtracking(root.left, ans, temp, target - root.val);
        backtracking(root.right, ans, temp, target - root.val);

        temp.remove(temp.size() - 1);

        return;
    }


    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        // Time Complexity : O(n * n).
        // If the tree is a complete binary tree, the time takem will be equal to the
        // height of the tree. But in the worst case, when the tree is completely
        // skewed, then time taken will be equal to the total # of nodes i.e. n.
        // If we consider copying the values in a list, then it would take O(n) time
        // (although adding takes O(1) TC but removing it will take O(n) TC).

        // Space Complexity : O(n * n).
        // If the tree is completely skewed, then at one point, all the nodes will
        // be in the recursion stack, so that makes SC = O(n). Now if we consider the
        // space taken by the temp array at each function call, then that would also 
        // be O(n) at that point. Hence SC in the worst case is O(n * n).
        
        
        List<List<Integer>> ans = new ArrayList<>();

        backtracking(root, ans, new ArrayList<>(), targetSum);

        return ans;
    }
}
