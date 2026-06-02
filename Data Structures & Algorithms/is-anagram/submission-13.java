class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for(Character c : sArray){
            if(!sMap.containsKey(c)){
                sMap.put(c,1);
            }else{
                sMap.put(c, sMap.get(c) + 1);
            }
        }
        for(Character c : tArray){
            if(!tMap.containsKey(c)){
                tMap.put(c,1);
            }else{
                tMap.put(c, tMap.get(c) + 1);
            }
        }
        for(Character key : sMap.keySet()){
            if(tMap.containsKey(key) && tMap.get(key).equals(sMap.get(key))){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
