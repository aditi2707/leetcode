class Solution {

    private void dfs(List<List<Integer>> rooms, int[] visited, int source, 
    int[] count){

        visited[source] = 1;
        count[0]++;

        for(Integer i: rooms.get(source)){
            if(visited[i] == 0){
                dfs(rooms, visited, i, count);
            }
        }

        return;
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int[] visited = new int[rooms.size()];
        int[] count = {0};

        dfs(rooms, visited, 0, count);

        return count[0] == rooms.size()? true : false;

        // for(int i = 0; i < visited.length; i++){
        //     if(visited[i] == 0){
        //         return false;
        //     }
        // }

        // return true;
    }
}
