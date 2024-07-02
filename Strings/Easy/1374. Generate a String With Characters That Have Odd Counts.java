class Solution {
    public String generateTheString(int n) {

        String str = "";

        char[] arr = new char[n];
        Arrays.fill(arr, 'p');

        if(n % 2 == 0){
            arr[n-1] = 'q';
        }

        return String.valueOf(arr);

        // for(int i = 1; i <= n; i++){
        //     str += "p";
        // }
        
        //  if(n % 2 == 0){
        //     str = str.substring(0, n-1) + "q";
        // }

        // return str;
    }
}
