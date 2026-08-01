class Solution {
public:
    int mySqrt(int x) {
        
        long i=1,j=x;
        long ans=0;

        while(i<=j)
        {
            long mid=(i+j)/2;

            if((mid*mid) <= x)
            {
                ans=mid;
                i=mid+1;
            }
            else j=mid -1;
        }
        return (int)ans;
    }
};