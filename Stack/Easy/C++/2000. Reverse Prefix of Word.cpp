class Solution {
public:
    string reversePrefix(string word, char ch) {
        
        int i = 0;
        stack<char> st;
        string ans = "";

        while(i < word.length()){
            st.push(word.at(i));
            if(word.at(i) == ch){
                break;
            }
            i++;
        }

        if(i == word.length()){
            return word;
        }

        while(!st.empty()){
            ans += st.top();
            st.pop();
        }

        i++;
        while(i < word.length()){
            ans += word.at(i);
            i++;
        }

        return ans;
    }
};
