
import java.util.Arrays;


public class Solution {

  public int removeElement(int[] numbers, int value) {
    if (numbers.length == 0) return 0;
    int[] aux = Arrays.stream(numbers).filter(i -> i != value).toArray();
    System.arraycopy(aux, 0, numbers, 0, aux.length);
    return aux.length;
  }
  public static void main(String [] args) {
    int[] numbers = {3,2,2,3};
    int value = 3;
    Solution solution = new Solution();
    int aux = solution.removeElement(numbers, value);
    System.out.println(aux);
    for (int i = 0; i < aux; i++) 
      System.out.print(numbers[i]);
  }
}