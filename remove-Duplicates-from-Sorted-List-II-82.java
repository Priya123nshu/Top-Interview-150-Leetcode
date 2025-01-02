class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        if(head.next.next==null)
        {
            if(head.val==head.next.val)
            {
                head = null;
            }
            return head;
        }
        ListNode temp = head;
        int count = 0;
        ListNode slow = head;
        ListNode fast = head.next;
        HashSet<Integer> ph = new HashSet<>();
        while(temp.next!=null)
        {
            if(temp.val==temp.next.val)
            {
                ph.add(temp.val);
            }
            temp = temp.next;
        }
        System.out.println(ph);
        temp = head;
        while(fast!=null)
        {
            if(ph.contains(fast.val))
            {
                while(fast!=null && ph.contains(fast.val))
                {
                    count++;
                    fast = fast.next;
                }
                if(fast==null)
                {
                    slow.next = null;
                }
                else{
                for(int i=0;i<count;i++)
                {
                    slow.next = slow.next.next;
                }
                }
                count =0;
            }
            else
            {
                fast =  fast.next;
                slow =  slow.next;
            }
        }
        System.out.println(fast+" "+slow);
        if(ph.contains(head.val))
        {
            head = head.next;
        }
        //System.out.println(ph);
        return head;
    }
}