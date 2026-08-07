class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int d=0;
        int rev=0;
        while(n>0)
    {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
    }
    return rev==x?true:false;

    }
}