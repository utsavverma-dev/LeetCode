class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        int a=0;
        int  b=0;
        for(int i=0;i<nums.length;i++)
        {
           if(mp.containsKey(nums[i]))
           {
              a=mp.get(nums[i]);
              b=i;
              if(Math.abs(a-b)<=k)
              return true;
              else
              mp.put(nums[i],i);
           }
           else{
            mp.put(nums[i],i);
           }
        }
        return false;
    }
}