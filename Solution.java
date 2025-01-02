public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null)
        {
            return false;
        }
        ListNode slow = head;
        ListNode fast = slow.next;
        int index = 0;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            if(fast==slow)
            {
                index = 1;
                break;
            }
            slow = slow.next;
        }
        if(index==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        
    
}