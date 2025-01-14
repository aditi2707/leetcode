class Solution {
    public int minChanges(int n, int k) {
        
        String nBin = Integer.toBinaryString(n);
        String kBin = Integer.toBinaryString(k);

        int counter = 0;

        int i = nBin.length() - 1;
        int j = kBin.length() - 1;

        while(i >= 0 && j >= 0){
            if(nBin.charAt(i) != kBin.charAt(j)){
                if(nBin.charAt(i) == '1'){
                    counter++;
                }
                else if(nBin.charAt(i) == '0'){
                    return -1;
                }
            }
            i--;
            j--;
        }

        while(i >= 0){
            if(nBin.charAt(i) == '1'){
                counter++;
            }
            i--;
        }

        if(j >= 0){
            return -1;
        }

        return counter;
    }
}
