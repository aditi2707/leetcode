class Solution {

    public int binarySearch(int[] arr, int m, int n){

        if(m >= n){
            return m;
        }

        int mid = m + (n - m)/2;

        if(arr[mid] == 1){
            return binarySearch(arr, mid+1, n);
        }
        else{
            return binarySearch(arr, m, mid);
        } 
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        });
        int[] ans = new int[k];

        for(int i = 0; i < mat.length; i++){
            int counter = binarySearch(mat[i], 0, mat[i].length);
            
            // for(int j = 0; j < mat[i].length; j++){
            //     if(mat[i][j] == 1){
            //         counter++;
            //     }
            // }
            
            maxHeap.add(new int[]{counter, i});
        }

        int c = 0;
        while(c < k){
            ans[c] = maxHeap.poll()[1];
            c++;
        }
        
        return ans;
    }
}
