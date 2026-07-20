class Solution {
    public boolean isPalindrome(String s) {
        // String r = "";

        // for (int i = 0; i < s.length(); i++){
            
        //     // prepend each character
        //     r = s.charAt(i) + r; 
        // }
        // if(s.equals(r)){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString(); 
        return cleaned.equals(reversed);
    }
}
