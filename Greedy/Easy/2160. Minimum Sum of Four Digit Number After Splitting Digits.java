class Solution {
    public int minimumSum(int num) {
        
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int r = num;

        while(r > 0){
            int d = r % 10;
            if(d < firstMin){
                secondMin = firstMin;
                firstMin = d;
            }
            else if(d >= firstMin && d < secondMin){
                secondMin = d;
            }
            if(d > firstMax){
                secondMax = firstMax;
                firstMax = d;
            }
            else if(d <= firstMax && d > secondMax){
                secondMax = d;
            }
            r /= 10;
        }

        int firstNum = firstMin * 10 + firstMax;
        int secondNum = secondMin * 10 + secondMax;

        return firstNum + secondNum;
    }
}
