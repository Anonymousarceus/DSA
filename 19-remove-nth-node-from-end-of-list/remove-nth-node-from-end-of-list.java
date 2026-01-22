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
        ListNode l=new ListNode(0);
        ListNode c=l;
        ArrayList<Integer>al=new ArrayList<>();
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        int x=al.size()-n;
        al.remove(x);
        for(int i:al){
            c.next=new ListNode(i);
            c=c.next;
        }
        return l.next;
        
    }
}