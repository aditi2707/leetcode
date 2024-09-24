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
class BSTIterator {

    // List<Integer> inOrder;

    TreeNode root;
    Stack<TreeNode> stack = new Stack<>();

    public void BSTStack(TreeNode root){

        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }

    // public void BSTInorder(TreeNode root){
    //     if(root != null){
    //         BSTInorder(root.left);
    //         inOrder.add(root.val);
    //         BSTInorder(root.right);
    //     }
    // }

    public BSTIterator(TreeNode root) {

        this.root = root;
        BSTStack(root);

        // this.root = root;
        // inOrder = new ArrayList<>();
        // BSTInorder(root);
    }
    
    public int next() {

        TreeNode nextSmallest = stack.pop();

        if(nextSmallest.right != null){
            BSTStack(nextSmallest.right);
        }

        return nextSmallest.val;
        

        // if(inOrder.size() != 0){
        //     int num = inOrder.get(0);
        //     inOrder.remove(0);
        //     return num;
        // }

        // return -1;
    }
    
    public boolean hasNext() {

        if(!stack.isEmpty()){
            return true;
        }

        return false;


        
        // if(inOrder.size() != 0){
        //     return true;
        // }

        // return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
