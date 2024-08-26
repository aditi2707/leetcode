class Solution {

    public boolean binarySearch(int[] arr, int n, int i, int j){

        if(i > j){
            return false;
        }

        int mid = (i+j)/2;

        if(arr[mid] == n){
            return true;
        }
        else if(arr[mid] < n){
            return binarySearch(arr, n, mid+1, j);
        }
        else{
            return binarySearch(arr, n, i, mid-1);
        }        
    }

    public int smallestCommonElement(int[][] mat) {

        int min = Integer.MAX_VALUE;
        int counter = 0;

        for(int i = 0; i < mat[0].length; i++){
            counter = 0;
            for(int j = 1; j < mat.length; j++){
                if(binarySearch(mat[j], mat[0][i], 0, mat[0].length-1)){
                    counter++;
                }
                else{
                    break;
                }
            }
            if(counter == mat.length-1){
                min = Math.min(min, mat[0][i]);
            }
        }

        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
        
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i < mat[0].length; i++){
        //     map.put(mat[0][i], 1);
        // }

        // int max = mat[0][mat[0].length-1];

        // for(int i = 1; i < mat.length; i++){
        //     for(int j = 0; j < mat[i].length; j++){
        //         if(map.containsKey(mat[i][j])){
        //             map.put(mat[i][j], map.get(mat[i][j])+1);
        //                 if(map.get(mat[i][j]) == mat.length){
        //                     return mat[i][j];
        //                 }
        //         }
                
        //         if(mat[i][j] == max){
        //             break;
        //         }
        //     }
        // }

        // return -1;
    }
}
