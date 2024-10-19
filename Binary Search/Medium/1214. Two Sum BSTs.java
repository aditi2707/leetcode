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

    public boolean findSum(TreeNode root, int k){

        if(root == null){
            return false;
        }

        if(root.val < k){
            return findSum(root.right, k);
        }
        else if(root.val > k){
            return findSum(root.left, k);
        }

        return true;
    }

    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        
        if(root1 == null){
            return false;
        }

        if(findSum(root2, target - root1.val)){
            return true;
        }

        return twoSumBSTs(root1.left, root2, target) || twoSumBSTs(root1.right, root2, target);
    }
}





// class Solution {

//     public void inOrder1(TreeNode root, List<Integer> arr){

//         if(root != null){
//             inOrder1(root.left, arr);
//             arr.add(root.val);
//             inOrder1(root.right, arr);
//         }
//     }

//     public boolean inOrder2(TreeNode root, List<Integer> arr, int target){

//         if(root == null){
//             return false;
//         }

//         return arr.contains(target - root.val)? true : inOrder2(root.left, arr, target) || inOrder2(root.right, arr, target);
//     }

//     public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        
//         List<Integer> arr = new ArrayList<>();

//         inOrder1(root1, arr);

//         if(inOrder2(root2, arr, target)){
//             return true;
//         }

//         return false;
//     }
// }
