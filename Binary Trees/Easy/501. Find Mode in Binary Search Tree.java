/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public void sortedList(TreeNode root, List<Integer> list){

        if(root != null){
            sortedList(root.left, list);
            list.add(root.val);
            sortedList(root.right, list);
        }
    }


    // public void inorder(TreeNode root, Map<Integer, Integer> map, int[] max){

    //     if(root != null){
    //         inorder(root.left, map, max);
    //         if(!map.containsKey(root.val)){
    //             map.put(root.val, 1);
    //         }
    //         else{
    //             map.put(root.val, map.get(root.val) + 1);
    //         }
    //         max[0] = Math.max(max[0], map.get(root.val));
    //         inorder(root.right, map, max);
    //     }
    // }

    public int[] findMode(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int max = 0;

        sortedList(root, list);

        int i = 0;

        while(i < list.size()){

            int num = list.get(i);
            int low = i+1, high = list.size()-1;

            while(low <= high){
                int mid = low + (high - low)/2;

                if(list.get(mid) <= num){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

            if(high >= 0 && list.get(high) == num){
                if(max == high - i + 1){
                    temp.add(num);
                }
                else if(max < high - i + 1){
                    temp.clear();
                    max = high - i + 1;
                    temp.add(num);
                }
                i = high + 1;
            }
            else{
                i++;
            }
        }

        int[] ans = new int[temp.size()];

        for(int j = 0; j < ans.length; j++){
            ans[j] = temp.get(j);
        }

        return ans;







        // Map<Integer, Integer> map = new HashMap<>();
        // int[] max = {0};

        // inorder(root, map, max);

        // int counter = 0;

        // for(Integer i: map.values()){
        //     if(i == max[0]){
        //         counter++;
        //     }
        // }

        // int[] ans = new int[counter];

        // for(Integer i: map.keySet()){
        //     if(map.get(i) == max[0]){
        //         ans[counter-1] = i;
        //         counter--;
        //     }
        // }

        // return ans;
    }
}
