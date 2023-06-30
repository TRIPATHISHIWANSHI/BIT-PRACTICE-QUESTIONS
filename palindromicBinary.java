public class palindromicBinary {
    public int solve(int A) {
        if (A == 1) {
            return 1; // The first palindrome binary number is 1
        }

        int count = 1; // Counter for palindrome binary numbers
        int number = 1; // Current number
        
        while (count < A) {
            number++;
            
            // Convert the number to binary
            String binary = Integer.toBinaryString(number);
            
            // Check if the binary representation is a palindrome
            if (isPalindrome(binary)) {
                count++;
            }
        }
        
        return number;
    }
    
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
