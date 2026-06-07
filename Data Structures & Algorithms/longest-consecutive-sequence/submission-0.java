class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Integer pos = Integer.MIN_VALUE;
        Integer maxSeq = 1;
        Integer seq = 1;
        Set<Integer> set = Arrays.stream(nums)
                         .boxed()
                         .collect(Collectors.toCollection(TreeSet::new));
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            Integer num = itr.next();
            if(Math.abs(pos - num) == 1){
                seq++;
                if(seq > maxSeq){
                    maxSeq = seq;
                }
            }
            else{
                seq = 1;
            }
            pos = num;
        }
        return maxSeq;
    }
}
