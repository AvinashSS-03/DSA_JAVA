package array.Hard;

import java.util.ArrayList;

/*
Problem statement:You have to create a Pascale's triangle that mean if the number is 5
 the pascale's is
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
Solution: when we look into this array we can find a patter like 5C4(It is a formula)what we can do is every row is multiplied by row-col
and num divide by col+1
SIMPLE FORMULA: ans*(row-column)/(col+1);
 */
import java.util.*;
public class Pascals_triangle {
    public static void main(String[] args) {
        int num=5;
        List<Integer> lst=new ArrayList<>();
        for(int row=0;row<num;row++){ //we are not iterating from one because we need to caluclate the first value that's why if i put 1 1-1==0 so no value thats why 0 has been kept

            int ans=1;
            for(int col=0;col<=row;col++){
                lst.add(ans);//why we are adding first? becuaase in up we ave reduced one length so to compensate that we are adding in fron itself and to avoid 0's
                ans=ans*(row-col)/(col+1); //importtant formula
            }
        }
        System.out.print(lst);
    }

}
