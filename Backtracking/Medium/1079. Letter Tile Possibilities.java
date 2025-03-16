class Solution {

    Set<String> set = new HashSet<>();

    private void backtracking(String tiles, String temp, boolean[] visited){

        set.add(temp);
        
        for(int i = 0; i < tiles.length(); i++){
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            temp += tiles.charAt(i);
            backtracking(tiles, temp, visited);
            temp = temp.substring(0, temp.length() - 1);
            visited[i] = false;
        }

        return;
    }


    public int numTilePossibilities(String tiles) {

        // Time Complexity : O(n * n!).
        // In the first step, there are n possibilities to choose from. In the 
        // second step, the choices decrease by 1 and then by 2 and so on. So that
        // makes O(n!). For n characters, this would be O(n * n!).

        // Space Complexity : O(n + n * n!).
        // In the worst case, all the characters in the string are unique and so the
        // total strings stored in the set will be n * n!. Same for the recursion 
        // stack. The visited[] will be of the length of the string.
        
        
        boolean[] visited = new boolean[tiles.length()];

        backtracking(tiles, "", visited);

        return set.size() - 1;
    }
}
