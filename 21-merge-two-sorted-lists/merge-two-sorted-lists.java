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
        ListNode l=new ListNode(0);
        ListNode x=l;
        ArrayList<Integer>al=new ArrayList<>();
        while(list1!=null){
            al.add(list1.val);
            list1=list1.next;
        }
        while(list2!=null){
            al.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(al);
        int i=0;
        while(i<al.size()){
            x.next=new ListNode(al.get(i));
            x=x.next;
            ++i;
        }
        return l.next;
    }
}