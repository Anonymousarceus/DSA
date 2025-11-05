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
        ArrayList<Integer>al=new ArrayList<>();
        while(head!=null){
            al.add(head.val);
            head=head.next;
        }
        int xy=al.size()-n;
        al.remove(xy);
        ListNode newN=new ListNode(0);
        ListNode x=newN;
        for(int i=0;i<al.size();++i){
            ListNode nN=new ListNode(al.get(i));
            x.next=nN;
            x=x.next;
        }
        return newN.next;
    }
}