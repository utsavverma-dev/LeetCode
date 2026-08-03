class Solution {
    public int maxProfit(int[] nums) {
        

        int minp=Integer.MAX_VALUE;
        int maxpr=0;

        for(int p: nums)
        {
            if(p<minp)
            {
                minp=p;
            }
            else{
                maxpr=Math.max(maxpr,p-minp);
            }
        }

        return maxpr;
    }
}