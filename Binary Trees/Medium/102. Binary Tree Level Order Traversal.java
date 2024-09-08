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

    public void levelOrderTraversal(TreeNode root, int level, List<List<Integer>> list){

        if(root == null){
            return;
        }

        if(level == list.size()){
            list.add(new ArrayList<>());
        }
        
        list.get(level).add(root.val);
        levelOrderTraversal(root.left, level+1, list);
        levelOrderTraversal(root.right, level+1, list);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root == null){
            return new ArrayList<>();
        }
        
        List<List<Integer>> list = new ArrayList<>();

        levelOrderTraversal(root, 0, list);

        return list;







        // List<List<Integer>> list = new ArrayList<>();
        // Queue<TreeNode> queue = new LinkedList<>();

        // if(root == null){
        //     return new ArrayList<>();
        // }
        // queue.add(root);

        // while(!queue.isEmpty()){
        //     int size = queue.size();
        //     List<Integer> temp = new ArrayList<>();
        //     while(size > 0){
        //         TreeNode curr = queue.poll();
        //         temp.add(curr.val);
        //         if(curr.left != null){
        //             queue.add(curr.left);
        //         }
        //         if(curr.right != null){
        //             queue.add(curr.right);
        //         }
        //         size--;
        //     }
        //     list.add(temp);
        // }

        // return list;
    }
}
