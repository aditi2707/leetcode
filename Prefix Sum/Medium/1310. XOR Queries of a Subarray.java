class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

        int[] answer = new int[queries.length];
        int[] prefixSum = new int[arr.length+1];
        //prefixSum[0] = arr[0];

        for(int i = 0; i < arr.length; i++){
            prefixSum[i+1] = prefixSum[i] ^ arr[i];
        }

        for(int i = 0; i < queries.length; i++){
            answer[i] = prefixSum[queries[i][1]+1] ^ prefixSum[queries[i][0]];
        }

        return answer;
        
        // int[] answer = new int[queries.length];

        // for(int i = 0; i < queries.length; i++){
        //     int sum = arr[queries[i][0]];
        //     for(int j = queries[i][0]+1; j <= queries[i][1]; j++){
        //         sum ^= arr[j];
        //     }
        //     answer[i] = sum;
        // }

        // return answer;
    }
}
