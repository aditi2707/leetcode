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

    private void levelorderDFS(TreeNode root, List<List<Integer>> ans, int level){

        if(root == null){
            return;
        }

        if(ans.size() == level){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(root.val);

        levelorderDFS(root.left, ans, level + 1);
        levelorderDFS(root.right, ans, level + 1);

        return;
    }


    public List<List<Integer>> levelOrder(TreeNode root) {

        // Time Complexity : O(n), where n is the number of nodes.
        // The function will traverse the nodes exactly once, which makes the TC 
        // equal to O(n).

        // Space Complexity : O(height + n)
        // At any time, the worst SC will be equal to the maximum height of the tree
        // stored in the recursion stack as in DFS, the function will 
        // travel through the height of the binary tree. The output array will have 
        // every node in total, so it has a SC of O(n).


        List<List<Integer>> ans = new ArrayList<>();

        levelorderDFS(root, ans, 0);

        return ans;




        // // Time Complexity : O(n), where n is the number of nodes.
        // // Each node will be traversed exactly once, so TC becomes O(n).

        // // Space Complexity : O(2^(d + 1) + n), where d is the depth of the 
        // // binary tree.
        // // The maximum a queue will store will be at the lowest depth of the 
        // // binary tree, if every node has two leaf nodes. The output array will 
        // // have every node in total, so it has a SC of O(n).

        
        // List<List<Integer>> ans = new ArrayList<>();
        // Queue<TreeNode> queue = new LinkedList<>();

        // if(root == null){
        //     return ans;
        // }

        // queue.add(root);

        // while(!queue.isEmpty()){

        //     int size = queue.size();
        //     List<Integer> list = new ArrayList<>();
        //     while(size > 0){
        //         TreeNode curr = queue.poll();
        //         list.add(curr.val);

        //         if(curr.left != null){
        //             queue.add(curr.left);
        //         }
        //         if(curr.right != null){
        //             queue.add(curr.right);
        //         }

        //         size--;
        //     }

        //     ans.add(list);
        // }

        // return ans;
    }
}
