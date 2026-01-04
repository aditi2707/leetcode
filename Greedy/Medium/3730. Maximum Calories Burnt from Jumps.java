class Solution {
    public long maxCaloriesBurnt(int[] heights) {

        // Time Complexity : O(n + max + (max - min))

        // Space Complexity : O(max)
        
        
        long ans = 0;

        int min = heights[0], max = heights[0];

        for(Integer i: heights){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int[] freq = new int[max + 1];

        for(Integer i: heights){
            freq[i] += 1;
        }

        ans += (long)(Math.pow(max, 2));

        int i = min, j = max;
        boolean left = true;

        while(i <= j){
            if(i == j){
                break;
            }
            if(freq[i] == 0){
                i++;
                continue;
            }
            if(freq[j] == 0){
                j--;
                continue;
            }
    
            ans += (long)(Math.pow(j - i, 2));
            if(left){
                left = false;
                freq[j] -= 1;
            }
            else{
                left = true;
                freq[i] -= 1;
            }
        }

        return ans;







        // // Time Complexity : O(nlog n + n)

        // // Space Complexity : O(1)

        
        // long ans = 0;

        // Arrays.sort(heights);

        // ans += (long)(Math.pow(heights[heights.length - 1], 2));

        // int i = 0, j = heights.length - 1, moves = 1;

        // while(i <= j){
        //     if(i == j){
        //         break;
        //     }
        //     ans += (long)Math.pow((heights[j] - heights[i]), 2);
        //     if(moves == 1){
        //         moves = 0;
        //         j--;
        //     }
        //     else{
        //         moves = 1;
        //         i++;
        //     }
        // }

        // return ans;
    }
}
