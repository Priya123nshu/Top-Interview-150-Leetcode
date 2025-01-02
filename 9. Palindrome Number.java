class Solution {
    public boolean isPalindrome(int x) {
       String j = Integer.toString(x);
       System.out.println(j);
       int m = j.length();
       char[] arr = new char[m];
       int k =0;
       for(int i=m-1;i>=0;i--)
       {
           arr[i] = j.charAt(k++);
       }
       String hh= new String("");
       for(int i=0;i<arr.length;i++)
       {
           hh = hh+arr[i];
       }
       return j.equals(hh);
    }
}