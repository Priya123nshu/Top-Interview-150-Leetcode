class Solution {
    public Node copyRandomList(Node head) {
        Node k = new Node(23);
        Node r = k;
        Node temp = head;
        while(temp!=null)
        {
            Node l = new Node(temp.val);
            r.next = l;
            temp = temp.next;
            r = r.next;
        }
        temp = head;
        Node pemp = k.next;
        while(temp!=null)
        {
            if(temp.random==null)
            {
                pemp.random = null;
            }
            else
            {
                Node c = temp.random;
                int x = temp.val;
            }
            pemp = pemp.next;
            temp = temp.next;
        }
        return k.next;  
    }
}