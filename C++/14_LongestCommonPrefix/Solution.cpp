#include<iostream>
#include<vector>
#include<cstring>
#include<algorithm>

std::string longestCommonPrefix (std::vector<std::string>& str) {
  if (str.size() == 0) return "";
  std::sort(str.begin(), str.end());
  std::string first = str[0];
  std::string last = str[str.size()-1];
  int i = 0;
  while ( i < first.size() && first[i] == last[i] ) i++;
  
  return first.substr(0, i);
}

int main ( void ) {
  std::vector<std::string> str = {"christian", "chris", "christina"};
  std::cout<<longestCommonPrefix(str)<<std::endl;
  return 0;
}