class Solution {
    public int maxNumberOfApples(int[] weight) {
        
        Arrays.sort(weight);
        int sum = 0;
        int max = 0;

        for(Integer i: weight){
            if(sum + i <= 5000){
                max++;
                sum += i;
            }
            else{
                break;
            }
        }

        return max;
    }
}
