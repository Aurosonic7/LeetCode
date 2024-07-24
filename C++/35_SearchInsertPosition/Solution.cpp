#include<iostream>
#include<vector>
#include<algorithm>

int searchInsert(std::vector<int>& nums, int target) {
  if (nums.size() == 0) return 0;
  for( int i = 0; i < nums.size(); i++)
    if (nums[i] == target ) return i;
  nums.push_back(target);
  std::sort(nums.begin(), nums.end());
  for( int i = 0; i < nums.size(); i++)
    if (nums[i] == target ) return i;
  return -1;
}

int main ( void ) {
  std::vector<int> numbers = {1,3,5,6};
  int target = 5;
  std::cout<<searchInsert(numbers, target)<<std::endl;

  return 0;
}