public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i <= str.length() / 2; i++) {  
            if (str.charAt(i) != str.charAt(str.length() - i)) { 
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome = true) {  
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
