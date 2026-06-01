package array.Medium;
import java.util.*;
/*
Problem statement:The problem statemnt is to print the matrix in spiral format
Solution:We can travese from left to right from top to bottom and create a list and store them in the list
 */
public class sprial_matrix {
    public static void main(String[] args) {
        int[][] smatrix={{1,2,3},{4,5,6},{7,8,9}};
        int top=0; //to keep count of top row
        int bottom=smatrix.length-1; //to keep count of bottom row
        int left=0; //to keep left element
        int right=smatrix[0].length-1; //to keep right element
        List<Integer> result=new ArrayList<>();//creating an array list to store
        while(top<=bottom && left<=right){ //either top <= bottom and left<=right
            for(int i=left;i<=right;i++){
                result.add(smatrix[top][i]); //add first row
            }
            top++;//increase to next row because first row is added
            for(int i=top;i<=bottom;i++){
                result.add(smatrix[i][right]);   //add right last columns
            }
            right--; //decrease the right because we have added right column
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result.add(smatrix[bottom][i]);//to add botttom row from n-1;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(smatrix[i][left]); //from left to right
                }
                left++;
            }
        }
        System.out.print(result);
    }
    }

