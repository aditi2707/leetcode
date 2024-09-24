class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        
        int longestLen = 0;
        Set<String> set1 = new HashSet<>();

        for(Integer i: arr1){
            String t = "";
            String s = String.valueOf(i);

            for(int j = 0; j < s.length(); j++){
                t += s.charAt(j);
                set1.add(t);
            }
        }

        for(int i = 0; i < arr2.length; i++){
            String s = String.valueOf(arr2[i]);
            String t = "";
            int j = 0;
            while(j < s.length()){
                t += s.charAt(j);
                if(set1.contains(t)){
                    longestLen = Math.max(longestLen, t.length());
                }
                else{
                    break;
                }
                j++;
            }
        }

        return longestLen;
    }
}
