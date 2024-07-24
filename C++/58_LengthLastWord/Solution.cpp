#include<iostream>
#include<cstring>

int lengthOfLastWord(std::string s) {
  int length = 0;
  for(int i = 0; s[i];)
    if(s[i++] != ' ') length++;
    else if (s[i] && s[i] != ' ') length=0;
  return length;
}

int main (void) {
  std::string s = "   fly me   to   the moon  ";
  std::cout << lengthOfLastWord(s) << std::endl;
  return 0;
}