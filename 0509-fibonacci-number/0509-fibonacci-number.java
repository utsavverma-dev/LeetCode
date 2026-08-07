class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        return fib2(dp,n);
    }

    int fib2(int[] dp ,int n)
    {
       if(n==0 || n==1)
         return n;

       if(dp[n]!=0)
       return dp[n];
       
       dp[n] = fib2(dp, n-1) + fib2(dp, n-2);
       return dp[n];
    }
}