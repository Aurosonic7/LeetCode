const longestCommonPrefix = (str) => {
  if (str === null || str.length === 0) return "";
  str.sort();
  let first = str[0];
  let last = str[str.length - 1];
  let i = 0;
  while ( i < first.length && first.charAt(i) === last.charAt(i)) i++;
  return first.substring(0, i);
};

let str = ["flower", "flow", "flight"];

console.log(longestCommonPrefix(str));

// console.log(longestCommonPrefix(str));