class Solution {
    public String removeOccurrences(String s, String part) {
        
        if(s.indexOf(part) == -1){
            return s;
        }

        if(s.indexOf(part) != -1){
            int index = s.indexOf(part);
            s = s.substring(0, index) + s.substring(index + part.length());
        }
        return removeOccurrences(s, part);
    }
}
