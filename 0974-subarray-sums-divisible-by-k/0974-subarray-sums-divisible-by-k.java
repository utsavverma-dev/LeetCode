class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        int s=0;
        int c=0;
        mp.put(0,1);
        for(int i:nums){
            s+=i;
            int rem=s%k;
            if(rem<0)
            rem+=k;
            if(mp.containsKey(rem))
            c+=mp.get(rem);

            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return c;
        
    }
}