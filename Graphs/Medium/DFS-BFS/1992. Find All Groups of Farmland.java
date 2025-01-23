class Solution {

    private void bfs(int[][] land, int[][] visited, int m, int n, int[] arr){

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{m, n});
        visited[m][n] = 1;

        while(!queue.isEmpty()){

            int[] poll = queue.poll();
            int i = poll[0];
            int j = poll[1];
            arr[0] = i;
            arr[1] = j;

            if(i + 1 < land.length){
                if(land[i + 1][j] == 1 && visited[i + 1][j] == 0){
                    queue.add(new int[]{i + 1, j});
                    visited[i + 1][j] = 1;
                }
            }
            if(j + 1 < land[0].length){
                if(land[i][j + 1] == 1 && visited[i][j + 1] == 0){
                    queue.add(new int[]{i, j + 1});
                    visited[i][j + 1] = 1;
                }
            }
        }

        return;
    }

    private void dfs(int[][] land, int[][] visited, int m, int n, int[] arr){

        if(m < 0 || m >= land.length){
            return;
        }
        if(n < 0 || n >= land[0].length){
            return;
        }

        if(visited[m][n] == 1 || land[m][n] == 0){
            return;
        }

        visited[m][n] = 1;

        if(m > arr[0] || n > arr[1]){
            arr[0] = m;
            arr[1] = n;
        }
        
        dfs(land, visited, m, n + 1, arr);
        dfs(land, visited, m + 1, n, arr);
        
        return;
    }
    public int[][] findFarmland(int[][] land) {
        
        List<List<Integer>> list = new ArrayList<>();
        int[][] visited = new int[land.length][land[0].length];

        for(int i = 0; i < land.length; i++){
            for(int j = 0; j < land[0].length; j++){
                if(land[i][j] == 1 && visited[i][j] == 0){
                    int[] arr = new int[2];

                    bfs(land, visited, i, j, arr);
                    // dfs(land, visited, i, j, arr);


                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    temp.add(arr[0]);
                    temp.add(arr[1]);

                    list.add(temp);
                }
            }
        }

        int[][] ans = new int[list.size()][4];
        int k = 0;

        for(List<Integer> l: list){
            ans[k][0] = l.get(0);
            ans[k][1] = l.get(1);
            ans[k][2] = l.get(2);
            ans[k][3] = l.get(3);

            k++;
        }

        return ans;
    }
}
