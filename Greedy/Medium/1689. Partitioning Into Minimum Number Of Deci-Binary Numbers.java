class Solution {
    public int minPartitions(String n) {

        char[] c = n.toCharArray();
        int part = 0;

        for(Character ch: c){
            part = Math.max(part, ch - '0');
        }

        return part;




        
        // char[] c = n.toCharArray();
        // Arrays.sort(c);

        // return Integer.parseInt(String.valueOf(c[c.length-1]));
    }
}
