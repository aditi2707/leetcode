class Solution {
    public int maximumPopulation(int[][] logs) {

        // Time Complexity : O(n + 100)

        // Space Complexity : O(101) ~ O(1)
        
        
        int[] years = new int[101];
        int max = 0, ans = 0;

        for(int[] y: logs){
            years[y[0] - 1950] += 1;
            years[y[1] - 1950] -= 1;
        }

        if(years[0] > max){
            max = years[0];
            ans = 1950;
        }

        for(int i = 1; i < years.length; i++){
            years[i] += years[i - 1];
            if(years[i] > max){
                max = years[i];
                ans = i + 1950;
            }
        }

        return ans;






        // // Time Complexity : O(n * n)

        // // Space Complexity : O(101) ~ O(1)

        
        // int[] years = new int[101];
        // int max = 0;

        // for(int[] y: logs){
        //     for(int i = y[0]; i < y[1]; i++){
        //         years[i - 1950] += 1;
        //         max = Math.max(max, years[i - 1950]);
        //     }
        // }

        // for(int i = 0; i < years.length; i++){
        //     if(years[i] == 0){
        //         continue;
        //     }
        //     if(years[i] == max){
        //         return i + 1950;
        //     }
        // }

        // return 0;
    }
}
