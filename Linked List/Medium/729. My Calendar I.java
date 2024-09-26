class ListNode{
    int[] arr;
    ListNode next;

    public ListNode(int[] arr){
        this.arr = arr;
        next = null;
    }
}

class MyCalendar {

    //List<List<Integer>> events;

    ListNode events;

    public MyCalendar() {

        events = null;

        //events = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {

        if(events == null){
            ListNode temp = new ListNode(new int[]{start, end});
            events = temp;
            return true;
        }

        ListNode curr = events;

        while(curr != null){
            if(start >= curr.arr[0] && start < curr.arr[1]){
                return false;
            }
            if(end <= curr.arr[1] && end > curr.arr[0]){
                return false;
            }
            if(start <= curr.arr[0] && end >= curr.arr[1]){
                return false;
            }

            curr = curr.next;
        }

        curr = events;

        if(end <= events.arr[0]){
            ListNode add = new ListNode(new int[]{start, end});
            add.next = events;
            events = add;
            return true;
        }

        while(curr != null){
            if(start >= curr.arr[1]){
                ListNode temp = curr.next;
                ListNode add = new ListNode(new int[]{start, end});
                curr.next = add;
                add.next = temp;
                break;
            }
            else{
                curr = curr.next;
            }
        }

        return true;


        
        // if(events.size() == 0){
        //     events.add(new ArrayList<>());
        //     events.get(0).add(start);
        //     events.get(0).add(end);
        //     return true;
        // }

        // Collections.sort(events, (a, b) -> Integer.compare(a.get(0), b.get(0)));

        // for(int i = 0; i < events.size(); i++){
        //     if(start >= events.get(i).get(0) && start < events.get(i).get(1)){
        //         return false;
        //     }
        //     if(end <= events.get(i).get(1) && end > events.get(i).get(0)){
        //         return false;
        //     }
        //     if(start <= events.get(i).get(0) && end >= events.get(i).get(1)){
        //         return false;
        //     }
        // }

        // events.add(new ArrayList<>());
        // events.get(events.size()-1).add(start);
        // events.get(events.size()-1).add(end);

        // return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
