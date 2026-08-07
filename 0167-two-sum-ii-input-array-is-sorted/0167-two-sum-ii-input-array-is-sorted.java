class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++)
        {
            int a=bs(nums,i+1,nums.length-1,target-nums[i]);
            if(a!=-1)
            {
            return new int[] {i+1,a+1};
            }
        }
        return new int[] {-1,-1};
    }

    int bs(int[] nums,int l,int h,int t)
    {
        if(l>h) return -1;

        int mid=(l+h)/2;

        if(nums[mid]==t)
        {
        
        return mid;
        }

        else if(nums[mid]>t)
        return bs(nums,l,mid-1,t);

        else
        return bs(nums,mid+1,h,t);
    }
}