class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        // return f(text1,text2,text1.length()-1,text2.length()-1);

        // Approach 2

        int[][] memo=new int [text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++)
        {
            for(int j=0;j<text2.length();j++)
            {
                memo[i][j]=-1;
            }
        }
        return f(text1,text2,text1.length()-1,text2.length()-1, memo);
    }

        // Approach 3 Tabulation 
        // int[][]dp=new int[text1.length()+1][text2.length()+1];

        // for(int i=1;i<text1.length()+1;i++){
        //     for(int j=1;j<text2.length()+1;j++)
        //     {
        //         if(text1.charAt(i-1)==text2.charAt(j-1))
        //         dp[i][j]=1+dp[i-1][j-1];

        //         else
        //         dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);

        //     }
        // }

        // return dp[text1.length()][text2.length()];

        // Approach 4 SpaceOptimisation DP
    //     int m=text1.length();
    //     int n=text2.length();
    //     int[]pdp=new int[text2.length()+1];

    //     for(int i=1;i<text1.length()+1;i++){
    //          int[]cdp=new int[text2.length()+1];
    //         for(int j=1;j<text2.length()+1;j++)
    //         {
    //             if(text1.charAt(i-1)==text2.charAt(j-1))
    //             cdp[j]=1+pdp[j-1];

    //             else
    //             cdp[j]=Math.max(pdp[j],cdp[j-1]);
    //         }
    //         pdp=cdp;
    //     }

    //     return pdp[text2.length()];
    // }

    // int f(String t1,String t2,int i, int j)
    // {
    //     if(i<0 || j<0)
    //     return 0;

    //     if(t1.charAt(i)== t2.charAt(j))
    //     return 1+f(t1,t2,i-1,j-1);

    //     else 
    //     return Math.max(f(t1,t2,i-1,j),f(t1,t2,i,j-1));
    // }
    int f(String t1,String t2,int i, int j,int[][] memo)
    {
        if(i<0 || j<0)
        return 0;

        if(memo[i][j]!=-1)
        return memo[i][j];

        if(t1.charAt(i)== t2.charAt(j))
          memo[i][j]=1+f(t1,t2,i-1,j-1,memo);

        else 
         memo[i][j]=Math.max(f(t1,t2,i-1,j,memo),f(t1,t2,i,j-1,memo));

         return memo[i][j];
    }
}
