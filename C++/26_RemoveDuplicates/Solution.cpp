#include<iostream>
#include<vector>

int removeDuplicates (std::vector<int>& nums) {
  if(nums.size() == 0) return 0;
  int aux = 1;
  for ( int i = 1; i < nums.size(); i++)
    if (nums[i-1] != nums[i]) {
      nums[aux] = nums[i];
      aux++;
    }
    return aux;
}

int main (void) {
  std::vector<int> nums = {1,1,2};
  std::cout<<removeDuplicates(nums)<<std::endl;;
  return 0;
}