class Solution {
    public int addDigits(int num) {

        // Time Complexity : O(1)

        // Space Complexity : O(1)

        if(num == 0){
            return 0;
        }
        if(num % 9 == 0){
            return 9;
        }

        return num % 9;




        // // Time Complexity : O(n)

        // // Space Complexity : O(1)


        // int r = 0;
        
        // while(num > 0){
        //     int d = num % 10;
        //     r += d;
        //     num /= 10;
        //     if(num == 0){
        //         if(r < 10){
        //             return r;
        //         }
        //         num = r;
        //         r = 0;
        //     }
        // }

        // return 0;
    }
}
