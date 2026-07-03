/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} head
     * @return {boolean}
     */
    hasCycle(head) {
        let node1 = head;
        let node2 = head ? head.next : null;
        while(node1 != null && node2 !== null) {
            if(node1 === node2) return true;
            
            node1 = node1.next;
            node2 = node2.next ? node2.next.next : null;
        }

        return false;
    }
}
