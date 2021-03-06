public class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] arr = preorder.split(",");
        int diff = 1;
        for(String s : arr)
        {
            if(--diff<0)
            {
                return false;
            }
            if(!(s.equals("#")))
            {
                diff+=2;
            }
        }
        System.out.println(diff);
        return diff == 0;
    }
}