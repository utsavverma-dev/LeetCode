class Solution {
    public void moveZeroes(int[] nums) {
      if(nums.length==1) return ;
        int i=0;
        int j=i+1;
        int n=nums.length;

        while(i<n && j<n)
        {
            if(nums[i]==0 && nums[j]==0)
            j++;

            else if(nums[i]!=0 &&  nums[j]==0)
              { i++; j++;}

            else if(nums[i]==0 && nums[j]!=0)
             {
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
                j++;
             }

            else
            {
                i++;j++;
            }

        }
    }
}