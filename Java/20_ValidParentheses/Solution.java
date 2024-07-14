import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
  public boolean isValid (String s) {
    Stack<Character> st = new Stack<>();
    Map<Character, Character> map = new HashMap<>();
    map.put(')', '(');
    map.put('}', '{');
    map.put(']', '[');
    for (char c : s.toCharArray()) {
      if (map.containsKey(c)) {
        if (st.isEmpty()) return false;
        char topElement = st.pop();
        if (topElement != map.get(c)) return false;
      }else st.push(c);
    }
    return st.isEmpty();
  }
  public static void main(String [] args) {
    Solution solution = new Solution();
    System.out.println(solution.isValid("({})"));
  }
}