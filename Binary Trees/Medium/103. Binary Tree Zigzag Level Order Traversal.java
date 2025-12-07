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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        // Time Complexity : O(n)

        // Space Complexity : O((n / 2) * 2)

        
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        LinkedList<Integer> level = new LinkedList<>();
        queue.add(root);
        boolean zigZag = false;

        while(!queue.isEmpty()){
            int size = queue.size();
            while(size > 0){
                TreeNode curr = queue.poll();
                if(!zigZag){
                    level.addLast(curr.val);
                }
                else{
                    level.addFirst(curr.val);
                }
                if(curr.left != null){
                        queue.add(curr.left);
                    }
                    if(curr.right != null){
                        queue.add(curr.right);
                    }
                size--;
            }

            ans.add(level);
            level = new LinkedList<>();
            
            if(!zigZag){
                zigZag = true;
            }
            else{
                zigZag = false;
            }
        }

        return ans;






        // // Time Complexity : O(n * n)

        // // Space Complexity : O((n / 2) * 2)

        
        // List<List<Integer>> ans = new ArrayList<>();

        // if(root == null){
        //     return ans;
        // }

        // Queue<TreeNode> queue = new LinkedList<>();
        // Deque<Integer> deque = new ArrayDeque<>();
        // queue.add(root);
        // boolean zigZag = false;

        // while(!queue.isEmpty()){
        //     int size = queue.size();
        //     while(size > 0){
        //         TreeNode curr = queue.poll();
        //         if(!zigZag){
        //             deque.addLast(curr.val);
        //         }
        //         else{
        //             deque.addFirst(curr.val);
        //         }
        //         if(curr.left != null){
        //                 queue.add(curr.left);
        //             }
        //             if(curr.right != null){
        //                 queue.add(curr.right);
        //             }
        //         size--;
        //     }

        //     ans.add(new ArrayList<>(deque));
        //     deque.clear();
            
        //     if(!zigZag){
        //         zigZag = true;
        //     }
        //     else{
        //         zigZag = false;
        //     }
        // }

        // return ans;
    }
}
