class Solution {

    private boolean jumpGameDp(int[] arr, int start, int[] dp){

        if(start < 0 || start >= arr.length){
            return false;
        }
        
        if(arr[start] == 0){
            return true;
        }

        if(dp[start] != -1){
            return dp[start] == 1;
        }


        boolean left = jumpGame(arr, start - arr[start], dp);
        boolean right = jumpGame(arr, start + arr[start], dp);

        boolean result = left || right;

        if(result){
            dp[start] = 1;
        }
        else{
            dp[start] = 0;
        }

        return result;
    }


    private boolean jumpGame(int[] arr, int start, int[] visited){

        if(start < 0 || start >= arr.length){
            return false;
        }
        if(visited[start] == 1){
            return false;
        }
        if(arr[start] == 0){
            return true;
        }

        visited[start] = 1;

        boolean left = jumpGame(arr, start - arr[start], visited);
        boolean right = jumpGame(arr, start + arr[start], visited);

        return left || right;
    }


    public boolean canReach(int[] arr, int start) {

        int[] dp = new int[arr.length];

        Arrays.fill(dp, -1);

        return jumpGameDp(arr, start, dp);


        
        // int[] visited = new int[arr.length];

        // return jumpGame(arr, start, visited);
    }
}
