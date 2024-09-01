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

    public int findHeight(TreeNode root){

        if(root == null){
            return 0;
        }
        return 1 + Math.max(findHeight(root.left), findHeight(root.right));
    }


    public int findSum(TreeNode root, int k){

        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null && k == 0){
            return root.val;
        }
        int left = findSum(root.left, k-1);
        int right = findSum(root.right, k-1);

        return left + right;
    }
    

    public int deepestLeavesSum(TreeNode root) {

        int height = findHeight(root);
        
        return findSum(root, height-1);
        
        // Queue<TreeNode> queue = new LinkedList<>();
        // int sum = 0;
        // //ArrayList<Integer> list = new ArrayList<>();

        // queue.add(root);

        // while(!queue.isEmpty()){
        //     int i = 0;
        //     int size = queue.size();
        //     int s = 0;
        //     while(i < size){
        //         TreeNode curr = queue.poll();
        //         s += curr.val;

        //         if(curr.left != null){
        //             queue.add(curr.left);
        //         }
        //         if(curr.right != null){
        //             queue.add(curr.right);
        //         }
        //         i++;
        //     }
        //     //list.add(s);
        //     sum = s;
        // }

        // //return list.get(list.size()-1);
        // return sum;







        // int[] depth = new int[1];
        // depth[0] = findHeight(root);
        // Queue<TreeNode> queue = new LinkedList<>();
        // int sum = 0;

        // queue.add(root);
        // int level = 1;

        // while(!queue.isEmpty()){
        //     int i = 0;
        //     int size = queue.size();

        //     while(i < size){
        //         TreeNode curr = queue.poll();

        //         if(level == depth[0]){
        //             sum += curr.val;
        //         }
            
        //         if(curr.left != null){
        //             queue.add(curr.left);
        //         }
        //         if(curr.right != null){
        //             queue.add(curr.right);
        //         }
        //         i++;
        //     }
        //     level++;
        // }

        // return sum;











        // int[] depth = new int[1];
        // Queue<TreeNode> queue = new LinkedList<>();
        // int sum = 0;

        // queue.add(root);

        // while(!queue.isEmpty()){
        //     int i = 0;
        //     int size = queue.size();
        //     while(i < size){
        //         TreeNode curr = queue.poll();
            
        //         if(curr.left != null){
        //             queue.add(curr.left);
        //         }
        //         if(curr.right != null){
        //             queue.add(curr.right);
        //         }
        //         i++;
        //     }
        //     depth[0] += 1;
        // }

        // queue.add(root);
        // int level = 1;

        // while(!queue.isEmpty()){
        //     int i = 0;
        //     int size = queue.size();

        //     while(i < size){
        //         TreeNode curr = queue.poll();

        //         if(level == depth[0]){
        //             sum += curr.val;
        //         }
            
        //         if(curr.left != null){
        //             queue.add(curr.left);
        //         }
        //         if(curr.right != null){
        //             queue.add(curr.right);
        //         }
        //         i++;
        //     }
        //     level++;
        // }

        // return sum;
    }
}
