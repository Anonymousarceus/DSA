class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        
        // First count total nodes
        int totalNodes = 0;
        ListNode temp = head;
        while (temp != null) {
            totalNodes++;
            temp = temp.next;
        }
        
        // Calculate complete groups only
        int completeGroups = totalNodes / k;
        
        int arr[] = new int[k];
        ArrayList<Integer> li = new ArrayList<>();
        
        ListNode ans = head;
        int groupCount = 0;
        int c = 0; // position within current group
        
        while (ans != null && groupCount < completeGroups) {
            // Fill current group
            if (c < k) {
                arr[k - 1 - c] = ans.val; // reverse order
                ans = ans.next;
                c++;
            }
            
            // When group is complete, add to list
            if (c == k) {
                for (int j = 0; j < k; j++) {
                    li.add(arr[j]);
                }
                groupCount++;
                c = 0; // reset for next group
            }
        }
        
        // Add remaining nodes as they are (incomplete group)
        while (ans != null) {
            li.add(ans.val);
            ans = ans.next;
        }
        
        // Copy back to original list
        ans = head;
        for (int j = 0; j < li.size(); j++) {
            ans.val = li.get(j);
            ans = ans.next;
        }
        
        return head;
    }
}