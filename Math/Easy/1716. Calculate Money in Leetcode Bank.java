class Solution {
    public int totalMoney(int n) {

        // Sum of integers: (n * ((2 * i) + (n - 1) * d)) / 2

        // Time Complexity : O(1)
        // For whole weeks, the pattern is 28, 35, 42... . So the above formula
        // can be used instead of a loop.
        // Because the second for loop will only run for a maximum of 6 rounds

        // Space Complexity : O(1)

        
        int numWeeks = n / 7;
        int total = 0;

        total += (numWeeks * ((2 * 28) + (numWeeks - 1) * 7)) / 2;

        int counter = numWeeks + 1;

        for(int i = 1; i <= n % 7; i++){
            total += counter;
            counter++;
        }

        return total;





        // // Sum of integers: (n * ((2 * i) + (n - 1) * d)) / 2

        // // Time Complexity : O(n + 1)
        // // Because the value of n is not shrinking INSIDE the for loop but the 
        // // value has already been calculated beforehand. Hence linear.
        // // Because the second for loop will only run for a maximum of 6 rounds

        // // Space Complexity : O(1)

        
        // int numWeeks = n / 7;
        // int total = 0;

        // for(int i = 1; i <= numWeeks; i++){
        //     total += (7 * ((2 * i) + 6)) / 2;
        // }

        // int counter = numWeeks + 1;

        // for(int i = 1; i <= n % 7; i++){
        //     total += counter;
        //     counter++;
        // }

        // return total;
    }
}
