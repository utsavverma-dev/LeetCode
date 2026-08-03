class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();

        for(int n:nums)
        {
            if(mp.containsKey(n))
            {
                return true;
            }
            else{
                mp.put(n,0);
            }
        }
        return false;
    }
}