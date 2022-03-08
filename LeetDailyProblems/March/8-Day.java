/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head)
    {
        // fast pointer  will move ahead with two steps forward and slow will move one first forward        
        // and it goes on at any  point of time if both the pointers become equal then cycle         // is detected.
        ListNode fast=head; 
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            return true;
            
        }
        
        return false;
        
    }
    
}
