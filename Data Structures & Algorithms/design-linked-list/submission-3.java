class MyLinkedList {
    ListNode head;
    ListNode tail;
    public MyLinkedList() {
        this.head = new ListNode();
        this.tail = new ListNode();
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    public int get(int index) {
        ListNode curr = this.head.next;
        while(index >= 0 && curr != this.tail) {
            if(index == 0) {
                return curr.val;
            }
            curr = curr.next;
            index--;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        ListNode next = this.head.next;
        this.head.next = new ListNode(this.head, next, val);
        next.prev = this.head.next;

    }
    
    public void addAtTail(int val) {
        ListNode prev = this.tail.prev;
        this.tail.prev = new ListNode(prev, this.tail, val);
        prev.next = this.tail.prev;
    }
    
    public void addAtIndex(int index, int val) {
        ListNode curr = this.head.next;
        while(index >= 0 && curr != this.tail) {
            if(index == 0) {
                ListNode prev = curr.prev;
                curr.prev = new ListNode(prev, curr, val);
                prev.next = curr.prev;
                return;
            }
            curr = curr.next;
            index--;
        }

        if(index == 0 && curr == tail) {
            addAtTail(val);
        }
    }
    
    public void deleteAtIndex(int index) {
        ListNode curr = this.head.next;
        while(index >= 0 && curr != this.tail) {
            if(index == 0) {
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
            }
            curr = curr.next;
            index--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
 class ListNode {
    ListNode prev;
    ListNode next;
    int val;
    public ListNode() {
        this.prev = null;
        this.next = null;
        this.val = 0;
    }

    public ListNode(ListNode prev, ListNode next, int val) {
        this.prev = prev;
        this.next = next;
        this.val = val;
    }
 }