class Solution {
    public int evalRPN(String[] tokens) {
        HashSet<String> k = new HashSet<>();
        k.add("+");
        k.add("-");
        k.add("*");
        k.add("/");
        int m = 0;
        Stack<Integer> l = new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            if(k.contains(tokens[i]))
            {
                int v = l.pop();
                int z = l.pop();
                System.out.println(v+" "+z);
                if(tokens[i].equals("+"))
                {
                    m = v+z;
                }
                if(tokens[i].equals("-"))
                {
                    m = z-v;
                }
                if(tokens[i].equals("*"))
                {
                    m = v*z;
                }
                if(tokens[i].equals("/"))
                {
                    m = z/v;
                }
                l.push(m);
                System.out.println();
                System.out.println(l.peek());
                System.out.println();
                continue;
            }
            Integer a = Integer.parseInt(tokens[i]);
            l.push(a);
            System.out.println(l.peek());
        }
        return l.pop();
    }
}