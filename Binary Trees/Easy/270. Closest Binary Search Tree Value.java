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

    public void inorder(TreeNode root, List<Integer> arr){

        if(root != null){
            inorder(root.left, arr);
            arr.add(root.val);
            inorder(root.right, arr);
        }
    }

    public int closestValue(TreeNode root, double target) {
        
        List<Integer> arr = new ArrayList<>();

        inorder(root, arr);

        int low = 0, high = arr.size()-1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr.get(mid) <= target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(high < 0){
            return arr.get(low);
        }
        if(low >= arr.size()){
            return arr.get(high);
        }

        return arr.get(low) - target >= target - arr.get(high)? arr.get(high) : arr.get(low);
    }
}
