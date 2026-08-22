class Solution {
    public String reverseWords(String s) {
        char[] c=s.toCharArray();

        
        int i=0;
        int j=0;

        while(i<c.length && j<c.length)
        {
            if(c[j]!=' ')
            j++;

            else{
            int t=j;
            j=j-1;
            while(i<j){
                char ch=c[i];
                c[i]=c[j];
                c[j]=ch;
                i++;
                j--;
            }
            i=t+1;
            j=i;
            }
        }
        j = c.length - 1;

        while (i < j) {
            char ch = c[i];
            c[i] = c[j];
            c[j] = ch;

            i++;
            j--;
        }

        String sb=new String(c);
        return sb;
    }
}