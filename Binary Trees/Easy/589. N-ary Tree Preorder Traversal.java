/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    private void narypreorder(Node root, List<Integer> ans){

        if(root == null){
            return;
        }

        ans.add(root.val);

        for(Node child: root.children){
            narypreorder(child, ans);
        }

        return;
    }


    public List<Integer> preorder(Node root) {

        // Time Complexity : O(n) where n is the number of nodes.
        // There is no such pattern of the tree, so considering the worst case, 
        // each node has to be traversed exactly once, so TC will be equal to 
        // number of nodes.

        // Space Complexity : Either O(n + n) or O(height + n).
        // If we consider worse case separately (which will be when the tree is 
        // completely skewed), all the nodes will be present in the recursion 
        // stack. So, that makes SC = O(n).
        // But if we consider everything in terms of height, then SC will be equal to
        // height of the tree because in DFS, the maximum recursion stack can go is 
        // the maximum height of the tree.
        // The output array will have all the nodes, so its SC = O(n).
        
        
        List<Integer> ans = new ArrayList<>();

        narypreorder(root, ans);

        return ans;
    }
}
