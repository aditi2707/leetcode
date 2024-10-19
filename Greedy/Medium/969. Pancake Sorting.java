class Solution {

    public int findIndex(int[] arr, int k){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        }

        return -1;
    }

    public void flip(int[] arr, int end){

        int i = 0;

        while(i < end/2){
            int temp = arr[i];
            arr[i] = arr[end - 1 - i];
            arr[end - 1 - i] = temp;
            i++;
        }
    }

    public List<Integer> pancakeSort(int[] arr) {
        
        List<Integer> ans = new ArrayList<>();

        for(int i = arr.length; i > 0; i--){
            int index = findIndex(arr, i);

            if(index == i - 1){
                continue;
            }

            if(index != 0){
                ans.add(index + 1);
                flip(arr, index + 1);
            }

            ans.add(i);
            flip(arr, i);
        }

        return ans;
    }
}
