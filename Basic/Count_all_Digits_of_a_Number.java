/*You are given an integer n. You need to return the number of digits in the number.



The number will have no leading zeroes, except when the number is 0 itself.


        Example 1

Input: n = 4 

Output: 1

Explanation: There is only 1 digit in 4.

Example 2

Input: n = 14

Output: 2

Explanation: There are 2 digits in 14.*/
import java.util.*;
public class Count_all_Digits_of_a_Number {
public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    // Method one String a=String.valueOf(n);
    // System.out.print(a.length());
    //Method 2
    int count=0;
    if(n==0){
        count=1;
    }
    else{
    while(n!=0) {
        n /= 10;
        count++;

    }
    }
    System.out.print(count);
}
}
