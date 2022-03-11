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
    public ListNode rotateRight(ListNode head, int k) 
    {
        
        //base condition
        if(k<=0||head==null || head.next==null)
        {
            return head;
        }
        
       ListNode present=head;
       
       
  
         //calculating the length of the linked list
        int length=1;
        while(present.next!=null)
        {
          present=present.next;
           length++;
         
        }
            
         present.next=head;
        // To Avoid computaions If rotations increse the length of the linked list
        int rotations=k%length;
        int skip=length-rotations;
        ListNode newLast=head;
        for(int i=0;i<skip-1;i++)
        {
            newLast=newLast.next;
        }
         head=newLast.next;
         newLast.next=null;
        
        return head;  
            
         
}
        
            

    }
