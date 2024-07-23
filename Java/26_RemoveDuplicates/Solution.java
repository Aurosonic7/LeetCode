
public class Solution {
  public int removeDuplicates (int[] numbers) {
    if ( numbers.length == 0) return 0;
    int aux = 1;
    for (int i = 1; i < numbers.length; i++) 
      if (numbers[i-1] != numbers[i]) {
          numbers[aux] = numbers[i];
          aux++;
      }
    return aux;
  }
  public static void main(String [] args) {
    int[] numbers = {0,0,1,1,1,2,2,3,3,4};
    Solution solution = new Solution();
    int n = solution.removeDuplicates(numbers);
    System.out.println(n);
  }
}