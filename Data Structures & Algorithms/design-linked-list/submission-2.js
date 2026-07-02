class MyLinkedList {
    constructor() {
        this.head = new Node();
        this.tail = new Node();
        this.head.next = this.tail;
        this.tail.prev = this.head;
        this.size = 0;
    }

    /**
     * @param {number} index
     * @return {ListNode}
     */
    getPrev(index) {
        let node = this.head;
        while(node != this.tail) {
            if(index === 0) {
                return node;
            }
            node = node.next;
            index--;
        }

        return null;
    }

    /**
     * @param {number} index
     * @return {number}
     */
    get(index) {

        return index >= this.size ? -1 : this.getPrev(index).next.val;
    }

    /**
     * @param {number} val
     * @return {void}
     */
    addAtHead(val) {
        this.addAtIndex(0, val);
    }

    /**
     * @param {number} val
     * @return {void}
     */
    addAtTail(val) {
        this.addAtIndex(this.size, val);
    }

    /**
     * @param {number} index
     * @param {number} val
     * @return {void}
     */
    addAtIndex(index, val) {
        if(index > this.size) {
            return;
        }

        let prev = this.getPrev(index);
        let node = new Node(val);
        node.prev = prev;
        node.next = prev.next;
        prev.next = node;
        node.next.prev = node;
        this.size++;
    }

    /**
     * @param {number} index
     * @return {void}
     */
    deleteAtIndex(index) {
        if(index < this.size) {
            let prev = this.getPrev(index);
            const cur = prev.next;
            let next = cur.next;
            prev.next = next;
            next.prev = prev;
            this.size--;
        }
    }
}

class Node {
    constructor (val = 0, prev = null, next = null) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}