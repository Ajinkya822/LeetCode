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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode slow=head;
        while(slow!=null){
            slow=slow.next;
            count++;
        }
        if(n==count)
            return head.next;
        if(count==1)
            return null;
        slow=head;
        ListNode fast=slow.next;
        int t=0;
        while(t!=count-n-1){
            slow=slow.next;
            fast=fast.next;
            t++;
        }
        slow.next=fast.next;
        fast.next=null;
        
        return head;
    }
}