class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zc=0;
        int pro=1;

        for(int n:nums)
        {
            if(n==0)
            {
                zc++;
            }
            else
            pro=pro*n;
        }


        if(zc==0)
        {
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=pro/nums[i];
            }

        }
        else if(zc==1)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==0)
                {
                    nums[i]=pro;
                }
                else
                nums[i]=0;
            }
        }

        else{
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=0;
            }
        }

        return nums;
    }
}