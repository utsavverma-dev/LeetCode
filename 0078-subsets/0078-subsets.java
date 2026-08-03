class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        allSubset(nums,new ArrayList<>(),list,0);
        return list;
    }

     void allSubset(int[] nums,List<Integer>a,List<List<Integer>>list,int i){
        if(i==nums.length)
        {
            list.add(new ArrayList<>(a));
            return;
        }

        a.add(nums[i]);
        allSubset(nums,a,list,i+1);
        a.remove(a.size()-1);
        allSubset(nums,a,list,i+1);
     }
}