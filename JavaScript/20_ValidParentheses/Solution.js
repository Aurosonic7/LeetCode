const isValid = (s) => {
  const st = [];
  const map = {};
  map[')'] = '(';
  map[']'] = '[';
  map['}'] = '{';
  for ( let i = 0; i < s.length; i++) {
    const char = s[i];
    if (map[char]) {
      if (st.length === 0) return false;
      const topElement = st.pop();
      if(topElement !== map[char]) return false;
    } else st.push(char);
  }
  return st.length === 0;
};

console.log(isValid("(){}[]"));