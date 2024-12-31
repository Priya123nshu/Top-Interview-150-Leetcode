class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int rowb = 0;
       int rowe = matrix.length-1;
       int colb = 0;
       int cole = matrix[0].length-1;
       System.out.println(rowb + " "+ rowe+ " "+ colb+" "+cole);
       ArrayList<Integer> m = new ArrayList<Integer>();
       while(rowb<=rowe && colb<=cole)
       {
           for(int i=colb;i<=cole;i++)
           {
               m.add(matrix[rowb][i]);
           }
           rowb++;
           for(int i=rowb;i<=rowe;i++)
           {
               m.add(matrix[i][cole]);
           }
           cole--;
           if(rowb<=rowe)
           {
           for(int i=cole;i>=colb;i--)
           {
              m.add(matrix[rowe][i]);
           }
           rowe--;
           }
           if(colb<=cole)
           {
           for(int i =rowe;i>=rowb;i--)
           {
              m.add(matrix[i][colb]);
           }
           colb++;
           }
           
       }
       return m;
    }
}