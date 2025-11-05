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
        if (list1 == null && list2 == null) {
            return null;
        }
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
        ListNode newNode=new ListNode(al.get(0));
        ListNode curr=newNode;
        for(int i=1;i<al.size();++i){
            ListNode n=new ListNode(al.get(i));
            curr.next=n;
            curr=curr.next;
        }
        return newNode;
    }
}