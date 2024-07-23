#include<iostream>
#include<cstring>
#include<algorithm>
bool isPalindrome( int x ) {
  std::string str = std::to_string( x );
  std::string strInvertida (str.rbegin(), str.rend());
  return str == strInvertida;
}
int main ( void ) {
  size_t x = 121;
  std::cout<< ( isPalindrome( x ) ? "true" : "false" ) << std::endl;
  return 0;
}