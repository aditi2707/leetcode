class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        // Time Complexity : O((V ^ 2) + E + (V ^ 3) + (V ^ 2))

        // Space Complexity : O((V ^ 2))

        
        int[][] adjMatrix = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j){
                    adjMatrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        for(int[] i: edges){
            int u = i[0];
            int v = i[1];

            adjMatrix[u][v] = i[2];
            adjMatrix[v][u] = i[2];
        }

        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(adjMatrix[i][k] != Integer.MAX_VALUE && 
                    adjMatrix[k][j] != Integer.MAX_VALUE){
                        adjMatrix[i][j] = Math.min(adjMatrix[i][j], 
                        adjMatrix[i][k] + adjMatrix[k][j]);
                    }
                }
            }
        }

        int minCount = n;
        int maxVertex = 0;

        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(adjMatrix[i][j] <= distanceThreshold){
                    count++;
                }
            }
            if(count < minCount){
                minCount = count;
                maxVertex = i;
            }
            else if(count == minCount){
                maxVertex = Math.max(maxVertex, i);
            }
        }

        return maxVertex;
    }
}
