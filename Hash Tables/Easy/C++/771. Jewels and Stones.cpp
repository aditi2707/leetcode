class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        set<char> s;
        int count = 0;

        for(int i = 0; i < jewels.length(); i++){
            s.insert(jewels.at(i));
        }

        for(int i = 0; i < stones.length(); i++){
            if(s.contains(stones.at(i))){
                count++;
            }
        }

        return count;
    }
};
