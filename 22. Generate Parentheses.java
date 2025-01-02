class Solution {
    ArrayList<String> l = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String b = new String("");
        makeparen(0,0,n,b);
        return l;
    }
    public void makeparen(int openpara,int closepara,int max,String curr)
    {
        if(openpara>max || closepara>max || closepara>openpara)
        {
            return;
        }
        if(openpara==max && closepara==max)
        {
            l.add(curr);
            return;
        }
        makeparen(openpara+1,closepara,max,curr+"(");
        makeparen(openpara,closepara+1,max,curr+")");

        return;

    }
}