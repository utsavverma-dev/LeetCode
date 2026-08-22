class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==1) return false;
        Arrays.sort(nums);
        int a=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[a]==nums[i])
            {
                return true;
            }
            else a++;
        }
        return false;
    }
}