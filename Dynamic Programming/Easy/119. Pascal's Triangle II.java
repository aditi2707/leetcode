class Solution {

    // public List<Integer> pascalTri(List<Integer> prev, int rowIndex){
    //     List<Integer> curr = new ArrayList<>();
    //     curr.add(1);

    //     for(int i = 1; i < rowIndex; i++){
    //         curr.add(prev.get(i) + prev.get(i-1));
    //     }
    //     curr.add(1);

    //     return curr;
    // }

    public List<Integer> getRow(int rowIndex) {
    
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        long x = 1;
        for(int i = 1; i < rowIndex+1; i++){

            //prev = pascalTri(prev, i);
            
            long val = x * (rowIndex-i+1)/i;
            prev.add((int)val);
            x = val;
        }

        return prev;
    }
}
