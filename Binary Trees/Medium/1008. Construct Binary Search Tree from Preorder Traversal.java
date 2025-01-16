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

    int index = 0;

    public TreeNode preOrder(int[] preorder, int lower, int upper){
        if(index == preorder.length){
            return null;
        }

        int val = preorder[index];

        if(val < lower || val > upper){
            return null;
        }
        index++;
        TreeNode root = new TreeNode(val);

        root.left = preOrder(preorder, lower, val);
        root.right = preOrder(preorder, val, upper);

        return root;
    }

    // public TreeNode preOrder(int[] preorder, int m, int n, HashMap<Integer, Integer> map){

    //     if(m == n){
    //         return null;
    //     }

    //     TreeNode root = new TreeNode(preorder[index]);

    //     int mid = map.get(root.val);

    //     index++;

    //     root.left = preOrder(preorder, m, mid, map);
    //     root.right = preOrder(preorder, mid+1, n, map);

    //     return root;
    // }

    public TreeNode bstFromPreorder(int[] preorder) {

        return preOrder(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);

        
        // int[] inorder = Arrays.copyOf(preorder, preorder.length);
        // Arrays.sort(inorder);

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < inorder.length; i++){
        //     map.put(inorder[i], i);
        // }

        // TreeNode root = preOrder(preorder, 0, inorder.length, map);

        // return root;
    }
}
