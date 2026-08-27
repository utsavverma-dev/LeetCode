class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character,Integer>mp=new HashMap<>();
       if(s.length()<=1)return s.length();

       int left=0;
       int right=0;
       int ans=0;
       for(;right<s.length();right++)
       {
        char c=s.charAt(right);
        while(mp.containsKey(c))
        {
            mp.remove(s.charAt(left));
            left++;
        }
        mp.put(s.charAt(right),1);
        ans=Math.max(ans,right-left+1);
       } 
       return ans;
    }
}