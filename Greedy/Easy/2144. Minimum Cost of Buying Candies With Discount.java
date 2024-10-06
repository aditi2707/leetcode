class Solution {
    public int minimumCost(int[] cost) {
        
        if(cost.length == 1){
            return cost[0];
        }

        Arrays.sort(cost);
        int sum = 0;

        for(int i = cost.length-1; i >= 0; i -= 3){

            sum += cost[i];

            if(i-1 >= 0){
                sum += cost[i-1];
            }
        }

        return sum;
    }
}
