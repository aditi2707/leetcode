class Solution {
    public int kthFactor(int n, int k) {

        // Time Complexity : O(2 * sqrt(n))

        // Space Complexity : O(1)
        

        int ans = 0;
        int index = 1;

        for(int i = 1; i < Math.sqrt(n); i++){
            if(n % i == 0){
                ans = i;
                if(index == k){
                    return ans;
                }
                index++;
            }
        }

        for(int i = (int)Math.sqrt(n); i >= 1; i--){
            int dividend = n / i;
            if(n % i == 0){
                ans = dividend;
                if(index == k){
                    return ans;
                }
                index++;
            }
        }

        return -1;



        // Time Complexity : O(k). Will break the loop when counter = k

        // Space Complexity : O(1)


        // int ans = 0;
        // int index = 1;

        // for(int i = 1; i <= n; i++){
        //     if(n % i == 0){
        //         ans = i;
        //         if(index == k){
        //             return ans;
        //         }
        //         index++;
        //     }
        // }

        // return -1;



        // Time Complexity : O(n)

        // Space Complexity : O(factors)

        
        // List<Integer> list = new ArrayList<>();

        // for(int i = 1; i <= n; i++){
        //     if(n % i == 0){
        //         list.add(i);
        //     }
        // }

        // if(list.size() < k){
        //     return -1;
        // }

        // return list.get(k - 1);
    }
}
