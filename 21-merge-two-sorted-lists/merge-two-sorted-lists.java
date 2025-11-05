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
        ListNode newN=new ListNode(0);
        ListNode x=newN;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                x.next=list1;
                list1=list1.next;
            }
            else{
                x.next=list2;
                list2=list2.next;
            }
            x=x.next;
        }
        x.next=(list1!=null)?list1:list2;
        return newN.next;
    }
}