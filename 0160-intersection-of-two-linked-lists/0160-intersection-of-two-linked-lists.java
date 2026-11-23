/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size = helper(headA);
        int size2 = helper(headB);

        if(headA == null && headB == null) return null;
        int diff = Math.abs(size - size2);
        
        if (size > size2) {
            while (diff > 0) {
                headA = headA.next;
                diff--;
            }
        } else {
            while (diff > 0) {
                headB = headB.next;
                diff--;
            }
        }

        while(headA != headB){
            
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    public int helper(ListNode head){
        int size=0;
        ListNode temp =head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
}