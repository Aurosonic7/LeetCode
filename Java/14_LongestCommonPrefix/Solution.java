import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Solution {
  private static String longestCommonPrefix (String[] str) {
    if ( str == null || str.length == 0 ) return "";
    List<String> strList = Arrays.asList(str);
    Collections.sort(strList);
    String first = strList.get(0);
    String last = strList.get(strList.size() - 1);
    int i = 0;
    while ( i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) i++;
    return first.substring(0,i);
  }
  public static void main(String [] args) {
    String[] str = {"flower","flow","flight"};
    System.out.println(longestCommonPrefix(str));
  }
}