class Deque {
    ListNode head;
    ListNode tail;

    public Deque() {
    head = new ListNode();
    tail = new ListNode();

    head.next = tail;
    tail.prev = head;
    }

    public boolean isEmpty() {
      return head.next == tail;
    }

    public void append(int value) {
       ListNode node = new ListNode(value);

       tail.prev.next = node;
       node.prev = tail.prev;

       tail.prev = node;
       node.next = tail;
    }

    public void appendleft(int value) {
        ListNode node = new ListNode(value);

        head.next.prev = node;
        node.next = head.next;

        head.next = node;
        node.prev = head;
    }

    public int pop() {
        if(isEmpty()) return -1;

        int val = tail.prev.val;

        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;

        return val;
    }

    public int popleft() {
        if(isEmpty()) return -1;

        int val = head.next.val;

        head.next.next.prev = head;
        head.next = head.next.next;

        return val;
    }
}

class ListNode {
  ListNode prev = null;
  ListNode next = null;
  int val;

  public ListNode(){}

  public ListNode(int val){
    this.val = val;
  }  
}
