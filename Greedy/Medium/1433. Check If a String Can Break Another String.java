class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int count1 = 0, count2 = 0;

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0; i < c1.length; i++){
            if(c1[i] >= c2[i]){
                count1++;
            }
            if(c2[i] >= c1[i]){
                count2++;
            }
        }

        return count1 == c1.length || count2 == c2.length;
    }
}
