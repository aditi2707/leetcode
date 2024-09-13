class Solution {
    public int findChampion(int n, int[][] edges) {
        
        int[] list = new int[n];
        int champion = -1;

        for(int i = 0; i < edges.length; i++){
            list[edges[i][1]]++;
        }

        for(int i = 0; i < n; i++){
            if(list[i] == 0 && champion == -1){
                champion = i;
            }
            else if(list[i] == 0 && champion != -1){
                return -1;
            }
        }

        return champion;
    }
}
