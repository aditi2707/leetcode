class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        
        int[] queryFreq = new int[queries.length];
        int[] wordsFreq = new int[words.length];
        int[] ans = new int[queries.length];

        for(int i = 0; i < queries.length; i++){
            String s = queries[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            s = new String(c);
            queryFreq[i] = s.lastIndexOf(s.charAt(0)) + 1;
        }

        for(int i = 0; i < words.length; i++){
            String s = words[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            s = new String(c);
            wordsFreq[i] = s.lastIndexOf(s.charAt(0)) + 1;
        }

        Arrays.sort(wordsFreq);
        

        for(int i = 0; i < queryFreq.length; i++){

            int low = 0, high = wordsFreq.length - 1;

            while(low <= high){
                int mid = low + (high - low)/2;

                if(wordsFreq[mid] <= queryFreq[i]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

            if(low < wordsFreq.length && wordsFreq[low] >= queryFreq[i]){
                ans[i] = wordsFreq.length - low;
            }

            
            
            // int j = 0;
            // while(j < wordsFreq.length){
            //     if(queryFreq[i] < wordsFreq[j]){
            //         ans[i]++;
            //     }
            //     j++;
            // }
        }

        return ans;
    }
}
