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
class FindElements {

    Set<Integer> set;

    public void preorder(TreeNode root){

        if(root == null){
            return;
        }

        if(root.left != null){
            root.left.val = root.val * 2 + 1;
            set.add(root.left.val);
        }
        if(root.right != null){
            root.right.val = root.val * 2 + 2;
            set.add(root.right.val);
        }

        preorder(root.left);
        preorder(root.right);
    }

    public boolean findTarget(TreeNode root, int target){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();

            if(curr.val == target){
                return true;
            }

            if(curr.left != null){
                queue.add(curr.left);
            }
            if(curr.right != null){
                queue.add(curr.right);
            }
        }

        return false;

        // if(root == null){
        //     return false;
        // }

        // if(root.val == target){
        //     return true;
        // }

        // return findTarget(root.left, target) || findTarget(root.right, target);
    }

    public FindElements(TreeNode root) {
        
        set = new HashSet<>();
        root.val = 0;
        set.add(0);

        preorder(root);
    }
    
    public boolean find(int target) {

        return set.contains(target);
        
        // return findTarget(rootNode, target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
