class Solution {
    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);


        // int i = 0;

        // while(i < haystack.length()){
        //     if(haystack.charAt(i) == needle.charAt(0)){
        //         if(i + needle.length() <= haystack.length()){
        //             String sub = haystack.substring(i, i + needle.length());
        //             if(needle.equals(sub)){
        //                 return i;
        //             }
        //         }
        //     }
        //     i++;
        // }

        // return -1;
        
    }
}
