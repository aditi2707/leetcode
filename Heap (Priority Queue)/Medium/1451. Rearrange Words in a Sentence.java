class Solution {
    public String arrangeWords(String text) {

        // Time Complexity : O(nlog n + n)

        // Space Complexity : O(n)


        String ans = "";
        String[] arr = text.toLowerCase().split(" ");

        Arrays.sort(arr, (a, b) -> a.length() - b.length());

        for(int i = 0; i < arr.length; i++){
            ans += arr[i] + " ";
        }

        ans = Character.toUpperCase(ans.charAt(0)) + ans.substring(1, ans.length() - 1);

        return ans;



        

        // // Time Complexity : O(nlog n + n)

        // // Space Complexity : O(2 * n)
        
        
        // PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
        //     return a[0] == b[0] ? a[1] - b[1] : a[0] - b[0];
        // });

        // String ans = "";
        // String[] arr = text.split(" ");

        // arr[0] = Character.toLowerCase(arr[0].charAt(0)) + arr[0].substring(1);

        // for(int i = 0; i < arr.length; i++){
        //     String s = arr[i];
        //     minHeap.add(new int[]{s.length(), i});
        // }

        // while(minHeap.size() > 0){
        //     ans += arr[minHeap.poll()[1]] + " ";
        // }

        // ans = Character.toUpperCase(ans.charAt(0)) + ans.substring(1, ans.length() - 1);

        // return ans;
    }
}
