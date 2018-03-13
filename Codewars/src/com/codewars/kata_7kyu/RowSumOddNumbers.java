package com.codewars.kata_7kyu;

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
    	
        return (int) Math.pow(n, 3);
    }
    
    public static int rowSumOddNumbersLong(int n) {
    	
    	int base = ((n*n)-n+1);
    	int solution = base*n;

    	for(int i = 1; i < n; i++)
    		solution = solution + 2*i;

        return solution;
    }
}