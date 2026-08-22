class Solution {
    public int maxProfit(int[] prices) {
        int minpr=Integer.MAX_VALUE;
        int maxpr=0;

        for(int i:prices)
        {
            if(i<minpr)
            {
                minpr=i;
            }
            else{
                maxpr=Math.max(maxpr,i-minpr);
            }
        }
        return maxpr;
    }
}