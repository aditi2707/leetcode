class Solution {

    private int find(int[] parent, int a){

        if(parent[a] == a){
            return a;
        }

        return parent[a] = find(parent, parent[a]);
    }

    private void union(int[] rank, int[] parent, int ult_u, int ult_v){

        if(rank[ult_u] == rank[ult_v]){
            parent[ult_v] = ult_u;
            rank[ult_u]++;
        }
        else if(rank[ult_u] < rank[ult_v]){
            parent[ult_u] = ult_v;
        }
        else{
            parent[ult_v] = ult_u;
        }

        return;
    }


    public int makeConnected(int n, int[][] connections) {

        
        int[] rank = new int[n];
        int[] parent = new int[n];
        int extraEdge = 0;
        int components = 0;

        for(int i = 0; i < n; i++){
            parent[i] = i;
        }

        for(int[] i: connections){
            int u = i[0];
            int v = i[1];

            int ult_u = find(parent, u);
            int ult_v = find(parent, v);

            if(ult_u == ult_v){
                extraEdge++;
            }
            else{
                union(rank, parent, ult_u, ult_v);
            }
        }

        for(int i = 0; i < parent.length; i++){
            if(parent[i] == i){
                components++;
            }
        }

        return extraEdge >= components - 1? components - 1 : -1;
    }
}
