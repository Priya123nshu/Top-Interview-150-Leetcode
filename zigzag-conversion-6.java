class Solution {
    public String convert(String s, int numRows) {
        int k = s.length();
        if(numRows==1 || numRows>=k)
        {
            return s;
        }
        Character[][] x = new Character[numRows][k];
        int loc = 0;
        boolean direction = false;
        for(int i=0;i<k;i++)
        {
            x[loc][i]  = s.charAt(i);
            if(loc==0 || loc==numRows-1)
            {
                direction = !(direction);
            }
            loc += direction? +1 : -1;
        }
        StringBuilder o = new StringBuilder();
        for(int i=0;i<numRows;i++)
        {
            for(int j=0;j<k;j++)
            {
                if(x[i][j] != null)
                {
                    o.append(x[i][j]);
                }
            }
        }
        return o.toString();
    }
}