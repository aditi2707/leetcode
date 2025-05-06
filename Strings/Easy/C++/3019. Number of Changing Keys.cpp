class Solution {
public:
    int countKeyChanges(string s) {
        
        int count = 0;

        for(int i = 1; i < s.length(); i++){
            char curr = tolower(s[i]);
            char prev = tolower(s[i - 1]);
            if(curr != prev){
                count++;
            }
        }

        return count;
    }
};
