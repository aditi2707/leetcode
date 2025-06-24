class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {

        // Time Complexity : O(n + n)
        // If there are no pairs in the array.

        // Space Complexity : O(n)
        
        
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for(int[] i: dominoes){
            int a = i[0];
            int b = i[1];

            int num1 = a * 10 + b;
            int num2 = b * 10 + a;

            if(!map.containsKey(num1) && !map.containsKey(num2)){
                map.put(num1, 1);
            }
            else if(map.containsKey(num1)){
                map.put(num1, map.get(num1) + 1);
            }
            else if(map.containsKey(num2)){
                map.put(num2, map.get(num2) + 1);
            }
        }

        for(Integer i: map.values()){
            ans += i * (i - 1) / 2;
        }

        return ans;





        // // Time Complexity : O(n + n)
        // // If there are no pairs in the array.

        // // Space Complexity : O(n * 2 + 4)

        
        // Map<List<Integer>, Integer> map = new HashMap<>();
        // int ans = 0;

        // for(int[] i: dominoes){
        //     int a = i[0];
        //     int b = i[1];

        //     List<Integer> temp1 = new ArrayList<>();
        //     List<Integer> temp2 = new ArrayList<>();

        //     temp1.add(a);
        //     temp1.add(b);
        //     temp2.add(b);
        //     temp2.add(a);

        //     if(!map.containsKey(temp1) && !map.containsKey(temp2)){
        //         map.put(temp1, 1);
        //     }
        //     else if(map.containsKey(temp1)){
        //         map.put(temp1, map.get(temp1) + 1);
        //     }
        //     else if(map.containsKey(temp2)){
        //         map.put(temp2, map.get(temp2) + 1);
        //     }
        // }

        // for(Integer i: map.values()){
        //     ans += i * (i - 1) / 2;
        // }

        // return ans;
    }
}
