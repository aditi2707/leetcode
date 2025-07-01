class Solution {
    public double calculateTax(int[][] brackets, int income) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        
        
        double tax = 0;
        int i = 0;

        while(i < brackets.length){
            int upper = brackets[i][0];
            int percent = brackets[i][1];

            if(i == 0){
                if(upper <= income){
                    income -= upper;
                    tax += ((double)(percent / 100.0) * (double)upper);
                }
                else{
                    tax += ((double)(percent / 100.0) * (double)income);
                    break;
                }
            }
            else{
                if(upper - brackets[i - 1][0] <= income){
                    income -= (upper - brackets[i - 1][0]);
                    tax += ((double)(percent / 100.0) * (double)(upper - brackets[i - 1][0]));
                }
                else{
                    tax += ((double)(percent / 100.0) * (double)income);
                    break;
                }
            }

            i++;
        }

        return tax;
    }
}
