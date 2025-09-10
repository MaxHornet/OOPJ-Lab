public class PalindromeRec {
     public static boolean isPalindrome(String s, int left, int right) {
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        System.out.println("Is Palindrome? " + isPalindrome(str, 0, str.length() - 1));
    }
}
