public class Solution {
  private static boolean isPalindrome( Integer x ) {
    String str = Integer.toString(x);
    String strInvertida = new StringBuilder(str).reverse().toString();
    return str.equals(strInvertida);
  }
  public static void main(String [] args) {
      Integer x = 121;
      System.out.println(isPalindrome(x));
  }

}