class Solution {
    public boolean isPalindrome(String s) {
        String cs = s.replaceAll("\\p{Punct}", "").replaceAll(" ","").toLowerCase();
        char[] sl = cs.toCharArray();
        // char[] arr = new char[sl.length];
        int idx = 0;
        for(int i = sl.length - 1 ; i >=0 ; i--){
            // arr[idx] = sl[i];
            if(sl[idx] != sl[i]){
                return false;
            }
            idx++;
        }
        // System.out.println("sl: " + Arrays.toString(sl));
        // System.out.println("arr: " + Arrays.toString(arr));
        // return Arrays.equals(sl,arr);
        return true;
    }
}
