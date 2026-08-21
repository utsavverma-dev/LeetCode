class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character>mp=new HashMap<>();
        HashMap<Character,Character>rmp=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            if(mp.containsKey(s.charAt(i)))
            {
                if(mp.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            else{
                mp.put(s.charAt(i),t.charAt(i));
            }
            if (rmp.containsKey(t.charAt(i))) {
                if (rmp.get(t.charAt(i)) != s.charAt(i)) return false;
            } else {
                rmp.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}