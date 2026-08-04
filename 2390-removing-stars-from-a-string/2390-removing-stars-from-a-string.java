class Solution {
    public String removeStars(String s) {
      Stack<Character>st=new Stack<>();

      for(int i=0;i<s.length();i++)
      {
        char c=s.charAt(i);
        if(c =='*' && !st.isEmpty())
        {
            st.pop();
        }
        else{
            st.push(c);
        }
      }  
      StringBuilder ss=new StringBuilder();
      while (!st.isEmpty()) {
    ss.append(st.pop());
}

      return ss.reverse().toString();
    }
}