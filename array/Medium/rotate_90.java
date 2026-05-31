package array.Medium;
/*
 Problem Statement:We have to rotate array by 90 degree clockwise.
 Solution:If the problem is to rotate 90 degree clockwise we can transpose and reverse the row
          If the problem is to rotate 90 degree Anti-clockwise we can transpose and reverse the column

 */
public class rotate_90 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate_90 obj=new rotate_90();
        obj.transpose(matrix);
        obj.reverse(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

    void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    void reverse(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix.length - 1;
            while (left <= right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
