import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
  public int searchInsert(int[] numbers, int target) {
    if (numbers.length == 0) return 0;
    List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.<Integer>toList());
    for (int i = 0; i < list.size(); i++)
      if(list.get(i) == target) return i;
    list.add(target);
    Collections.sort(list);
    for (int i = 0; i < list.size(); i++)
      if(list.get(i) == target) return i;
    return -1;
  }
  public static void main(String[] args) {
    int[] nums = {1,3,5,6};
    int target = 7;
    Solution solution = new Solution();
    System.out.println(solution.searchInsert(nums,target));
      
  }
}