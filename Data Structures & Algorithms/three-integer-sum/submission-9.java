class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int num1 = 0 - nums[i];
            int j1 = i + 1;
            int j2 = nums.length-1;
            while(j1 < j2){
                if(nums[j1] + nums[j2] < num1){
                    j1++;
                }
                else if(nums[j1] + nums[j2] > num1){
                    j2--;
                }
                else{
                    List<Integer> ind = Arrays.asList(nums[i], nums[j1], nums[j2]);
                    if(!res.contains(ind)){
                        res.add(ind);
                    }
                    // j1++;
                    j2--;
                }
            }
        }
        return res;
    }
}
