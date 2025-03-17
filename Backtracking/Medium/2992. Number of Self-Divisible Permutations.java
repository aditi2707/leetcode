class Solution {

    private int gcd(int m, int n){

        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }

        return m;
    }

    private int backtracking(int n, List<Integer> temp, boolean[] used){

        if(temp.size() == n){
            return 1;
        }

        int count = 0;

        for(int i = 1; i <= n; i++){
            if(used[i]){
                continue;
            }
            if(gcd(i, temp.size() + 1) == 1){
                used[i] = true;
                temp.add(i);
                count += backtracking(n, temp, used);
                temp.remove(temp.size() - 1);
                used[i] = false;
            }
        }

        return count;
    }


    public int selfDivisiblePermutationCount(int n) {

        // Time Complexity : O(linear(gcd) + n * n!).
        // The time complexity for the gcd() will be linear in nature. For the 
        // backtracking(), in the first row, there are n possibilities to choose 
        // from. Then the second row will have n - 1 possibilities and so on. This
        // makes n! TC. FOr all the elements, the TC in the worst case
        // will be O(n * n!).

        // Space Complexity : O(n + n + 1 + n).
        // The temp array will have a maximum of all elements and the used array has
        // a length of all elements + 1. The recursion stack can hold a maximum of
        // n elements.
        
        
        boolean[] used = new boolean[n + 1];

        return backtracking(n, new ArrayList<>(), used);
    }
}
