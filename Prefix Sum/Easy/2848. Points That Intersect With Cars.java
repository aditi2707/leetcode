class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {

        // Time Complexity : O(n + 101)

        // Space Complexity : O(101) ~ O(1)

        
        int[] cars = new int[102];
        int count = 0;

        for(int i = 0; i < nums.size(); i++){
            cars[nums.get(i).get(0)] += 1;
            cars[nums.get(i).get(1) + 1] -= 1;
        }

        for(int i = 1; i < cars.length; i++){
            cars[i] += cars[i - 1];
            if(cars[i] > 0){
                count++;
            }
        }

        if(cars[0] > 0){
            count++;
        }

        return count;





        // // Time Complexity : O(n * 100)

        // // Space Complexity : O(100)


        // HashSet<Integer> set = new HashSet<>();

        // for(int i = 0; i < nums.size(); i++){
        //     for(int j = nums.get(i).get(0); j <= nums.get(i).get(1); j++){
        //         set.add(j);
        //     }
        // }

        // return set.size();
    }
}
