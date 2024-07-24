public class Solution {
  public int strStr (String haystack, String needle) {
    if(haystack.isEmpty() && needle.isEmpty()) return -1;
    return haystack.indexOf(needle);
  }

  public static void main (String [] args) {
    String haystack="sadbutsad", needle="sad";
    Solution solution = new Solution();
    int position = solution.strStr(haystack, needle);
    System.out.println(position);
  }
}