class Solution {
    public void rotate(int[] nums, int k) {

        k=k%nums.length;
       swap(nums,0,nums.length-1);
       swap(nums,0,k-1);
       swap(nums,k,nums.length-1);
       
    }

    void swap(int[] nums,int s,int e)
    {
        while(s<e)
        {
            int temp=nums[e];
            nums[e]=nums[s];
            nums[s]=temp;
            e--;
            s++;
        }
    }
}