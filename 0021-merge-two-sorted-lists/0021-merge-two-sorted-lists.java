/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = list1;
        ListNode it = list2;

        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        while(it != null){
            list.add(it.val);
            it = it.next;
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode check = dummy;
        for(int i=0;i<list.size();i++){
            check.next = new ListNode(list.get(i));
            check = check.next;
        }
        return dummy.next;
    }
}