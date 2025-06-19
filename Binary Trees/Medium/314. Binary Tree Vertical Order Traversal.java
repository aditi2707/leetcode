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

    public List<List<Integer>> verticalOrder(TreeNode root) {

        // Time Complexity : O(n + width)

        // Space Complexity : O(n + width)
        

        if(root == null){
            return new ArrayList<>();
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        int min = 0;
        int max = 0;

        queue.add(new Pair<>(root, 0));
        
        while(!queue.isEmpty()){
            Pair<TreeNode, Integer> poll = queue.poll();
            TreeNode curr = poll.getKey();
            int col = poll.getValue();

            if(!map.containsKey(col)){
                map.put(col, new ArrayList<>());
            }
            map.get(col).add(curr.val);

            if(curr.left != null){
                queue.add(new Pair<>(curr.left, col - 1));
                min = Math.min(min, col - 1);
            }
            if(curr.right != null){
                queue.add(new Pair<>(curr.right, col + 1));
                max = Math.max(max, col + 1);
            }
        }

        for(int i = min; i <= max; i++){
            ans.add(map.get(i));
        }

        return ans;
    }
}
