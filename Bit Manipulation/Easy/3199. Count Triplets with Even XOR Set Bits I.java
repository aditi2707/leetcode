class Solution {

    public int[] countBits(int[] arr){

        int odd = 0, even = 0;

        for(int i = 0; i < arr.length; i++){
            int setBits = Integer.bitCount(arr[i]);

            if(setBits % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        return new int[]{odd, even};
    }

    public int tripletCount(int[] a, int[] b, int[] c) {

        int[] aCount = countBits(a);
        int[] bCount = countBits(b);
        int[] cCount = countBits(c);

        int allEven = aCount[1] * bCount[1] * cCount[1];
        int oddOddEven = aCount[0] * bCount[0] * cCount[1];
        int oddEvenOdd = aCount[0] * bCount[1] * cCount[0];
        int evenOddOdd = aCount[1] * bCount[0] * cCount[0];

        return allEven + oddOddEven + oddEvenOdd + evenOddOdd;




        
        // int ans = 0;
        // int[] temp = new int[a.length * b.length];
        // int k = 0;

        // for(int i = 0; i < a.length; i++){
        //     for(int j = 0; j < b.length; j++){
        //         temp[k] = a[i] ^ b[j];
        //         k++;
        //     }
        // }

        // for(int i = 0; i < temp.length; i++){
        //     for(int j = 0; j < c.length; j++){
        //         if(Integer.bitCount(temp[i] ^ c[j]) % 2 == 0){
        //             ans++;
        //         }
        //     }
        // }

        // return ans;
    }
}
