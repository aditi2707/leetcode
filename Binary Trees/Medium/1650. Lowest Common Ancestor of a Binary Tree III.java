/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {

    private int findLevel(Node t){
        int level = 0;
        while(t != null){
            level++;
            t = t.parent;
        }

        return level;
    }

    private Node lca(Node p, Node q, Map<Node, Integer> map){

        if(p.parent == q){
            return q;
        }
        if(q.parent == p){
            return p;
        }
        if(p.parent == q.parent){
            return p.parent;
        }
        if(p.parent == null){
            return p;
        }
        if(q.parent == null){
            return q;
        }

        if(map.get(p) > map.get(q)){
            if(!map.containsKey(p.parent)){
                map.put(p.parent, map.get(p) - 1);
            }
            return lca(p.parent, q, map);
        }

        if(!map.containsKey(q.parent)){
            map.put(q.parent, map.get(q) - 1);
        }

        return lca(p, q.parent, map);
    }


    public Node lowestCommonAncestor(Node p, Node q) {

        // Time Complexity : O(height + height + height)

        // Space Complexity : O(1)


        int pLevel = findLevel(p);
        int qLevel = findLevel(q);

        while(pLevel > qLevel){
            pLevel--;
            p = p.parent;
        }

        while(qLevel > pLevel){
            qLevel--;
            q = q.parent;
        }

        while(p != q){
            p = p.parent;
            q = q.parent;
        }

        return p;

        
        

        // // Time Complexity : O(height + height + height)

        // // Space Complexity : O(height + height) (if recursion stack is considered)
        // // The map will increase in size as new nodes are added.


        // Map<Node, Integer> map = new HashMap<>();

        // Node tempP = p;
        // Node tempQ = q;
        // int count = 0;

        // while(tempP != null){
        //     count++;
        //     tempP = tempP.parent;
        // }

        // map.put(p, count);
        // count = 0;

        // while(tempQ != null){
        //     count++;
        //     tempQ = tempQ.parent;
        // }

        // map.put(q, count);

        // return lca(p, q, map);
    }
}
