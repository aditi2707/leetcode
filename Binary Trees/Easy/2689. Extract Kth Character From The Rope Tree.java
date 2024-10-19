/**
 * Definition for a rope tree node.
 * class RopeTreeNode {
 *     int len;
 *     String val;
 *     RopeTreeNode left;
 *     RopeTreeNode right;
 *     RopeTreeNode() {}
 *     RopeTreeNode(String val) {
 *         this.len = 0;
 *         this.val = val;
 *     }
 *     RopeTreeNode(int len) {
 *         this.len = len;
 *         this.val = "";
 *     }
 *     RopeTreeNode(int len, RopeTreeNode left, RopeTreeNode right) {
 *         this.len = len;
 *         this.val = "";
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    String ans = "";

    public void inOrder(RopeTreeNode root){

        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            ans += root.val;
        }

        inOrder(root.left);
        inOrder(root.right);
    }



    // public void inOrder(RopeTreeNode root, List<String> s){

    //     if(root == null){
    //         return;
    //     }

    //     if(root.left == null && root.right == null){
    //         s.add(root.val);
    //     }

    //     inOrder(root.left, s);
    //     inOrder(root.right, s);
    // }

    public char getKthCharacter(RopeTreeNode root, int k) {

        inOrder(root);

        return ans.charAt(k - 1);





        
        // List<String> s = new ArrayList<>();
        // inOrder(root, s);

        // if(s.size() == 0){
        //     return ' ';
        // }

        // String ans = "";

        // for(String str: s){
        //     ans += str;
        // }

        // return ans.charAt(k - 1);
    }
}
