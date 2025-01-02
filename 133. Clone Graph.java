class Solution {
    HashMap<Node,Node> m = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null)
        {
            return null;
        }
        if(m.containsKey(node))
        {
            return m.get(node);
        }
        Node cloneNode = new Node(node.val);
        m.put(node,cloneNode);
        for(Node nbr:node.neighbors)
        {
            cloneNode.neighbors.add(cloneGraph(nbr));
        }
        return cloneNode;
    }
}