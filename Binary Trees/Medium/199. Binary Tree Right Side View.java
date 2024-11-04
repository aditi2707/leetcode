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

    public void findRightSide(TreeNode root, List<Integer> ans, int k){

        if(root == null){
            return;
        }

        if(ans.size() == k){
            ans.add(root.val);
        }

        findRightSide(root.right, ans, k+1);
        findRightSide(root.left, ans, k+1);
    }

    

    public List<Integer> rightSideView(TreeNode root) {
        
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        ans.add(root.val);

        while(!queue.isEmpty()){
            int size = queue.size();
            int last = -101;

            while(size > 0){
                TreeNode curr = queue.poll();

                if(curr.left != null){
                    queue.add(curr.left);
                    last = curr.left.val;
                }
                if(curr.right != null){
                    queue.add(curr.right);
                    last = curr.right.val;
                }

                size--;
            }

            if(last != -101){
                ans.add(last);
            }
        }

        return ans;






        // if(root == null){
        //     return new ArrayList<>();
        // }

        // List<Integer> ans = new ArrayList<>();

        // findRightSide(root, ans, 0);

        // return ans;
    }
}
