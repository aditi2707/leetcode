class Solution {

    public int findTribo(int[] arr, int n){
        if(n == 2 || n == 1){
            return 1;
        }
        if(n  == 0){
            return 0;
        }

        if(arr[n] != 0){
            return arr[n];
        }
        
        arr[n] = findTribo(arr, n-1) + findTribo(arr, n-2) + findTribo(arr, n-3);
        return arr[n];
    }

    public int tribonacci(int n) {

        int[] arr = new int[n+1];
        return findTribo(arr, n);

        // if(n == 2 || n == 1){
        //     return 1;
        // }
        // if(n  == 0){
        //     return 0;
        // }

        // arr[0] = 0;
        // arr[1] = 1;
        // arr[2] = 1;

        // for(int i = 3; i < arr.length; i++){
        //     arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        // }

        //return arr[n];
    }
}
