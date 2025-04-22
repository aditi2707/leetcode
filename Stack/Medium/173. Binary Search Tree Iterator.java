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

    TreeNode root;
    Stack<TreeNode> stack;

    private void dfs(TreeNode r){

        // Time Complexity : O(height)

        // Space Complexity : O(height)

        
        TreeNode curr = r;
        while(curr.left != null){
            stack.push(curr.left);
            curr = curr.left;
        }

        return;
    }

    public BSTIterator(TreeNode root) {

        this.root = root;
        stack = new Stack<>();

        stack.push(root);
        dfs(root);
    }

    public int next() {
        
        TreeNode pop = stack.pop();
        if(pop.right != null){
            stack.push(pop.right);
            dfs(pop.right);
        }

        return pop.val;
    }
    
    public boolean hasNext() {
        
        return !stack.isEmpty();
    }
}




// class BSTIterator {

//     // List<Integer> inOrder;

//     TreeNode root;
//     Stack<TreeNode> stack = new Stack<>();

//     public void BSTStack(TreeNode root){

//         while(root != null){
//             stack.push(root);
//             root = root.left;
//         }
//     }

//     // public void BSTInorder(TreeNode root){
//     //     if(root != null){
//     //         BSTInorder(root.left);
//     //         inOrder.add(root.val);
//     //         BSTInorder(root.right);
//     //     }
//     // }

//     public BSTIterator(TreeNode root) {

//         this.root = root;
//         BSTStack(root);

//         // this.root = root;
//         // inOrder = new ArrayList<>();
//         // BSTInorder(root);
//     }
    
//     public int next() {

//         TreeNode nextSmallest = stack.pop();

//         if(nextSmallest.right != null){
//             BSTStack(nextSmallest.right);
//         }

//         return nextSmallest.val;
        

//         // if(inOrder.size() != 0){
//         //     int num = inOrder.get(0);
//         //     inOrder.remove(0);
//         //     return num;
//         // }

//         // return -1;
//     }
    
//     public boolean hasNext() {

//         if(!stack.isEmpty()){
//             return true;
//         }

//         return false;


        
//         // if(inOrder.size() != 0){
//         //     return true;
//         // }

//         // return false;
//     }
// }

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
