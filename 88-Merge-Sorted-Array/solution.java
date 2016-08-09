public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int d = (m+n-1);
        int i = m-1;
        int j = n-1;
        while(i>=0 && j >=0)
        {
            if(nums1[i]>=nums2[j])
            {
                nums1[d--] = nums1[i--];
            }
            else
            {
                nums1[d--] = nums2[j--];
            }
        }
        if(i<0)
        {
            while(j>=0)
            {
                nums1[d--] = nums2[j--];
            }
        }
    }
}