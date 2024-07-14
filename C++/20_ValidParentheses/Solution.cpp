#include<iostream>
#include<cstring>
#include<stack>
#include<unordered_map>

bool isValid (std::string s) {
  std::stack<char> st;
  std::unordered_map<char, char> map;
  map.insert({')', '('});
  map.insert({']', '['});
  map.insert({'}', '{'});
  for (char& c : s) {
    if(map.find(c) != map.end()) {
      if (st.empty()) return false;
      char topElement = st.top();
      st.pop();
      if (topElement != map[c]) return false;
    } else st.push(c);
  }
  return st.empty();
}

int main ( void ) {
  std::cout<< (isValid("({})") ? "true" : "false") <<std::endl;

  return 0;
}