class Solution {

    public int findSquare(int n){

        int i = 0;
        while(n > 0){
            int d = n % 10;
            i += (int)Math.pow(d, 2);
            n /= 10;
        }

        return i;
    }

    public boolean isHappy(int n) {

        // ArrayList<Integer> arr = new ArrayList<>();
        // int i = 0;
        // int flag = 0;

        // while(flag == 0){
        //     int d = n % 10;
        //     i += (int)Math.pow(d, 2);
        //     n /= 10;

        //     if(n == 0){
        //         if(i == 1){
        //             return true;
        //         }
        //         if(arr.contains(i)){
        //             flag = 1;
        //             break;
        //         }
        //         else{
        //             arr.add(i);
        //             n = i;
        //             i = 0;
        //         }
        //     }
        // }

        // return false;
        
        int slow = n, fast = n;
        slow = findSquare(slow);
        fast = findSquare(findSquare(fast));

        while(slow != fast){
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }

        return slow == 1;
    }
}
