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
class CBTInserter {

    TreeNode root;
    Queue<TreeNode> queue = new LinkedList<>();

    public CBTInserter(TreeNode root) {
        this.root = root;
        Queue<TreeNode> rootQueue = new LinkedList<>();
        rootQueue.add(root);
        

        while(!rootQueue.isEmpty()){
            TreeNode curr = rootQueue.poll();

            if(curr.left == null || curr.right == null){
                queue.add(curr);
            }
            if(curr.left != null){
                rootQueue.add(curr.left);
            }
            if(curr.right != null){
                rootQueue.add(curr.right);
            }
        }

    }
    
    public int insert(int val) {

        TreeNode parent = queue.peek();
        TreeNode newNode = new TreeNode(val);

        if(parent.left == null){
            parent.left = newNode;
        }
        else{
            parent.right = newNode;
            queue.poll();
        }

        queue.add(newNode);

        return parent.val;


        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);

        // while(!queue.isEmpty()){
        //     TreeNode curr = queue.poll();

        //     if(curr.left != null){
        //         queue.add(curr.left);
        //     }
        //     else{
        //         curr.left = new TreeNode(val);
        //         return curr.val;
        //     }
        //     if(curr.right != null){
        //         queue.add(curr.right);
        //     }
        //     else{
        //         curr.right = new TreeNode(val);
        //         return curr.val;
        //     }
        // }

        // return -1;
    }
    
    public TreeNode get_root() {
        
        return root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */
