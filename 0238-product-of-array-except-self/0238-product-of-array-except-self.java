class Solution {
    public int[] productExceptSelf(int[] nums) {
       int pro=1;
       int zc=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==0)
        {
            zc++;
        }
        else
        pro*=nums[i];
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
            {
                nums[i]=0;
            }
        }
       }
      else
       {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=0;
        }
       }
       
       return nums;

    }
}