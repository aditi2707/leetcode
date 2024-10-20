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

    public boolean findPair(TreeNode root, int k, Set<Integer> set){
        
        if(root == null){
            return false;
        }

        if(set.contains(k - root.val)){
            return true;
        }
        set.add(root.val);

        return findPair(root.left, k, set) || findPair(root.right, k, set);
    }

    public void inorder(TreeNode root, List<Integer> arr){

        if(root != null){
            inorder(root.left, arr);
            arr.add(root.val);
            inorder(root.right, arr);
        }
    }

    public boolean findTarget(TreeNode root, int k) {

        // Set<Integer> set = new HashSet<>();

        // return findPair(root, k, set);



        
        List<Integer> arr = new ArrayList<>();

        inorder(root, arr);

        int i = 0, j = arr.size()-1;

        while(i < j){
            if(arr.get(i) + arr.get(j) > k){
                j--;
            }
            else if(arr.get(i) + arr.get(j) < k){
                i++;
            }
            else{
                return true;
            }
        }

        return false;
    }
}
