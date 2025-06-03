class Solution {
    boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        if(s.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
};