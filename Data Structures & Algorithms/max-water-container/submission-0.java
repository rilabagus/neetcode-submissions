class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = 0;
        while(l < r){
            int h = Math.min(heights[r], heights[l]);
            int ca = h * Math.abs(r-l); 
            if(heights[r] > heights[l]){
                l++;
            }else{
                r--;
            }
            max = Math.max(ca,max);
        }
        return max;
    }
}
