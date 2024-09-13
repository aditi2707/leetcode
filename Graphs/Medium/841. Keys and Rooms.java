class Solution {

    public void dfs(int source, int[] visited, List<List<Integer>> rooms){

        visited[source] = 1;

        for(int i = 0; i < rooms.get(source).size(); i++){
            if(visited[rooms.get(source).get(i)] == 0){
                visited[rooms.get(source).get(i)] = 1;
                dfs(rooms.get(source).get(i), visited, rooms);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int[] visited = new int[rooms.size()];

        dfs(0, visited, rooms);

        for(Integer i: visited){
            if(i == 0){
                return false;
            }
        }

        return true;
    }
}
