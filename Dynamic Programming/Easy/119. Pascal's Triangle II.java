class Solution {

    public void pascalTriangle(List<Integer> prev, List<Integer> curr, int i, int j){

        if(i == 0){
            curr.add(1);
            pascalTriangle(prev, curr, i + 1, j);
            return;
        }
        if(i == j){
            curr.add(1);
            return;
        }

        curr.add(prev.get(i) + prev.get(i - 1));
        pascalTriangle(prev, curr, i + 1, j);
        return;
    }

    

    public List<Integer> pascalTri(List<Integer> prev, int rowIndex){
        List<Integer> curr = new ArrayList<>();
        curr.add(1);

        for(int i = 1; i < rowIndex; i++){
            curr.add(prev.get(i) + prev.get(i-1));
        }
        curr.add(1);

        return curr;
    }

    public List<Integer> getRow(int rowIndex) {

        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        if(rowIndex == 0){
            return prev;
        }

        for(int i = 1; i <= rowIndex; i++){
            List<Integer> curr = new ArrayList<>();
            pascalTriangle(prev, curr, 0, i);

            prev = curr;
        }

        return prev;





        
    
        // List<Integer> prev = new ArrayList<>();
        // prev.add(1);
        // long x = 1;
        // for(int i = 1; i < rowIndex+1; i++){

        //     //prev = pascalTri(prev, i);
            
        //     long val = x * (rowIndex-i+1)/i;
        //     prev.add((int)val);
        //     x = val;
        // }

        // return prev;
    }
}
