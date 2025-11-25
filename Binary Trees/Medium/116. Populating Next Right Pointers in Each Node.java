/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        

        if(root == null){
            return null;
        }

        Node curr = root;

        while(curr.left != null){
            Node head = curr;

            while(head != null){
                head.left.next = head.right;
                
                if(head.next != null){
                    head.right.next = head.next.left;
                }

                head = head.next;
            }

            curr = curr.left;
        }

        return root;



        // // Time Complexity : O(n)

        // // Space Complexity : O(n / 2) (perfect binary tree has n/2 leaf nodes)


        // if(root == null){
        //     return null;
        // }
        
        // Queue<Node> queue = new LinkedList<>();
        // queue.add(root);

        // while(!queue.isEmpty()){
        //     int size = queue.size();

        //     while(size > 0){
        //         Node curr = queue.poll();
        //         if(!queue.isEmpty() && size > 1){
        //             curr.next = queue.peek();
        //         }
        //         if(curr.left != null){
        //             queue.add(curr.left);
                    
        //         }
        //         if(curr.right != null){
        //             queue.add(curr.right);
                    
        //         }
        //         size--;
        //     }
            
        // }

        // return root;







        // // Time Complexity : O(n + n)

        // // Space Complexity : O((n / 2) + n) (perfect binary tree has n/2 nodes)


        // if(root == null){
        //     return null;
        // }
        
        // Queue<Node> queue = new LinkedList<>();
        // Queue<Node> tempQueue = new LinkedList<>();
        // queue.add(root);
        // tempQueue.add(root);
        // tempQueue.add(new Node(1001));

        // while(!queue.isEmpty()){
        //     int size = queue.size();

        //     while(size > 0){
        //         Node curr = queue.poll();
        //         if(curr.left != null){
        //             queue.add(curr.left);
        //             tempQueue.add(curr.left);
        //         }
        //         if(curr.right != null){
        //             queue.add(curr.right);
        //             tempQueue.add(curr.right);
        //         }
        //         size--;
        //     }
        //     tempQueue.add(new Node(1001));
        // }

        // while(!tempQueue.isEmpty()){
        //     while(tempQueue.peek().val != 1001){
        //         Node curr = tempQueue.poll();
        //         if(tempQueue.peek().val != 1001){
        //             curr.next = tempQueue.peek();
        //         }
        //         else{
        //             curr.next = null;
        //         }
                
        //     }

        //     if(tempQueue.peek().val == 1001){
        //         tempQueue.poll();
        //     }
        // }
        

        // return root;

    }
}
