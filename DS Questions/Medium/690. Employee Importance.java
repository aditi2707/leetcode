/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {

    private int dfs(Map<Integer, Employee> map, int id){

        int sum = map.get(id).importance;

        for(Integer i: map.get(id).subordinates){
            sum += dfs(map, i);
        }

        return sum;
    }

    public int getImportance(List<Employee> employees, int id) {

        Map<Integer, Employee> map = new HashMap<>();

        for(Employee e: employees){
            map.put(e.id, e);
        }

        return dfs(map, id);
    }
}
