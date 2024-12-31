class Solution {
    public int maxArea(int[] height) {
        int str = 0;
        int end =height.length-1;
        int max = 0;
        while(str<end)
        {
            int base = end-str;
            int k = Math.min(height[str],height[end]);
            int area = base*k;
            max = Math.max(max,area);
            if(height[str]<height[end])
            {
                str++;
            }
            else
            {
                end--;
            }
        }
        return max;

    }
}