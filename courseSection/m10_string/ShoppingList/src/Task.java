
public class Task {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome(1001));
    }

    public static boolean isPalindrome(String str) {

        //Write your solution here
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

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;  // Negative numbers are not palindromes
        }

        int reversed = 0;
        int original = num;

       //Write your solution here
        while (num != 0) {
            int digit = num % 10;          // take last digit
            reversed = reversed * 10 + digit; // build reversed number
            num /= 10;                     // drop last digit
        }
        return original == reversed;
    }

}