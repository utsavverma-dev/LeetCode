class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>l=new ArrayList<>();
        List<Integer>a=new ArrayList<>();
        allSubset(nums,a,l,0);
        return l;
    }

    void allSubset(int[] nums,List<Integer>a,List<List<Integer>>l,int i){
       
       if(i==nums.length)
       {
            l.add(new ArrayList<>(a));
            return;
       }


       a.add(nums[i]);
       allSubset(nums,a,l,i+1);
       a.remove(a.size()-1);
       int u=i+1;
       while(u<nums.length && nums[u]==nums[u-1])
         u++;
       allSubset(nums,a,l,u);
    }
}