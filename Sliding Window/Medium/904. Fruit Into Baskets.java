class Solution {
    public int totalFruit(int[] fruits) {

        // Time Complexity : O(n * 2)

        // Space Complexity : O(n)
        
        
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 0;

        while(j < fruits.length){
            if(!map.containsKey(fruits[j])){
                map.put(fruits[j], 1);
            }
            else{
                map.put(fruits[j], map.get(fruits[j]) + 1);
            }

            if(map.size() <= 2){
                max = Math.max(max, (j - i + 1));
                j++;
            }
            else{
                while(i < j && map.size() > 2){
                    map.put(fruits[i], map.get(fruits[i]) - 1);
                    if(map.get(fruits[i]) == 0){
                        map.remove(fruits[i]);
                        i++;
                        break;
                    }
                    i++;
                }
                j++;
            }
        }

        max = Math.max(max, j - i);

        return max;
    }
}
