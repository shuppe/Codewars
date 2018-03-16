package com.codewars.kata_6kyu;
public class BasicOperations
{
  public Integer basicMath(String op, int v1, int v2)
  {
	  int retval = 0;
	  switch (op.charAt(0)) {
	  
	  	case '+': retval = v1 + v2;
			break;
	  	case '-': retval = v1 - v2;
			break;
	  	case '/': retval = v1 / v2;
			break;
	  	case '*': retval = v1 * v2;
	  
	  }
    return retval;
  }
}