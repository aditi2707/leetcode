class Solution {
    public int findCenter(int[][] edges) {

        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        } else {
            return edges[0][1];
        }


        

        // List<List<Integer>> adjList = new ArrayList<>();
        // int vertex = 0;

        // for(int i = 0; i < edges.length + 1; i++){
        //     adjList.add(new ArrayList<>());
        // }

        // for(int i = 0; i < edges.length; i++){
        //     adjList.get(edges[i][0] - 1).add(edges[i][1] - 1);
        //     adjList.get(edges[i][1] - 1).add(edges[i][0] - 1);

        //     if(adjList.get(edges[i][0] - 1).size() == edges.length){
        //         return edges[i][0];
        //     }
        //     if(adjList.get(edges[i][1] - 1).size() == edges.length){
        //         return edges[i][1];
        //     }
        // }

        // return -1;





        
        
        // HashMap<Integer, List<Integer>> vertices = new HashMap<>();

        // for(int i = 0; i < edges.length; i++){
        //     if(!vertices.containsKey(edges[i][0])){
        //         vertices.put(edges[i][0], new ArrayList<>());
        //     }
        //     vertices.get(edges[i][0]).add(edges[i][1]);
            

        //     if(!vertices.containsKey(edges[i][1])){
        //         vertices.put(edges[i][1], new ArrayList<>());
        //     }
        //     vertices.get(edges[i][1]).add(edges[i][0]);

        // }

        // for(Integer i: vertices.keySet()){
        //     if(vertices.get(i).size() == edges.length){
        //         return i;
        //     }
        // }

        // return -1;
    }
}
