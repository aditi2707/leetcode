class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        
        int points = 0;
        int i = 0, j = 0;
        int sum = 0;

        while(j < calories.length){

            if((j - i + 1) <= k){
                sum += calories[j];
                j++;
            }
            else{
                if(sum < lower){
                    points -= 1;
                }
                else if(sum > upper){
                    points += 1;
                }

                sum -= calories[i];
                i++;
                sum += calories[j];
                j++;
            }
        }

        if(sum < lower){
            points -= 1;
        }
        else if(sum > upper){
            points += 1;
        }

        return points;
    }
}
