class Solution {
    public String longestString(String[] arr) {
        // code here
        Arrays.sort(arr);
        
        Set<String> good = new HashSet<>();
        String answer = "";
        
        for (String w : arr) {
          
            if (w.length() == 1 || good.contains(w.substring(0, w.length() - 1))) {
                good.add(w);
               
                if (w.length() > answer.length()) {
                    answer = w;
                }
            }
        }
        
        return answer;
    }
}
