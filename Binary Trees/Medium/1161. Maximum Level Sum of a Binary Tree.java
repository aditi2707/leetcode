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

    public void findMaxSum(TreeNode root, int level, List<Integer> list){

        if(root == null){
            return;
        }
        if(level == list.size()){
            list.add(0);
        }

        if(list.get(level) == 0){
            list.set(level, root.val);
        }
        else{
            list.set(level, list.get(level)+root.val);
        }

        findMaxSum(root.left, level+1, list);
        findMaxSum(root.right, level+1, list);
    }

    public int maxLevelSum(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();

        findMaxSum(root, 0, list);

        int max = Integer.MIN_VALUE;
        int maxInd = 0;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
                maxInd = i;
            }
        }

        return maxInd+1;






        // int max = Integer.MIN_VALUE;
        // int maxLevel = 1;
        // Queue<TreeNode> queue = new LinkedList<>();

        // if(root == null){
        //     return 0;
        // }
        // queue.add(root);
        // int level = 1;

        // while(!queue.isEmpty()){

        //     int size = queue.size();
        //     int sum = 0;
        //     while(size > 0){
        //         TreeNode curr = queue.poll();
        //         sum += curr.val;

        //         if(curr.left != null){
        //             queue.add(curr.left);
        //         }
        //         if(curr.right != null){
        //             queue.add(curr.right);
        //         }
        //         size--;
        //     }
        //     if(sum > max){
        //         max = sum;
        //         maxLevel = level;
        //     }
        //     level++;
        // }

        // return maxLevel;
    }
}
