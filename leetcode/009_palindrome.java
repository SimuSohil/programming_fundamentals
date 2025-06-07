package leetcode;

/*
 * palindrome numbers:
 * The concept behind palindrome is that, when we reverse the digits of the given number, what we will be getting is the
 * same number.
 * 
 * Let us see some examples,
 * Example 1: '121' is a palindrome number.
 *            When we reverse the number we will still get '121'.
 * 
 * Example 2: '234' is not a palindrome number.
 *            when we reverse the number '234', we will be getting '432' which is not the same number.
 * 
 * Problem is to find out whether the given number is a palindrome or not. 
 * We have used Java to solve the problem.
 */

class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) return true; // base case 1 => '0' since it will always be a palindrome.
        if (x < 0 || x % 10 == 0) return false; // base case 2 => not consider (-) ve numbers and numbers that are divisible by 10 

        // Follow the procedure of reversing the digits. After reversing the digits, check whether the values are equal or not.
        int copy_num;
        int rem;
        int sum;

        sum = 0;
        copy_num = x;

        while (copy_num != 0) {
            rem = copy_num % 10;
            sum = rem + (sum * 10);
            copy_num = copy_num / 10;
        }

        if (sum == x) return true;

        return false;
    }
}