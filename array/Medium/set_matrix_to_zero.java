package array.Medium;

import java.util.Arrays;
/*
Problem statement:Set the row and column to zero  where 0 occurs as index;
Solution:create  new two arrays and store the index where the value index becomes 0
and change when row and column =0 entire row and entire column becomes 0
 */
public class set_matrix_to_zero {
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        int rlen=matrix.length;
        int clen=matrix[0].length;
        int[] row=new int[rlen];
        int[] col=new int[clen];
        for(int i=0;i<rlen;i++){
            for(int j=0;j<clen;j++){
                if(matrix[i][j]==0){
                    row[i]=8;
                    col[j]=8;
                }
            }
        }

        for(int i=0;i<rlen;i++){
            for(int j=0;j<clen;j++){
                if(row[i]==8 || col[j]==8){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<rlen;i++){
            for(int j=0;j<clen;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
