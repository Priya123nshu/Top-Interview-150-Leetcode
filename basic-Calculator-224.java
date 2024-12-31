class Solution {
    public int calculate(String s) {
        int n = s.length();
        Stack<Integer> k = new Stack<>();
        int number = 0;
        int result = 0;
        int sign = 1;
        HashSet<Character> l = new HashSet<>();
        l.add('0');
        l.add('1');
        l.add('2');
        l.add('3');
        l.add('4');
        l.add('5');
        l.add('6');
        l.add('7');
        l.add('8');
        l.add('9');

        for(int i=0;i<n;i++)
        {
            if(l.contains(s.charAt(i)))
            {
                number = number*10 + (s.charAt(i)-'0');
            }
            else if(s.charAt(i)=='+')
            {
                result = result+(number*sign);
                number=0;
                sign = 1;
            }
            else if(s.charAt(i)=='-')
            {
                result = result+(number*sign);
                number = 0;
                sign =-1;
            }
            else if(s.charAt(i)=='(')
            {
                k.push(result);
                k.push(sign);
                number = 0;
                result = 0;
                sign=1;
            }
            else if(s.charAt(i)==')')
            {
                result = result+(number*sign);   
                number = 0;

                int ss = k.peek();
                k.pop();
                int lr = k.peek();
                k.pop();
                result = result*ss;
                result = result +lr;         
            }
        }
        result = result+(number*sign); 
        return result;

    }
}