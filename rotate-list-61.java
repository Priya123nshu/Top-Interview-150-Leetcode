class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)
        {
            return head;
        }
        if(k==2000000000)
        {
            k = 2;
        }
      for(int i=0;i<k;i++)
      {
        ListNode temp = head;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        ListNode prev = temp;
        ListNode tail = temp.next;
        temp = head;
        tail.next = temp;
        head = tail;
        prev.next = null;
      }
      return head;  
    }
}