class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] r = new int[n];

        int ln = 1; int rn = 1;
        for(int i = 0; i < n; i++){
            r[i] = ln;
            ln *= nums[i];
            System.out.println("r: " + r[i]);
        }

        System.out.println("r: " + Arrays.toString(r));
        for(int i = n - 1; i >= 0; i--){
            r[i] *= rn;
            rn *= nums[i];
            System.out.println("r: " + r[i]);
        }


        // for(int i = 0; i < nums.length; i++){
        //     res[]
        // }
        return r;

    }
}  
