class ListNode{
    ListNode prev;
    String val;
    ListNode next;

    ListNode(String val){
        this.val = val;
    }
}


class BrowserHistory {

    //ListNode tab;

    List<String> tabs;
    int current;

    public BrowserHistory(String homepage) {
        
        //tab = new ListNode(homepage);
        tabs = new ArrayList<>();
        tabs.add(homepage);
        current = 0;
    }
    
    public void visit(String url) {
        
        // ListNode prev = tab;
        // tab.next = new ListNode(url);
        // tab = tab.next;
        // tab.prev = prev;


        tabs.add(url);
        current = tabs.size();
    }
    
    public String back(int steps) {
        
        // ListNode curr = tab;
        // int c = 0;
        // while(tab.prev != null && c < steps){
        //     c++;
        //     tab = tab.prev;
        // }
        // return tab.val;

        current = Math.max(0,  current - steps);
        return tabs.get(Math.max(0,  current - steps));
    }
    
    public String forward(int steps) {
        // ListNode curr = tab;
        // int c = 0;
        // while(tab.next != null && c < steps){
        //     c++;
        //     tab = tab.next;
        // }
        // return tab.val;

        current = Math.min(tabs.size()-1, steps + current-1);
        return tabs.get(Math.min(tabs.size()-1, steps + current-1));
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
