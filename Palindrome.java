import java.util.*;

public class Palindrome {
  public static boolean isPalindrome(String str) {
    int n = str.length();
    for(int i=0; i<n; i++) {
      if(str.charAt(i) == str.charAt(n-1-i)) {
        return true;
      }
    }
    return false;
  }
  public static void main(String args[]) {
    String str = "racecar";

    System.out.println(isPalindrome(str));
  }
}
