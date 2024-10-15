/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

class Solution {
    public int search(ArrayReader reader, int target) {
        
        int low = 0, high = 9999;

        while(low <= high){
            int mid = low + (high - low)/2;
            
            if(reader.get(mid) == target){
                return mid;
            }
            else if(reader.get(mid) > target || reader.get(mid) == Math.pow(2, 31) - 1){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return -1;
    }
}
