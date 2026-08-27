class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer>mp=new HashMap<>(); 
       int c=0;
       int sum=0;
       mp.put(0,1);
       for(int i=0;i<nums.length;i++)
       {
        sum+=nums[i];
        if(mp.containsKey(sum-k))
        {
            c+=mp.get(sum-k);
        }

        mp.put(sum,mp.getOrDefault(sum,0)+1);
       }
       return c;

    }
}