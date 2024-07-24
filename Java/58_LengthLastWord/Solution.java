public class Solution {
  public int lengthOfLastWord(String s) {
    int length=0;
    for(int i = 0; i < s.length();)
      if(s.charAt(i++) != ' ') length++;
      else if (i < s.length() && s.charAt(i) != ' ') length = 0;
    return length;
  }

  public static void main (String [] args) {
    String s = "   fly me   to   the moon  ";
    Solution solution = new Solution();
    System.out.println(solution.lengthOfLastWord(s));
  }
}