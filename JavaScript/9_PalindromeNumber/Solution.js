const isPalindrome = (x) => {
  let str = x.toString();
  let strInverse = str.split('').reverse().join('');
  return str === strInverse;
};

let x = 122;
console.log(isPalindrome(x));