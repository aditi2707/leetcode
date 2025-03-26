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

    private void narylevelorderDFS(Node root, List<List<Integer>> ans, int level){

        if(root == null){
            return;
        }

        if(ans.size() == level){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(root.val);

        for(Node child: root.children){
            narylevelorderDFS(child, ans, level + 1);
        }

        return;
    }


    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> ans = new ArrayList<>();

        narylevelorderDFS(root, ans, 0);

        return ans;





        
        // List<List<Integer>> ans = new ArrayList<>();
        // Queue<Node> queue = new LinkedList<>();

        // if(root == null){
        //     return ans;
        // }

        // queue.add(root);

        // while(!queue.isEmpty()){

        //     int size = queue.size();
        //     List<Integer> list = new ArrayList<>();

        //     while(size > 0){
        //         Node curr = queue.poll();
        //         list.add(curr.val);

        //         for(Node child: curr.children){
        //             if(child != null){
        //                 queue.add(child);
        //             }
        //         }

        //         size--;
        //     }

        //     ans.add(list);
        // }

        // return ans;
    }
}
