class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        
        int[] arr = new int[s.length()];

        for(int i = 0; i < s.length(); i++){
            int counter = 0;
            int p = startPos[0];
            int q = startPos[1];
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);
                if(ch == 'L'){
                    if(q-1 < 0){
                        break;
                    }
                    counter++;
                    q--;
                }

                if(ch == 'R'){
                    if(q+1 > n-1){
                        break;
                    }
                    counter++;
                    q++;
                }

                if(ch == 'U'){
                    if(p-1 < 0){
                        break;
                    }
                    counter++;
                    p--;
                }

                if(ch == 'D'){
                    if(p+1 > n-1){
                        break;
                    }
                    counter++;
                    p++;
                }
            }
            arr[i] = counter;
        }
        return arr;
    }
}
