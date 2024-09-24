class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        
        int sum = 0;
        int minBoxes = 0;
        int cap = 0;

        for(Integer i: apple){
            sum += i;
        }

        Arrays.sort(capacity);

        for(int i = capacity.length-1; i >= 0; i--){
            
            if(cap < sum){
                cap += capacity[i];
                minBoxes++;
            }
            else{
                break;
            }
        }

        return minBoxes;
    }
}
