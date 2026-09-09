class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            mp.put(s.charAt(i),i);
        }

        
        int maxp=0;
        int maxi=0;
        int size=0;
        List<Integer> l = new ArrayList<>(); 
        for(int i = 0; i < s.length(); i++) {
             int j = mp.get(s.charAt(i)); 
             if(j > maxi)
              { 
                maxi = j;
                 } 
                 if(i == maxi) {
                     l.add(maxi - maxp + 1);
                      maxp = maxi + 1;                        
        } 
        }
        return l; 
    }
}