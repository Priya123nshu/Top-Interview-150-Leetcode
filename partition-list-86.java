class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        if(size==0)
        {
            return head;
        }
        if(size==1)
        {
            return head;
        }
        temp = head;
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            int z = temp.val;
            if(z<x)
            {
                small.add(z);
            }
            else
            {
                greater.add(z);
            }
            temp = temp.next;
        }
        temp=head;
        for(int i=0;i<small.size();i++)
        {
            ListNode h = new ListNode(small.get(i));
            temp.next = h;
            temp = h;
        }
        for(int i=0;i<greater.size();i++)
        {
            ListNode h = new ListNode(greater.get(i));
            temp.next = h;
            temp = h;
        }
        head = head.next;
        return head;
    }
}