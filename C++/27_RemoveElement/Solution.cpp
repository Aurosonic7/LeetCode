#include<iostream>
#include<vector>

int removeElement(std::vector<int>& nums, int val) {
  if(nums.size() == 0) return 0;
  for ( int i = 0; i < nums.size(); i++ ) 
    if(nums[i] == val) { 
      nums.erase(nums.begin() + i); 
      i--;
    }
  return nums.size();
}

int main (void) {
  std::vector<int> nums = {3,2,2,3};
  int val = 3;
  int tamaño = removeElement(nums, val);
  std::cout << "Tamaño: " << tamaño << std::endl;

  for (auto i: nums) std::cout << i << " ";

  return 0;
}