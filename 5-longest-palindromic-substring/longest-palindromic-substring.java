class Solution {
    public String longestPalindrome(String s) {
        // Handle null or empty string case
        if (s == null || s.length() == 0) {
            return "";
        }
        
        // Initialize pal to the first character and size to 1.
        // This ensures single-character palindromes are handled correctly.
        String pal = s.substring(0, 1);
        int size = 1;
        
        // Outer loop to define the starting index
        for (int i = 0; i < s.length(); i++) {
            // Inner loop to define the ending index (exclusive)
            // It starts at i + 1, so the first substring checked for a given 'i'
            // is the two-character string s.substring(i, i+1), which is s.charAt(i).
            // NOTE: The previous code started j at i+1, so it missed the single character substring.
            // Let's adjust j to start from 'i' to explicitly include the single character, 
            // OR keep the existing structure and rely on the corrected initialization.
            
            // Sticking close to original structure and using corrected initialization:
            // The inner loop (j=i+1) will miss single characters, 
            // but the initialization (pal=s.substring(0, 1), size=1) covers the minimum case.
            
            for (int j = i + 1; j <= s.length(); j++) {
                String x = s.substring(i, j);
                
                if (palindrome(x) && x.length() > size) {
                    size = x.length();
                    pal = x;
                }
            }
        }
        
        return pal;
    }
    
    // Helper method to check if a string is a palindrome
    public boolean palindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}