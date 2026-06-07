class Solution {
    public int lengthOfLongestSubstring(String s) {
        String res = "";
        int max = 0;
        Queue<String> q = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            q.add(s.substring(i, i == s.length() ? i : i+1));
        }

        System.out.println(q.isEmpty());
        while (!q.isEmpty()) {
            String ch = q.poll();

            if(res.contains(ch)){
                res = res.substring(res.indexOf(ch)+1);
            }
            res += ch;
            max = Math.max(max, res.length());
        }
        return max;
    }
}
