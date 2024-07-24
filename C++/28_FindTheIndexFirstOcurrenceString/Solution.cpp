#include<iostream>
#include<cstring>

int strStr(std::string haystack, std::string needle) {
  if(haystack.empty() && needle.empty()) return -1;
  return haystack.find(needle);
}

int main (void) {
  std::string haystack = "";
  std::string needle = "";

  std::cout<<strStr(haystack, needle)<<std::endl;

  return 0;
}