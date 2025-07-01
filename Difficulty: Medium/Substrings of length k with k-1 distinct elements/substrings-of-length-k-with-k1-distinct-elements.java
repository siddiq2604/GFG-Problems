class Solution {
    public int substrCount(String S, int K) {
        // code here
        HashMap<Character, Integer> hash = new HashMap<>();
        
        int i=0, count=0, j=0;
        while(i < S.length()) {
            if(i<K) {
                hash.put(S.charAt(i), hash.getOrDefault(S.charAt(i), 0) + 1);
                i++;
                
                count = hash.size() == K - 1 && i == K ? count + 1 : count;
            } else {
                char ch = S.charAt(j);
                char ch2 = S.charAt(i);
                
                if(hash.containsKey(ch)) {
                    int temp = hash.get(ch);
                    temp--;
                    
                    if(temp>0) {
                        hash.put(ch, temp);
                    } else {
                        hash.remove(ch);
                    }
                }
                
                hash.put(ch2, hash.getOrDefault(ch2, 0) + 1);
                i++;
                j++;
                
                if(hash.size() == K - 1) {
                    count++;
                }
            }
        }
        
        return count;
    }
}