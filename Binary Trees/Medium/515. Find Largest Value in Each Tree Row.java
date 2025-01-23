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

    private void dfs(TreeNode root, int level, List<Integer> list){

        if(root == null){
            return;
        }

        if(list.size() == level){
            list.add(root.val);
        }
        list.set(level, Math.max(list.get(level), root.val));

        dfs(root.left, level + 1, list);
        dfs(root.right, level + 1, list);
    }


    public List<Integer> largestValues(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        dfs(root, 0, list);

        return list;



        
        // Queue<TreeNode> queue = new LinkedList<>();
        // List<Integer> list = new ArrayList<>();

        // if(root == null){
        //     return list;
        // }

        // queue.add(root);

        // while(!queue.isEmpty()){
        //     int size = queue.size();
        //     int max = Integer.MIN_VALUE;

        //     while(size > 0){
        //         TreeNode curr = queue.poll();
        //         max = Math.max(max, curr.val);

        //         if(curr.left != null){
        //             queue.add(curr.left);
        //         }
        //         if(curr.right != null){
        //             queue.add(curr.right);
        //         }

        //         size--;
        //     }

        //     list.add(max);
        // }

        // return list;
    }
}
