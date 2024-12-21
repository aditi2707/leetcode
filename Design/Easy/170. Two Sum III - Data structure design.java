class TwoSum {

    Map<Integer, Integer> map;
    
    // List<Integer> arr;

    public TwoSum() {
        map = new HashMap<>();

        // arr = new ArrayList<>();
    }
    
    public void add(int number) {

        if(!map.containsKey(number)){
            map.put(number, 1);
        }
        else{
            map.put(number, map.get(number) + 1);
        }

        return;


        // arr.add(number);

        // return;
    }
    
    public boolean find(int value) {

        for(Integer i: map.keySet()){
            int val = value - i;

            if(!map.containsKey(val)){
                continue;
            }

            if(val == i){
                if(map.get(val) > 1){
                    return true;
                }
            }
            else if(map.containsKey(val)){
                return true;
            }
        }

        return false;





        // Collections.sort(arr);
        // int i = 0, j = arr.size() - 1;

        // while(i < j){
        //     if(arr.get(i) + arr.get(j) == value){
        //         return true;
        //     }
        //     else if(arr.get(i) + arr.get(j) < value){
        //         i++;
        //     }
        //     else{
        //         j--;
        //     }
        // }

        // return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
