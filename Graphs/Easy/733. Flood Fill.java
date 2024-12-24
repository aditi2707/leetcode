class Solution {

    private void dfs(int[][] image, int i, int j, int old, int neu, int[][] visited){
        
        if(i >= image.length || i < 0){
            return;
        }
        if(j >= image[0].length || j < 0){
            return;
        }
        
        if(image[i][j] != old || visited[i][j] == 1){
            return;
        }
        
        visited[i][j] = 1;
        
        if(image[i][j] == old){
            image[i][j] = neu;
        }
        
        dfs(image, i + 1, j, old, neu, visited);
        dfs(image, i - 1, j, old, neu, visited);
        dfs(image, i, j + 1, old, neu, visited);
        dfs(image, i, j - 1, old, neu, visited);
        
        return;
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldColor = image[sr][sc];
        int[][] visited = new int[image.length][image[0].length];

        
        dfs(image, sr, sc, oldColor, color, visited);
        
        return image;
    }
}
