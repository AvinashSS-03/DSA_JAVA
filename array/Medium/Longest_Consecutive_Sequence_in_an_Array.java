package array.Medium;

import java.util.HashSet;

/*
Problem Statement:Check the longest consecutinve sequece in a Array and return the length of the longest sequence
Solution:Approach one:we can sort the array and check the sequence like x+1,
Approach 2:using set we can solve easily like time complexity o(n)
first add all the element to the set
and check if n-1 exist if exist there is no sequence if the number can be sequence and check for n+1
 */
public class Longest_Consecutive_Sequence_in_an_Array {
    public static void main(String[] args) {
        int[]arr={100,4,200,1,3,2};
        int longest=1;
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        };
       for(int num:set){
           if(!set.contains(num-1)){
               int current=num;
               int length=1;
               while(set.contains(current+1)){
                   current++;
                   length++;
               }
               longest=Math.max(length,longest);
           }
       }
       System.out.print(longest);
    }
}
