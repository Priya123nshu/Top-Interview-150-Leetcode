class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> kk = new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    kk.add(i);
                    kk.add(j);
                }
            }
        }
        int len  = kk.size();
        for(int i=0;i<len;i=i+2)
        {
            int r = kk.get(i);
            int c = kk.get(i+1);
            for(int k=r;k<row;k++)
            {
                matrix[k][c]=0;
            }
            for(int k=r;k>=0;k--)
            {
                matrix[k][c]=0;
            }
            for(int k=c;k<col;k++)
            {
                matrix[r][k]=0;
            }
            for(int k=c;k>=0;k--)
            {
                matrix[r][k]=0;
            }
        }
        System.out.println(kk);
        
    }
}