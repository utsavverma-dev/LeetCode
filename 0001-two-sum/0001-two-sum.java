class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==1) return new int[]{-1,-1};
   HashMap<Integer,Integer>mp=new HashMap<>();
   int[] a=new int[2];
   for(int i=0;i<nums.length;i++)
   {
    if(mp.containsKey(target-nums[i]))
    {
       a[0]=i;
       a[1]=mp.get(target-nums[i]);
       return a;
    }
    else
    {
        mp.put(nums[i],i);
    }
   }
   return new int[]{-1,-1};
    }
}