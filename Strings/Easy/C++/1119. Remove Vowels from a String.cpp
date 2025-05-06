class Solution {
public:
    string removeVowels(string s) {
        string ans = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.at(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            ans += s.at(i);
        }

        return ans;
    }
};
