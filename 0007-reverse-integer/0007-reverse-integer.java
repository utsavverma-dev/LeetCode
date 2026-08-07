class Solution {
    public int reverse(int x) {
        boolean n1= x<0?true:false;
        long n= (long)x;
        if(n1){
        n=-n;
        }
        long rev=0;
        while(n>0)
        {
            rev=rev*10+(n%10);
            n=n/10;
        }

        if(n1)
        {
            rev=-rev;
        }
        if (rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE)
            return (int) rev;

        else return 0;
    }
}