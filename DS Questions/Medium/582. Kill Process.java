class Solution {

    private void dfs(Map<Integer, List<Integer>> map, int kill, List<Integer> ans){

        ans.add(kill);

        if(map.containsKey(kill)){
            for(Integer i: map.get(kill)){
                dfs(map, i, ans);
            }
        }

        return;
    }

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        
        List<Integer> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < ppid.size(); i++){
            if(!map.containsKey(ppid.get(i))){
                map.put(ppid.get(i), new ArrayList<>());
            }
            map.get(ppid.get(i)).add(pid.get(i));
        }

        dfs(map, kill, ans);

        return ans;
    }
}
