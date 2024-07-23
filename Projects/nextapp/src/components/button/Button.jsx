"use client";
import React, { useState } from 'react';

const Button = ({text, url}) => {
  const [count, setCount] = useState(0);

  function handleClick() { console.log(count); setCount(count + 1); }

  return(
    <button onClick={handleClick} href={url} className=""> {text} </button>
  );
};

export default Button;