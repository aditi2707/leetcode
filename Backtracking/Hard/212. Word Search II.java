class TrieNode{
    Map<Character, TrieNode> map;
    String word;
    
    public TrieNode(){
        map = new HashMap<>();
        word = null;
    }
}


class Solution {

    public void backtrack(TrieNode curr, char[][] board, int i, int j, int[][] visited, List<String> result){
        
        if(curr.word != null && !result.contains(curr.word)){
            result.add(curr.word);
        }
        
        if(i < 0 || i >= board.length){
            return;
        }
        if(j < 0 || j >= board[0].length){
            return;
        }
        if(visited[i][j] == 1){
            return;
        }
        if(!curr.map.containsKey(board[i][j])){
            return;
        }
        
        visited[i][j] = 1;
        
        backtrack(curr.map.get(board[i][j]), board, i+1, j, visited, result);
        backtrack(curr.map.get(board[i][j]), board, i, j+1, visited, result);
        backtrack(curr.map.get(board[i][j]), board, i-1, j, visited, result);
        backtrack(curr.map.get(board[i][j]), board, i, j-1, visited, result);
        
        visited[i][j] = 0;
    }

    public List<String> findWords(char[][] board, String[] words) {

        TrieNode root = new TrieNode();
        int[][] visited = new int[board.length][board[0].length];
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < words.length; i++){
            TrieNode curr = root;
            for(int j = 0; j < words[i].length(); j++){
                char ch = words[i].charAt(j);
                
                if(!curr.map.containsKey(ch)){
                    curr.map.put(ch, new TrieNode());
                }
                curr = curr.map.get(ch);
            }
            curr.word = words[i];
        }
        
        
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                backtrack(root, board, i, j, visited, result);
            }
        }
        
        
        return result;












        
        // List<String> ans = new ArrayList<>();

        // for(int i = 0; i < words.length; i++){
        //     int[][] visited = new int[board.length][board[0].length];
        //     int flag = 0;
        //     for(int j = 0; j < board.length; j++){
        //         for(int k = 0; k < board[j].length; k++){
        //             if(wordSearch(board, words[i], 0, j, k, visited)){
        //                 ans.add(words[i]);
        //                 flag = 1;
        //                 break;
        //             }
        //         }
        //         if(flag == 1){
        //             break;
        //         }
        //     }
            
        // }

        // return ans;
    }
}
