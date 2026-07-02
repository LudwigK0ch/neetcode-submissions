class LinkedList {
  ListNode head;
  ListNode tail;

    public LinkedList() {
      head = new ListNode();
      tail = new ListNode();

      head.next = tail;
      tail.prev = head;
    }

    public int get(int index) {
      ListNode node = head.next;
        while(node != tail && index != 0){
          node = node.next;
          index--;
        }

        return node != tail ? node.val : -1;
    }

    public void insertHead(int val) {
        ListNode node = new ListNode(val);

        head.next.prev = node;
        node.next = head.next;

        head.next = node; 
        node.prev = head;
        
    }

    public void insertTail(int val) {
      ListNode node = new ListNode(val);

      tail.prev.next = node;
      node.prev = tail. prev;

      tail.prev = node;
      node.next = tail;
    }

    public boolean remove(int index) {
        ListNode node = head.next;
        while(node != tail && index != 0){
          node = node.next;
          index--;
        }

        if(node != tail){
          node.prev.next = node.next;
          node.next.prev = node.prev;
          return true;
        }

        return false;
    }

    public ArrayList<Integer> getValues() {
      ArrayList<Integer> values = new ArrayList<>();
      ListNode node = head.next;
      
      while(node != tail){
        values.add(node.val);
        node = node.next;
      }
      return values;
    }
}

class ListNode {
  ListNode prev = null;
  ListNode next = null;
  int val;

  public ListNode(int val){
    this.val = val;
  }

  public ListNode(){}
}
