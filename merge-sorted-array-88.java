class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge = new int[m+n];
        int l1 = 0;
        int l2 = 0;
        int x = 0;
        while(l1<m && l2<n)
        {
            if(nums1[l1]<nums2[l2])
            {
                merge[x++] = nums1[l1++];
            }
            else
            {
                merge[x++] = nums2[l2++];
            }
        }
        while(l1<m)
        {
            merge[x++] = nums1[l1++];
        }
        while(l2<n)
        {
            merge[x++] = nums2[l2++];
        }
        for(int i=0;i<(m+n);i++)
        {
            nums1[i] = merge[i];
        }
    }
}